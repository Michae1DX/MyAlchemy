
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch.co.uk
    Add a description of llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch.co.uk
    */
    /* Page: Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch Home Page 
    
    */

    

bC = new ByFactoryCollection("Learnhowtosayit", "13780.860");
bC.add( new ByFactory( ByXPath.class, "//NAV[@class='c-nav c-nav--inline c-nav--high']/SPAN[3]", "ParentRule[AttributeRule]", "13780.862" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='c-nav c-nav--inline c-nav--high']/SPAN[3]", "ParentRule[AttributeRule]", "13780.864" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[text()=\"Home\"]/following-sibling::SPAN[2]", "SiblingRule", "13780.866" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[text()=\"Learn how to say it\"]", "TextRule", "13780.868" ) );
bC.add( new ByFactory( ByXPath.class, "//NAV/SPAN[3]", "ParentRule[TagRule]", "13780.870" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/HEADER[1]/NAV[1]/SPAN[3]", "AbsoluteRule", "13780.872" ) );


objectMap.put( "13780.860", bC );
/* Page: default 
    
    */

    /* Page: Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch Say the Name 
    
    */

    

bC = new ByFactoryCollection("exactlywhatthenamemeans", "13780.881");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@width='85%']/TBODY[1]/TR[1]/TD[1]/FONT[1]/P[1]/A[1]", "TableRule[AttributeRule]", "13780.883" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@width='85%']/TBODY[1]/TR[1]/TD[1]/FONT[1]/P[1]/A[1]", "TableRule[AttributeRule]", "13780.885" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='o-grid o-grid--xsmall-full o-grid--small-full o-grid--medium-full']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FONT[1]/P[1]/A[1]", "TableRule[ParentRule[AttributeRule]]", "13780.887" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='o-grid o-grid--xsmall-full o-grid--small-full o-grid--medium-full']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FONT[1]/P[1]/A[1]", "TableRule[ParentRule[AttributeRule]]", "13780.889" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[./TBODY]/TBODY[1]/TR[1]/TD[1]/FONT[1]/P[1]/A[1]", "TableRule[ChildRule[TagRule]]", "13780.891" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE/TBODY[1]/TR[1]/TD[1]/FONT[1]/P[1]/A[1]", "TableRule[TagRule]", "13780.893" ) );


objectMap.put( "13780.881", bC );


bC = new ByFactoryCollection("A", "14025.2312");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@width='85%']/TBODY[1]/TR[1]/TD[1]/FONT[1]/CENTER[1]/A[1]", "TableRule[AttributeRule]", "14025.2314" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@width='85%']/TBODY[1]/TR[1]/TD[1]/FONT[1]/CENTER[1]/A[1]", "TableRule[AttributeRule]", "14025.2316" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='o-grid o-grid--xsmall-full o-grid--small-full o-grid--medium-full']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FONT[1]/CENTER[1]/A[1]", "TableRule[ParentRule[AttributeRule]]", "14025.2318" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='o-grid o-grid--xsmall-full o-grid--small-full o-grid--medium-full']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/FONT[1]/CENTER[1]/A[1]", "TableRule[ParentRule[AttributeRule]]", "14025.2320" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[./TBODY]/TBODY[1]/TR[1]/TD[1]/FONT[1]/CENTER[1]/A[1]", "TableRule[ChildRule[TagRule]]", "14025.2322" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE/TBODY[1]/TR[1]/TD[1]/FONT[1]/CENTER[1]/A[1]", "TableRule[TagRule]", "14025.2324" ) );


objectMap.put( "14025.2312", bC );




  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
