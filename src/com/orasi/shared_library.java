/**
 * @version 107
 *
 */
 package com.orasi;
 
 import java.util.*;
 import java.util.function.*;
 import java.io.*;
 import java.lang.reflect.*;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.openqa.selenium.*;
 import org.openqa.selenium.interactions.*;
 import org.openqa.selenium.remote.*;
 import org.openqa.selenium.support.ui.*;
 import java.util.regex.*;
 import com.orasi.datasource.*;
 import com.orasi.alchemy.mediation.execution.*;
 import java.util.concurrent.atomic.AtomicInteger;
 import com.orasi.event.*;
 import com.orasi.event.chain.*;
 import com.orasi.event.handler.EventHandler;
 import com.orasi.model.*;
 import java.time.*;
 
 public class shared_library
 {
    private static Logger log = LoggerFactory.getLogger(shared_library.class );
 
    private static final Pattern CONTEXT_REGEX = Pattern.compile( "\\$\\{([^}]*)\\}" );
 

    private static final AtomicInteger testCounter = new AtomicInteger();
    private static final AtomicInteger stepCounter = new AtomicInteger();

    public static final int getTestCounter() {
      return testCounter.incrementAndGet();
    }

    public static final int getStepCounter() {
      return stepCounter.incrementAndGet();
    }
 

 private static EventChain eventChain = new EventChain();

 public static void addEventHandler( EventHandler eventHandler ) {
   eventChain.addEventHandler(eventHandler);
 }

 public static void notifyListeners( Event e ) {
   
   eventChain.handle( e );
 }

  private static List<Throwable> getThrowableList(Throwable throwable) {
    final List<Throwable> list = new ArrayList<>();
    while (throwable != null && !list.contains(throwable)) {
      list.add(throwable);
      throwable = throwable.getCause();
    }
    return list;
  }

  private static Throwable getRootCause(final Throwable throwable) {
    final List<Throwable> list = getThrowableList(throwable);
    return list.isEmpty() ? throwable : list.get(list.size() - 1);
  }

 
 
 /**
 * Initial Implementation - Added Threshold as a new variable allowing for partial string match
 */
 public static void Match_Value_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String Expected_Value = (String) variableMap.get( "Expected Value" );
 
   String Expected_Source = (String) variableMap.get( "Expected Source" );
 
   String Actual_Value = (String) variableMap.get( "Actual Value" );
 
   String Actual_Source = (String) variableMap.get( "Actual Source" );
 
   By Expected_Locator = (By) variableMap.get( "Expected Locator" );
 
   By Actual_Locator = (By) variableMap.get( "Actual Locator" );
 
   Long Threshold = null;
   Number _Threshold = (Number) variableMap.get( "Threshold" );
   if ( _Threshold != null ) Threshold = _Threshold.longValue();
 

 String leftSide = null;
String rightSide = null;

if ( "Locator".equals( Actual_Source ) ) {
  WebElement targetElement;
  try {
    targetElement = webDriver.findElement(Actual_Locator);
    
    if ( targetElement.getTagName() == null ) {
      leftSide = targetElement.getText();
    } else {
      switch (targetElement.getTagName().toUpperCase())
      {
        case "IMG":
          leftSide = targetElement.getAttribute("src");
          break;
        case "INPUT":
        case "TEXTAREA":
          leftSide = targetElement.getAttribute("value");
          break;
        case "SELECT":
          leftSide = new Select(targetElement).getFirstSelectedOption().getText();
          break;
        default:
          leftSide = targetElement.getText();
          break;
      }
    }
  } catch (Exception e) {
    throw new IllegalArgumentException( "Unable to locate element", e );
  }
} else if ( "Value".equals( Actual_Source ) ) {
  leftSide = Actual_Value;
}

if ( "Locator".equals( Expected_Source ) ) {
  WebElement targetElement;
  try {
    targetElement = webDriver.findElement(Expected_Locator);
    
    if ( targetElement.getTagName() == null ) {
      rightSide = targetElement.getText();
    } else {
      switch (targetElement.getTagName().toUpperCase())
      {
        case "IMG":
          rightSide = targetElement.getAttribute("src");
          break;
        case "INPUT":
        case "TEXTAREA":
          rightSide = targetElement.getAttribute("value");
          break;
        case "SELECT":
          rightSide = new Select(targetElement).getFirstSelectedOption().getText();
          break;
        default:
          rightSide = targetElement.getText();
          break;
      }
    }
  } catch (Exception e) {
    throw new IllegalArgumentException( "Unable to locate element", e );
  }
} else if ( "Value".equals( Expected_Source ) ) {
  rightSide = Expected_Value;
}

boolean isEqual = false;
String reason = "";
if ( leftSide == null || rightSide == null ) {
  isEqual = false;
} else {


int useValue = -1;
    
    int n = leftSide.length();
    int m = rightSide.length();

    if (n == 0) {
      useValue = m;
    }
    if (m == 0) {
      useValue = n;
    }

    if (n > m) {
      final String tmp = leftSide;
      leftSide = rightSide;
      rightSide = tmp;
      n = m;
      m = rightSide.length();
    }

    final int[] p = new int[n + 1];


    int i;
    int j;
    int upperLeft;
    int upper;

    char rightJ; // jth character of right
    int cost; // cost

    for (i = 0; i <= n; i++) {
      p[i] = i;
    }

    for (j = 1; j <= m; j++) {
      upperLeft = p[0];
      rightJ = rightSide.charAt(j - 1);
      p[0] = j;

      for (i = 1; i <= n; i++) {
        upper = p[i];
        cost = leftSide.charAt(i - 1) == rightJ ? 0 : 1;
        // minimum of cell to the left+1, to the top+1, diagonally left and up +cost
        p[i] = Math.min(Math.min(p[i - 1] + 1, p[i] + 1), upperLeft + cost);
        upperLeft = upper;
      }
    }

    int actualThreshold = -1;
    useValue = p[n];
    
    if ( useValue == 0 ) {
      actualThreshold = 100;
    } else if ( leftSide.length() < useValue) {
      actualThreshold = 0;
    } else {
      actualThreshold = (int) Math.round( (1.0 - ((double) useValue / (double) leftSide.length())) * 100 );
    }

  if ( Threshold == null ) {
    Threshold = 100l;
  }

  isEqual = actualThreshold >= Threshold;

  if ( !isEqual ) {
    if ( leftSide.length() != rightSide.length() ) {
      reason = " - Sizes do not match: expected was " + rightSide.length() + " while actual was " + leftSide.length();
    } else {
      reason = " - " + actualThreshold + " was below the expected Threshold of " + Threshold;
    }

    StringBuilder sB = new StringBuilder();
    byte[] bL = leftSide.getBytes();
    byte[] rL = rightSide.getBytes();

    sB.append( "EXPECTED: " );
    for ( byte b : rL ) {
       sB.append( (int) b ).append( " " );
    }
    log.atWarn().log( sB.toString() );

    sB.setLength( 0 );
    sB.append( "ACTUAL: " );
    for ( byte b : bL ) {
       sB.append( (int) b ).append( " " );
    }
    log.atWarn().log( sB.toString() );

  }
}

if ( contextName != null ) {
  contextMap.put( contextName + "_Equals", isEqual );
  contextMap.put( contextName + "_actual", leftSide );
  contextMap.put( contextName + "_expected", rightSide );
}

if ( !isEqual ) {
  throw new IllegalArgumentException( leftSide + " does not match " + rightSide + reason );
}

 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This version implemented Maximize, Minimize, Full Screen and Resize
 */
 public static void Browser_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String action = (String) variableMap.get( "action" );
 
   Long height = null;
   Number _height = (Number) variableMap.get( "height" );
   if ( _height != null ) height = _height.longValue();
 
   Long width = null;
   Number _width = (Number) variableMap.get( "width" );
   if ( _width != null ) width = _width.longValue();
 

 switch( action ) {
  case "Back":
    webDriver.navigate().back();
    break;
  case "Forward":
    webDriver.navigate().forward();
    break;
  case "Refresh":
    webDriver.navigate().refresh();
    break;
  case "Maximize":
    webDriver.manage().window().maximize();
    break;
  case "Minimize":
    webDriver.manage().window().minimize();
    break;
  case "Full Screen":
    webDriver.manage().window().fullscreen();
    break;
  case "Resize":
    webDriver.manage().window().setSize( new Dimension( width.intValue(), height.intValue() ) );
    break;
}

if ( contextName != null ) {
  contextMap.put( contextName, webDriver.getCurrentUrl() );
}
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Allows the script developer to wait for a supported action
 */
 public static void Wait_For_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String condition = (String) variableMap.get( "condition" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 
   Long timeOut = null;
   Number _timeOut = (Number) variableMap.get( "timeOut" );
   if ( _timeOut != null ) timeOut = _timeOut.longValue();
 

 WebDriverWait wait = new WebDriverWait( webDriver,Duration.ofMillis(timeOut ), Duration.ofMillis( 250 ) );      WebElement webElement = null;      boolean returnValue = false;      try {        switch ( condition ) {          case "Clickable":            webElement = wait.until( new Function<WebDriver, WebElement>()            {                @Override              public WebElement apply( WebDriver webDriver )              {                return ExpectedConditions.elementToBeClickable( targetLocator ).apply( webDriver );              }              } );              break;            case "Invisible":            returnValue = wait.until( new Function<WebDriver, Boolean>()            {                @Override              public Boolean apply( WebDriver webDriver )              {                return ExpectedConditions.invisibilityOfElementLocated( targetLocator ).apply( webDriver );              }              } );            break;            case "Present":            webElement = wait.until( new Function<WebDriver, WebElement>()            {                @Override              public WebElement apply( WebDriver webDriver )              {                return ExpectedConditions.presenceOfElementLocated( targetLocator ).apply( webDriver );              }              } );              break;            case "Selected":            returnValue = wait.until( new Function<WebDriver, Boolean>()            {                @Override              public Boolean apply( WebDriver webDriver )              {                return ExpectedConditions.elementToBeSelected( targetLocator ).apply( webDriver );              }              } );            break;            case "Visible":            webElement = wait.until( new Function<WebDriver, WebElement>()            {                @Override              public WebElement apply( WebDriver webDriver )              {                return ExpectedConditions.visibilityOfElementLocated( targetLocator ).apply( webDriver );              }              } );            break;            case "Frame Exists":            webElement = wait.until( new Function<WebDriver, WebElement>()            {                @Override              public WebElement apply( WebDriver webDriver )              {                try {                  WebElement webElement = webDriver.findElement( targetLocator );                  webDriver.switchTo().frame( webElement );                  return webElement;                } catch ( Exception e ) {                    return null;                }              }              } );            break;            case "Clickable then Click":            webElement = wait.until( new Function<WebDriver, WebElement>()            {                @Override              public WebElement apply( WebDriver webDriver )              {                return ExpectedConditions.elementToBeClickable( targetLocator ).apply( webDriver );              }              } );            webElement.click();            break;        }      } catch ( Throwable t ) {        throw new IllegalArgumentException( "Could not locate " + targetLocator + " with the condition met as " + condition, t );      }        if ( contextName != null ) {        contextMap.put( contextName + "_element", webElement );        contextMap.put( contextName + "_found", returnValue );      }      /* end report here */
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This will verify that an element exists and attempt to retrieve a value from it.  The value retrieved can come from several places depending on the element selected.  For example, a DIV would return the containing text whereas an INPUT would return the text attribute value.
 */
 public static void Get_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 

WebElement targetElement;
try {
      targetElement = webDriver.findElement(targetLocator);

    } catch (Exception e) {
      throw new IllegalArgumentException( "Unable to locate element", e );
    }

 String returnValue = null;

   if ( targetElement.getTagName() == null ) {
     returnValue = targetElement.getText();
   } else {
     switch (targetElement.getTagName().toUpperCase())
     {
       case "IMG":
         returnValue = targetElement.getAttribute("src");
         break;
 
       case "INPUT":
       case "TEXTAREA":
         returnValue = targetElement.getAttribute("value");
         break;
 
       case "SELECT":
         returnValue = new Select(targetElement).getFirstSelectedOption().getText();
         break;
 
       case "UIATEXTFIELD":
         returnValue = targetElement.getAttribute("value");
         break;
 
       case "ANDROID.WIDGET.EDITTEXT":
         returnValue = targetElement.getAttribute("text");
         break;
 
       default:
         returnValue = targetElement.getText();
         break;
     }
   }

 
 if ( contextName != null ) {
   contextMap.put( contextName, returnValue );
 }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This implementation will select a value based off of the method.  The default method will select by search that the value contains the provided text.  If not found, it will select by visible value, otherwise by value.  The Visible method only search by visible value and the Value method only selects by value
 */
 public static void Select_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String method = (String) variableMap.get( "method" );
 
   String value = (String) variableMap.get( "value" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 
WebElement targetElement;
try {
      targetElement = webDriver.findElement(targetLocator);

    } catch (Exception e) {
      throw new IllegalArgumentException( "Unable to locate element", e );
    }

if ( method == null ||  method.equals( "Default" ) ) {
  Select selectElement = new Select(targetElement);
  if (selectElement.isMultiple()) {
    selectElement.deselectAll();
  }

  List<WebElement> selectOptions = selectElement.getOptions();
  boolean found = false;
  for (int i = 0; i < selectOptions.size(); i++) {
    if (selectOptions.get(i).getText().contains(value)) {
      selectElement.selectByIndex(i);
      found = true;
    }
  }

  if (!found) {
    try {
      selectElement.selectByVisibleText(value);
    } catch (Exception e) {
      selectElement.selectByValue(value);
    }
  }
} else if ( method.equals( "Visible" ) ) {
  Select selectElement = new Select( targetElement );
  if ( selectElement.isMultiple() )
    selectElement.deselectAll();

  selectElement.selectByVisibleText( value );
} else if ( method.equals( "Value" ) ) {
  Select selectElement = new Select( targetElement );
  if ( selectElement.isMultiple() )
    selectElement.deselectAll();

  selectElement.selectByValue( value );
}
    

 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Navigate_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String url = (String) variableMap.get( "url" );
 
   Long timeout = null;
   Number _timeout = (Number) variableMap.get( "timeout" );
   if ( _timeout != null ) timeout = _timeout.longValue();
 

 webDriver.manage().timeouts().pageLoadTimeout( timeout.longValue(), java.util.concurrent.TimeUnit.MILLISECONDS ); webDriver.get( url ); 
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Click_v7( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 
   String method = (String) variableMap.get( "method" );
 

   if ( method != null && !method.isEmpty() ) {    
 
 try {
   switch (method) {
         case "Default":
           try {
             WebDriverWait wait = new WebDriverWait( webDriver,Duration.ofSeconds( 8 ), Duration.ofMillis( 250 ) );
             wait.until( (_wD) -> ExpectedConditions.elementToBeClickable( targetLocator ).apply( _wD )).click();
           } catch (Exception e) {
             try {
               if (webDriver instanceof JavascriptExecutor) {
                 WebElement wE = webDriver.findElement(targetLocator);
                 ((JavascriptExecutor) webDriver).executeScript("arguments[ 0 ].click();", wE);
               }
             } catch (Exception e2) {
               throw e;
             }
           }
           break;
         case "No Wait":
           try {
             webDriver.findElement(targetLocator).click();
           } catch (Exception e) {
             try {
               if (webDriver instanceof JavascriptExecutor) {
                 WebElement wE = webDriver.findElement(targetLocator);
                 ((JavascriptExecutor) webDriver).executeScript("arguments[ 0 ].click();", wE);
               }
             } catch (Exception e2) {
               throw e;
             }
           }
           break;
         case "Simple":
           webDriver.findElement(targetLocator).click();
           break;
         case "Right":
           Actions rC = new Actions(webDriver);
           rC.contextClick(webDriver.findElement(targetLocator)).perform();
           break;
         case "Double": 
           Actions dC = new Actions(webDriver);
           dC.doubleClick(webDriver.findElement(targetLocator)).perform();
           break;
         default:
           throw new IllegalArgumentException("Invalid method specified as " + method );
       }
     } catch( Exception e ) {
       throw new IllegalArgumentException( "Could not locate element defined by targetLocator" );
     }
 
   } else {
     throw new IllegalArgumentException("The METHOD parameter must be specified");
   }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * A DEBUG statement dumping information out to the local execution console
 */
 public static void Console_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String value = (String) variableMap.get( "value" );
 
   Boolean asAscii = Boolean.parseBoolean( variableMap.get( "asAscii" ) + "" );
 

 log.warn( value + "" );  
System.out.println( value + "" );




 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This vesion introduced the asAscii variable allowsing a user to dump the raw characters out
 */
 public static void Console_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String value = (String) variableMap.get( "value" );
 
   Boolean asAscii = Boolean.parseBoolean( variableMap.get( "asAscii" ) + "" );
 

 if ( asAscii != null && asAscii == true ){
  StringBuilder sB = new StringBuilder();
  byte[] vL = ( value + "" ).getBytes();
  for ( byte b : vL ) {
    sB.append( (int) b ).append( " " );
  }

  log.warn( sB.toString() );  
  System.out.println( sB.toString() );

} else {
  log.warn( value + "" );  
  System.out.println( value + "" );
}
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * <p>Allows a string to be compared against a pattern to ensure that it matches the pattern. &nbsp;The pattern can be specified in varying formats depending on the type selected.</p>
<ul>
    <li><strong>Wild Card</strong>: Wild Card allows the user to specify a * character at the start or end of a string. &nbsp;This indicates that the starred section can be anything effectively allowing the user to match the beginning or ending of a string.</li>
    <li><strong>Regular Expression</strong>: <i>Regular Expression</i> (RegEx) allows the user to verify that the string matches the pattern by using a <i>Regular Expression</i>. &nbsp;For more information on <i>Regular Expressions</i> click <a target="_blank" rel="noopener noreferrer" href="https://regex101.com/">here</a></li>
</ul>
 */
 public static void Pattern_Match_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String value = (String) variableMap.get( "value" );
 
   String pattern = (String) variableMap.get( "pattern" );
 
   String type = (String) variableMap.get( "type" );
 

 boolean match = false;

    switch (type) {
      case "Starts With":
        if (value.startsWith(pattern)) {
          match = true;
        }

        break;

      case "Ends With":
        if (value.endsWith(pattern)) {
          match = true;
        }

        break;

      case "Contains":
        if (value.contains(pattern)) {
          match = true;
        }

        break;

      case "Regular Expression":
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(pattern);
        match = p.matcher(value).matches();
        break;
    }

    if (contextName != null) {
      contextMap.put(contextName, match);
    }

    if ( !match ) {
      throw new IllegalArgumentException( value + " does not match the pattern " + pattern + " of type " + type );
    }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * Scrolls by pixel or screen
 */
 public static void Scroll_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String measurement = (String) variableMap.get( "measurement" );
 
   Long value = null;
   Number _value = (Number) variableMap.get( "value" );
   if ( _value != null ) value = _value.longValue();
 

 switch( measurement ) {
       case "Pixel":
         if ( webDriver instanceof JavascriptExecutor ) {
          ( (JavascriptExecutor) webDriver ).executeScript( "window.scrollBy( 0, " + value + ");" );
         }
         break;
         
       case "Page":
         if ( webDriver instanceof JavascriptExecutor ) {
           ( (JavascriptExecutor) webDriver ).executeScript( "window.scrollBy( 0, (window.innerHeight * " + value + "));" );
         }  
         break;
       default:
         throw new IllegalArgumentException( "Scroll measurment type [" + measurement + "] was unknown" );
        
     }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * A simple test to ensure an element exists
 */
 public static void Exists_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 
WebElement targetElement;
try 
{
  targetElement = webDriver.findElement(targetLocator);
  if ( contextName != null && targetElement != null ) {
    contextMap.put( contextName, true );
  }
} catch (Exception e) {
  if ( contextName != null ) {
    contextMap.put( contextName, false );
  }
  throw new IllegalArgumentException( "Unable to locate element", e );
}

if ( targetElement == null ) {
  throw new IllegalArgumentException("Unable to locate element using " + targetLocator);
}


 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 /**
 * This version will check after the clear to verify that the input is empty.  If not, it will send backspace keys for each character in the input
 */
 public static void Type_v2( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String value = (String) variableMap.get( "value" );
 
   Boolean clearFirst = Boolean.parseBoolean( variableMap.get( "clearFirst" ) + "" );
 
   By targetLocator = (By) variableMap.get( "targetLocator" );
 

 WebElement targetElement;
targetElement = webDriver.findElement(targetLocator);

if ( targetElement == null ) {
  throw new IllegalArgumentException( "Unable to locate " + targetLocator );
}

if ( clearFirst ) {   
  targetElement.clear(); 
  String text = targetElement.getAttribute( "value" );
  if ( text != null ) {
    for ( int i=0; i<text.length(); i++ ) {
      targetElement.sendKeys(Keys.BACK_SPACE);
    } 
  }
}  

targetElement.sendKeys( value );


 if ( variableMap != null ) {
   variableMap.clear();
 }
}


 }
