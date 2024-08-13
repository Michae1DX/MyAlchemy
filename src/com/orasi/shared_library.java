/**
 * @version 6
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

 
 public static void Change_Window_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String Method = (String) variableMap.get( "Method" );
 
   Boolean Exact_Match = Boolean.parseBoolean( variableMap.get( "Exact Match" ) + "" );
 
   String Identifier = (String) variableMap.get( "Identifier" );
 
   Boolean Case_Sensitive = Boolean.parseBoolean( variableMap.get( "Case Sensitive" ) + "" );
 

 if ( Identifier == null ) {
      throw new IllegalArgumentException( "Identifier must be specified" );
    }
    String originalWindow = webDriver.getWindowHandle();
    boolean windowLocated = false;

    if (!Case_Sensitive) {
      Identifier = Identifier.toLowerCase();
    }

    switch (Method) {
      case "Handle":
        try {
          webDriver.switchTo().window(Identifier);
          windowLocated = true;
        } catch (NoSuchWindowException e) {
          throw new IllegalArgumentException("Could not find a window using [" + Identifier + "]");
        }
      break;
      case "Index":
        try {
          int windowIndex = Integer.parseInt(Identifier);
          if (webDriver.getWindowHandles().size() <= windowIndex) {
            throw new IllegalArgumentException("There is no window at index [" + windowIndex + "]");
          }
          webDriver.switchTo().window(webDriver.getWindowHandles().toArray()[windowIndex] + "");
          windowLocated = true;
        } catch (NoSuchWindowException e) {
          throw new IllegalArgumentException("Could not find a window using [" + Identifier + "]");
        } catch (IllegalArgumentException e) {
          throw e;
        } catch (Exception e) {

      }
      break;
      
      default:
        if (!Case_Sensitive) {
          Identifier = Identifier.toLowerCase();
        }
        String useValue = null;
        for (String t : webDriver.getWindowHandles()) {
          if (Method.equals("Title")) {
            useValue = webDriver.switchTo().window(t).getTitle();
          } else if (Method.equals("URL")) {
            useValue = webDriver.switchTo().window(t).getCurrentUrl();
          }

          if (useValue != null) {
            if (!Case_Sensitive) {
              useValue = useValue.toLowerCase();
            }

            if (Exact_Match) {
              if (Identifier.equals(useValue)) {
                windowLocated = true;
                break;
              }
            } else {
              if (useValue.contains(Identifier)) {
                windowLocated = true;
                break;
              }
            }

          }
        }
        break;
    }
 if ( variableMap != null ) {
   variableMap.clear();
 }
}

 
 public static void Change_Frame_v1( int executionId, int stepIdentifier, int testExecutionId, WebDriver webDriver, Map<String,Object> variableMap, Map<String,Object> contextMap, String contextName, Stack<String> callStack, Stack<Integer> stepStack )
 {
 
   String Method = (String) variableMap.get( "Method" );
 
   Long Index = null;
   Number _Index = (Number) variableMap.get( "Index" );
   if ( _Index != null ) Index = _Index.longValue();
 
   String Name = (String) variableMap.get( "Name" );
 
   By Locator = (By) variableMap.get( "Locator" );
 

 if ( Method == null ) {
  throw new IllegalArgumentException( "Method must be specified" );
}

switch( Method ) {
  case "Locator":
    if ( Locator == null ) {
      throw new IllegalArgumentException( "Locator is required when searching for a frame by a locator" );
    }

    WebDriverWait wait = new WebDriverWait( webDriver,Duration.ofMillis( 2500 ), Duration.ofMillis( 250 ) );

    WebElement frameElement = wait.until( new Function<WebDriver, WebElement>()
    {
      @Override
      public WebElement apply( WebDriver webDriver )
      {
        try {
          WebElement webElement = webDriver.findElement( Locator );
          webDriver.switchTo().frame( webElement );
          return webElement;
        } catch ( Exception e ) {  
          return null;
        }
      }
     } );
     break;

  case "Index":
    if ( Index == null ) {
      throw new IllegalArgumentException( "Index is required when searching for a frame by index" );
    }
    webDriver.switchTo().frame( Index.intValue() );
    break;
  case "Name":
    if ( Name == null ) {
      throw new IllegalArgumentException( "Name is required when searching for a frame by name" );
    }
    webDriver.switchTo().frame( Name );
    break;
  case "Parent":
    webDriver.switchTo().parentFrame();
    break;
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


 }
