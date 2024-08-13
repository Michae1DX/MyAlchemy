
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
    Site: Old Bike Shop 3
    Add a description of alchemydemo01.wpenginepowered.com
    */
    /* Page: The Bike Shop  The Ride Of A Lifetime 
    
    */

    

bC = new ByFactoryCollection("BICYCLES", "1557.2277");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/product-category/bicycles/'])[1]", "AttributeRule", "1557.2279" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[2]", "AttributeRule", "1557.2281" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1252\"]/A[1]", "ParentRule[IDRule]", "1557.2283" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1252\"]/A[1]", "ParentRule[IDRule]", "1557.2285" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1252'])[1]/A[1]", "ParentRule[AttributeRule]", "1557.2287" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]", "AbsoluteRule", "1557.2289" ) );


objectMap.put( "1557.2277", bC );
/* Page: default 
    
    */

    /* Page: Bicycles  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("orderby", "1557.2296");
bC.add( new ByFactory( ByXPath.class, "//SELECT[@name=\"orderby\"]", "NameRule", "1557.2298" ) );
bC.add( new ByFactory( ByXPath.class, "orderby", "NameRule", "1557.2300" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"orderby\"]", "NameRule", "1557.2302" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[@value='menu_order']]", "ChildRule[AttributeRule]", "1557.2304" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./*[@value='menu_order']]", "ChildRule[AttributeRule]", "1557.2306" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[@selected='selected']]", "ChildRule[AttributeRule]", "1557.2308" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./*[@selected='selected']]", "ChildRule[AttributeRule]", "1557.2310" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[@value='popularity']]", "ChildRule[AttributeRule]", "1557.2312" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./*[@value='popularity']]", "ChildRule[AttributeRule]", "1557.2314" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[@value='date']]", "ChildRule[AttributeRule]", "1557.2316" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./*[@value='date']]", "ChildRule[AttributeRule]", "1557.2318" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[@value='price']]", "ChildRule[AttributeRule]", "1557.2320" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./*[@value='price']]", "ChildRule[AttributeRule]", "1557.2322" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[@value='price-desc']]", "ChildRule[AttributeRule]", "1557.2324" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./*[@value='price-desc']]", "ChildRule[AttributeRule]", "1557.2326" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[@class='orderby']", "AttributeRule", "1557.2328" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='orderby']", "AttributeRule", "1557.2330" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[@aria-label='Shop order']", "AttributeRule", "1557.2332" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Shop order']", "AttributeRule", "1557.2334" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='woocommerce-ordering']/SELECT[1]", "ParentRule[AttributeRule]", "1557.2336" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-ordering']/SELECT[1]", "ParentRule[AttributeRule]", "1557.2338" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@method='get'])[2]/SELECT[1]", "ParentRule[AttributeRule]", "1557.2340" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[text()=\"Default sorting\"]]", "ChildRule[TextRule]", "1557.2342" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[text()=\"Sort by popularity\"]]", "ChildRule[TextRule]", "1557.2344" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[text()=\"Sort by latest\"]]", "ChildRule[TextRule]", "1557.2346" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[text()=\"Sort by price: low to high\"]]", "ChildRule[TextRule]", "1557.2348" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT[./OPTION[text()=\"Sort by price: high to low\"]]", "ChildRule[TextRule]", "1557.2350" ) );
bC.add( new ByFactory( ByXPath.class, "//SELECT", "TagRule", "1557.2352" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/MAIN[1]/DIV[1]/FORM[1]/SELECT[1]", "AbsoluteRule", "1557.2354" ) );


objectMap.put( "1557.2296", bC );


bC = new ByFactoryCollection("KryoX26MTBModelK", "1557.2358");
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='ast-woo-product-category'])[1]/following-sibling::A[1]", "SiblingRule", "1557.2360" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-k/'])[2]", "AttributeRule", "1557.2362" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='ast-loop-product__link'])[1]", "AttributeRule", "1557.2364" ) );
bC.add( new ByFactory( ByXPath.class, "(//DIV[@class='astra-shop-summary-wrap'])[1]/A[1]", "ParentRule[AttributeRule]", "1557.2366" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./H2[text()=\"Kryo X26 MTB � Model K\"]]", "ChildRule[TextRule]", "1557.2368" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/MAIN[1]/DIV[1]/UL[1]/LI[1]/DIV[2]/A[1]", "AbsoluteRule", "1557.2370" ) );


objectMap.put( "1557.2358", bC );
/* Page: Kryo X26 MTB  Model K  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("add-to-cart", "1557.2375");
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@name=\"add-to-cart\"]", "NameRule", "1557.2377" ) );
bC.add( new ByFactory( ByXPath.class, "add-to-cart", "NameRule", "1557.2379" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"add-to-cart\"]", "NameRule", "1557.2381" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='quantity']/following-sibling::BUTTON[1]", "SiblingRule", "1557.2383" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@type='submit']", "AttributeRule", "1557.2385" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "1557.2387" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@value='330']", "AttributeRule", "1557.2389" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='330']", "AttributeRule", "1557.2391" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@class='single_add_to_cart_button button alt']", "AttributeRule", "1557.2393" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='single_add_to_cart_button button alt']", "AttributeRule", "1557.2395" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='cart']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2397" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='cart']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2399" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@action='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-k/']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2401" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-k/']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2403" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@method='post']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2405" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@method='post']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2407" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@enctype='multipart/form-data']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2409" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@enctype='multipart/form-data']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.2411" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM/BUTTON[1]", "ParentRule[TagRule]", "1557.2413" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/DIV[1]/DIV[2]/DIV[2]/FORM[1]/BUTTON[1]", "AbsoluteRule", "1557.2415" ) );


objectMap.put( "1557.2375", bC );


bC = new ByFactoryCollection("VIEWCARTKryoX26MTBModelKhasbeenaddedtoyourcart", "1557.2418");
bC.add( new ByFactory( ByXPath.class, "//DIV[./A[@tabindex='1']]", "ChildRule[AttributeRule]", "1557.2420" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[./*[@tabindex='1']]", "ChildRule[AttributeRule]", "1557.2422" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='wc-block-components-notice-banner__content']", "AttributeRule", "1557.2424" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wc-block-components-notice-banner__content']", "AttributeRule", "1557.2426" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='wc-block-components-notice-banner is-success']/DIV[1]", "ParentRule[AttributeRule]", "1557.2428" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wc-block-components-notice-banner is-success']/DIV[1]", "ParentRule[AttributeRule]", "1557.2430" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@role='alert']/DIV[1]", "ParentRule[AttributeRule]", "1557.2432" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='alert']/DIV[1]", "ParentRule[AttributeRule]", "1557.2434" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]", "AbsoluteRule", "1557.2436" ) );


objectMap.put( "1557.2418", bC );


bC = new ByFactoryCollection("ast-site-header-cart", "1557.2440");
bC.add( new ByFactory( ByXPath.class, "//DIV[@id=\"ast-site-header-cart\"]", "IDRule", "1557.2442" ) );
bC.add( new ByFactory( ByXPath.class, "ast-site-header-cart", "IDRule", "1557.2444" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"ast-site-header-cart\"]", "IDRule", "1557.2446" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[./DIV[@class='ast-site-header-cart-li ']]", "ChildRule[AttributeRule]", "1557.2448" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[./*[@class='ast-site-header-cart-li ']]", "ChildRule[AttributeRule]", "1557.2450" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[./DIV[@class='ast-site-header-cart-data']]", "ChildRule[AttributeRule]", "1557.2452" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[./*[@class='ast-site-header-cart-data']]", "ChildRule[AttributeRule]", "1557.2454" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='ast-site-header-cart ast-menu-cart-with-border ast-desktop-cart-flyout ast-menu-cart-outline']", "AttributeRule", "1557.2456" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='ast-site-header-cart ast-menu-cart-with-border ast-desktop-cart-flyout ast-menu-cart-outline']", "AttributeRule", "1557.2458" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='ast-builder-layout-element site-header-focus-item ast-header-woo-cart']/DIV[1]", "ParentRule[AttributeRule]", "1557.2460" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='ast-builder-layout-element site-header-focus-item ast-header-woo-cart']/DIV[1]", "ParentRule[AttributeRule]", "1557.2462" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@data-section='section-header-woo-cart']/DIV[1]", "ParentRule[AttributeRule]", "1557.2464" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-section='section-header-woo-cart']/DIV[1]", "ParentRule[AttributeRule]", "1557.2466" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[3]/DIV[2]/DIV[1]", "AbsoluteRule", "1557.2468" ) );


objectMap.put( "1557.2440", bC );


bC = new ByFactoryCollection("KryoX26MTB-ModelK", "1557.2471");
bC.add( new ByFactory( ByXPath.class, "(//A[@class='remove remove_from_cart_button'])[2]/following-sibling::A[1]", "SiblingRule", "1557.2473" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-k/'])[2]", "AttributeRule", "1557.2475" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='woocommerce-mini-cart-item mini_cart_item'])[2]/A[2]", "ParentRule[AttributeRule]", "1557.2477" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[3]/DIV[2]/DIV[1]/DIV[1]/UL[1]/LI[1]/A[2]", "AbsoluteRule", "1557.2479" ) );


objectMap.put( "1557.2471", bC );


bC = new ByFactoryCollection("VIEWCART", "1557.2482");
bC.add( new ByFactory( ByXPath.class, "(//A[@class='button wc-forward'])[3]", "AttributeRule", "1557.2484" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/cart/'])[4]", "AttributeRule", "1557.2486" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@class='woocommerce-mini-cart__buttons buttons'])[2]/A[1]", "ParentRule[AttributeRule]", "1557.2488" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[3]/DIV[2]/DIV[1]/DIV[1]/P[2]/A[1]", "AbsoluteRule", "1557.2490" ) );


objectMap.put( "1557.2482", bC );
/* Page: Cart  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("KryoX26MTB-ModelK", "1557.2495");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[AttributeRule]", "1557.2497" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[AttributeRule]", "1557.2499" ) );
bC.add( new ByFactory( ByXPath.class, "(//TABLE[@cellspacing='0'])[1]/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[AttributeRule]", "1557.2501" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='woocommerce-cart-form']/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[ParentRule[AttributeRule]]", "1557.2503" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-cart-form']/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[ParentRule[AttributeRule]]", "1557.2505" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@action='https://alchemydemo01.wpenginepowered.com/cart/'])[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[ParentRule[AttributeRule]]", "1557.2507" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@method='post'])[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[ParentRule[AttributeRule]]", "1557.2509" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[./THEAD]/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[ChildRule[TagRule]]", "1557.2511" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-k/'])[2]", "AttributeRule", "1557.2513" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1]", "TableRule[AbsoluteRule]", "1557.2515" ) );
bC.add( new ByFactory( ByXPath.class, "//TD[@class='product-name']/A[1]", "ParentRule[AttributeRule]", "1557.2517" ) );
bC.add( new ByFactory( ByXPath.class, "//TD[@data-title='Product']/A[1]", "ParentRule[AttributeRule]", "1557.2519" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-title='Product']/A[1]", "ParentRule[AttributeRule]", "1557.2521" ) );
bC.add( new ByFactory( ByXPath.class, "//A[text()=\"Kryo X26 MTB - Model K\"]", "TextRule", "1557.2523" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[1]/TABLE[1]/TBODY[1]/TR[1]/TD[3]/A[1]", "AbsoluteRule", "1557.2525" ) );


objectMap.put( "1557.2495", bC );


bC = new ByFactoryCollection("PROCEEDTOCHECKOUT", "1557.2528");
bC.add( new ByFactory( ByXPath.class, "//A[@class='checkout-button button alt wc-forward']", "AttributeRule", "1557.2530" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='checkout-button button alt wc-forward']", "AttributeRule", "1557.2532" ) );
bC.add( new ByFactory( ByXPath.class, "//A[@href='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1557.2534" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1557.2536" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='wc-proceed-to-checkout']/A[1]", "ParentRule[AttributeRule]", "1557.2538" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wc-proceed-to-checkout']/A[1]", "ParentRule[AttributeRule]", "1557.2540" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/A[1]", "AbsoluteRule", "1557.2542" ) );


objectMap.put( "1557.2528", bC );
/* Page: Checkout  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("billing_first_name", "1557.2547");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_first_name\"]", "IDRule", "1557.2549" ) );
bC.add( new ByFactory( ByXPath.class, "billing_first_name", "IDRule", "1557.2551" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_first_name\"]", "IDRule", "1557.2553" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_first_name\"]", "NameRule", "1557.2555" ) );
bC.add( new ByFactory( ByXPath.class, "billing_first_name", "NameRule", "1557.2557" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_first_name\"]", "NameRule", "1557.2559" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@type='text'])[3]", "AttributeRule", "1557.2561" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[1]", "AttributeRule", "1557.2563" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@autocomplete='given-name'])[1]", "AttributeRule", "1557.2565" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[1]/INPUT[1]", "ParentRule[AttributeRule]", "1557.2567" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[1]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.2569" ) );


objectMap.put( "1557.2547", bC );


bC = new ByFactoryCollection("billing_last_name", "1557.2573");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_last_name\"]", "IDRule", "1557.2575" ) );
bC.add( new ByFactory( ByXPath.class, "billing_last_name", "IDRule", "1557.2577" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_last_name\"]", "IDRule", "1557.2579" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_last_name\"]", "NameRule", "1557.2581" ) );
bC.add( new ByFactory( ByXPath.class, "billing_last_name", "NameRule", "1557.2583" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_last_name\"]", "NameRule", "1557.2585" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@type='text'])[4]", "AttributeRule", "1557.2587" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[2]", "AttributeRule", "1557.2589" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@autocomplete='family-name'])[1]", "AttributeRule", "1557.2591" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[2]/INPUT[1]", "ParentRule[AttributeRule]", "1557.2593" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[2]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.2595" ) );


objectMap.put( "1557.2573", bC );


bC = new ByFactoryCollection("billing_company", "1557.2599");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_company\"]", "IDRule", "1557.2601" ) );
bC.add( new ByFactory( ByXPath.class, "billing_company", "IDRule", "1557.2603" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_company\"]", "IDRule", "1557.2605" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_company\"]", "NameRule", "1557.2607" ) );
bC.add( new ByFactory( ByXPath.class, "billing_company", "NameRule", "1557.2609" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_company\"]", "NameRule", "1557.2611" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@type='text'])[5]", "AttributeRule", "1557.2613" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[3]", "AttributeRule", "1557.2615" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@autocomplete='organization'])[1]", "AttributeRule", "1557.2617" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[3]/INPUT[1]", "ParentRule[AttributeRule]", "1557.2619" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[3]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.2621" ) );


objectMap.put( "1557.2599", bC );


bC = new ByFactoryCollection("Selectacountry/regionAfghanistanlandIslandsAlbaniaAlgeriaAmerica...", "1557.2626");
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SELECT[@id=\"billing_country\"]]", "ChildRule[IDRule]", "1557.2628" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@id=\"billing_country\"]]", "ChildRule[IDRule]", "1557.2630" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SELECT[@name=\"billing_country\"]]", "ChildRule[NameRule]", "1557.2632" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@name=\"billing_country\"]]", "ChildRule[NameRule]", "1557.2634" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SPAN[@class='select2 select2-container select2-container--default select2-container--focus']]", "ChildRule[AttributeRule]", "1557.2636" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@class='select2 select2-container select2-container--default select2-container--focus']]", "ChildRule[AttributeRule]", "1557.2638" ) );
bC.add( new ByFactory( ByXPath.class, "//LABEL[@for='billing_country']/following-sibling::SPAN[1]", "SiblingRule", "1557.2640" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[4]", "AttributeRule", "1557.2642" ) );
bC.add( new ByFactory( ByXPath.class, "//P[@id=\"billing_country_field\"]/SPAN[1]", "ParentRule[IDRule]", "1557.2644" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_country_field\"]/SPAN[1]", "ParentRule[IDRule]", "1557.2646" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@class='form-row form-row-wide address-field update_totals_on_change validate-required'])[1]/SPAN[1]", "ParentRule[AttributeRule]", "1557.2648" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@data-priority='40'])[1]/SPAN[1]", "ParentRule[AttributeRule]", "1557.2650" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[4]/SPAN[1]", "AbsoluteRule", "1557.2652" ) );


objectMap.put( "1557.2626", bC );


bC = new ByFactoryCollection("SkiptocontentHOMEBICYCLESACCESSORIESABOUTUSCONTACT$35000Checkout...", "1557.2655");
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@title=\"Skip to content\"]]", "ChildRule[TitleRule]", "1557.2657" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@title=\"Skip to content\"]]", "ChildRule[TitleRule]", "1557.2659" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@class='skip-link screen-reader-text']]", "ChildRule[AttributeRule]", "1557.2661" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='skip-link screen-reader-text']]", "ChildRule[AttributeRule]", "1557.2663" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@title='Skip to content']]", "ChildRule[AttributeRule]", "1557.2665" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@title='Skip to content']]", "ChildRule[AttributeRule]", "1557.2667" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@href='#content']]", "ChildRule[AttributeRule]", "1557.2669" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@href='#content']]", "ChildRule[AttributeRule]", "1557.2671" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@role='link']]", "ChildRule[AttributeRule]", "1557.2673" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@role='link']]", "ChildRule[AttributeRule]", "1557.2675" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@id=\"page\"]]", "ChildRule[IDRule]", "1557.2677" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"page\"]]", "ChildRule[IDRule]", "1557.2679" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@class='hfeed site']]", "ChildRule[AttributeRule]", "1557.2681" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='hfeed site']]", "ChildRule[AttributeRule]", "1557.2683" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./LINK[@id=\"wc-blocks-style-css\"]]", "ChildRule[IDRule]", "1557.2685" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-style-css\"]]", "ChildRule[IDRule]", "1557.2687" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./LINK[@href='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks.css?ver=11.8.0-dev']]", "ChildRule[AttributeRule]", "1557.2689" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@href='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks.css?ver=11.8.0-dev']]", "ChildRule[AttributeRule]", "1557.2691" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-theme-js-js-extra\"]]", "ChildRule[IDRule]", "1557.2693" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-theme-js-js-extra\"]]", "ChildRule[IDRule]", "1557.2695" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-theme-js-js\"]]", "ChildRule[IDRule]", "1557.2697" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-theme-js-js\"]]", "ChildRule[IDRule]", "1557.2699" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/frontend.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1557.2701" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/frontend.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1557.2703" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-mobile-cart-js-extra\"]]", "ChildRule[IDRule]", "1557.2705" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-mobile-cart-js-extra\"]]", "ChildRule[IDRule]", "1557.2707" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-mobile-cart-js\"]]", "ChildRule[IDRule]", "1557.2709" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-mobile-cart-js\"]]", "ChildRule[IDRule]", "1557.2711" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/mobile-cart.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1557.2713" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/mobile-cart.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1557.2715" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"sourcebuster-js-js\"]]", "ChildRule[IDRule]", "1557.2717" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"sourcebuster-js-js\"]]", "ChildRule[IDRule]", "1557.2719" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/sourcebuster/sourcebuster.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1557.2721" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/sourcebuster/sourcebuster.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1557.2723" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-order-attribution-js-extra\"]]", "ChildRule[IDRule]", "1557.2725" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-order-attribution-js-extra\"]]", "ChildRule[IDRule]", "1557.2727" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-order-attribution-js\"]]", "ChildRule[IDRule]", "1557.2729" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-order-attribution-js\"]]", "ChildRule[IDRule]", "1557.2731" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1557.2733" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1557.2735" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"react-js\"]]", "ChildRule[IDRule]", "1557.2737" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"react-js\"]]", "ChildRule[IDRule]", "1557.2739" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1557.2741" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1557.2743" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-deprecated-js\"]]", "ChildRule[IDRule]", "1557.2745" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-deprecated-js\"]]", "ChildRule[IDRule]", "1557.2747" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/deprecated.min.js?ver=73ad3591e7bc95f4777a']]", "ChildRule[AttributeRule]", "1557.2749" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/deprecated.min.js?ver=73ad3591e7bc95f4777a']]", "ChildRule[AttributeRule]", "1557.2751" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-dom-js\"]]", "ChildRule[IDRule]", "1557.2753" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-dom-js\"]]", "ChildRule[IDRule]", "1557.2755" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom.min.js?ver=49ff2869626fbeaacc23']]", "ChildRule[AttributeRule]", "1557.2757" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom.min.js?ver=49ff2869626fbeaacc23']]", "ChildRule[AttributeRule]", "1557.2759" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"react-dom-js\"]]", "ChildRule[IDRule]", "1557.2761" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"react-dom-js\"]]", "ChildRule[IDRule]", "1557.2763" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react-dom.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1557.2765" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react-dom.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1557.2767" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-escape-html-js\"]]", "ChildRule[IDRule]", "1557.2769" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-escape-html-js\"]]", "ChildRule[IDRule]", "1557.2771" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/escape-html.min.js?ver=03e27a7b6ae14f7afaa6']]", "ChildRule[AttributeRule]", "1557.2773" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/escape-html.min.js?ver=03e27a7b6ae14f7afaa6']]", "ChildRule[AttributeRule]", "1557.2775" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-element-js\"]]", "ChildRule[IDRule]", "1557.2777" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-element-js\"]]", "ChildRule[IDRule]", "1557.2779" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/element.min.js?ver=ed1c7604880e8b574b40']]", "ChildRule[AttributeRule]", "1557.2781" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/element.min.js?ver=ed1c7604880e8b574b40']]", "ChildRule[AttributeRule]", "1557.2783" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-is-shallow-equal-js\"]]", "ChildRule[IDRule]", "1557.2785" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-is-shallow-equal-js\"]]", "ChildRule[IDRule]", "1557.2787" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/is-shallow-equal.min.js?ver=20c2b06ecf04afb14fee']]", "ChildRule[AttributeRule]", "1557.2789" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/is-shallow-equal.min.js?ver=20c2b06ecf04afb14fee']]", "ChildRule[AttributeRule]", "1557.2791" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-i18n-js\"]]", "ChildRule[IDRule]", "1557.2793" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-i18n-js\"]]", "ChildRule[IDRule]", "1557.2795" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/i18n.min.js?ver=7701b0c3857f914212ef']]", "ChildRule[AttributeRule]", "1557.2797" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/i18n.min.js?ver=7701b0c3857f914212ef']]", "ChildRule[AttributeRule]", "1557.2799" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-i18n-js-after\"]]", "ChildRule[IDRule]", "1557.2801" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-i18n-js-after\"]]", "ChildRule[IDRule]", "1557.2803" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-keycodes-js\"]]", "ChildRule[IDRule]", "1557.2805" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-keycodes-js\"]]", "ChildRule[IDRule]", "1557.2807" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/keycodes.min.js?ver=3460bd0fac9859d6886c']]", "ChildRule[AttributeRule]", "1557.2809" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/keycodes.min.js?ver=3460bd0fac9859d6886c']]", "ChildRule[AttributeRule]", "1557.2811" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-priority-queue-js\"]]", "ChildRule[IDRule]", "1557.2813" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-priority-queue-js\"]]", "ChildRule[IDRule]", "1557.2815" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/priority-queue.min.js?ver=422e19e9d48b269c5219']]", "ChildRule[AttributeRule]", "1557.2817" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/priority-queue.min.js?ver=422e19e9d48b269c5219']]", "ChildRule[AttributeRule]", "1557.2819" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-compose-js\"]]", "ChildRule[IDRule]", "1557.2821" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-compose-js\"]]", "ChildRule[IDRule]", "1557.2823" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/compose.min.js?ver=3189b344ff39fef940b7']]", "ChildRule[AttributeRule]", "1557.2825" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/compose.min.js?ver=3189b344ff39fef940b7']]", "ChildRule[AttributeRule]", "1557.2827" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-private-apis-js\"]]", "ChildRule[IDRule]", "1557.2829" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-private-apis-js\"]]", "ChildRule[IDRule]", "1557.2831" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/private-apis.min.js?ver=11cb2ebaa70a9f1f0ab5']]", "ChildRule[AttributeRule]", "1557.2833" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/private-apis.min.js?ver=11cb2ebaa70a9f1f0ab5']]", "ChildRule[AttributeRule]", "1557.2835" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-redux-routine-js\"]]", "ChildRule[IDRule]", "1557.2837" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-redux-routine-js\"]]", "ChildRule[IDRule]", "1557.2839" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/redux-routine.min.js?ver=0be1b2a6a79703e28531']]", "ChildRule[AttributeRule]", "1557.2841" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/redux-routine.min.js?ver=0be1b2a6a79703e28531']]", "ChildRule[AttributeRule]", "1557.2843" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-data-js\"]]", "ChildRule[IDRule]", "1557.2845" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-data-js\"]]", "ChildRule[IDRule]", "1557.2847" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data.min.js?ver=dc5f255634f3da29c8d5']]", "ChildRule[AttributeRule]", "1557.2849" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data.min.js?ver=dc5f255634f3da29c8d5']]", "ChildRule[AttributeRule]", "1557.2851" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-data-js-after\"]]", "ChildRule[IDRule]", "1557.2853" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-data-js-after\"]]", "ChildRule[IDRule]", "1557.2855" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"lodash-js\"]]", "ChildRule[IDRule]", "1557.2857" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"lodash-js\"]]", "ChildRule[IDRule]", "1557.2859" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/lodash.min.js?ver=4.17.19']]", "ChildRule[AttributeRule]", "1557.2861" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/lodash.min.js?ver=4.17.19']]", "ChildRule[AttributeRule]", "1557.2863" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"lodash-js-after\"]]", "ChildRule[IDRule]", "1557.2865" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"lodash-js-after\"]]", "ChildRule[IDRule]", "1557.2867" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-registry-js\"]]", "ChildRule[IDRule]", "1557.2869" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-registry-js\"]]", "ChildRule[IDRule]", "1557.2871" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-registry.js?ver=1c879273bd5c193cad0a']]", "ChildRule[AttributeRule]", "1557.2873" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-registry.js?ver=1c879273bd5c193cad0a']]", "ChildRule[AttributeRule]", "1557.2875" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-url-js\"]]", "ChildRule[IDRule]", "1557.2877" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-url-js\"]]", "ChildRule[IDRule]", "1557.2879" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/url.min.js?ver=b4979979018b684be209']]", "ChildRule[AttributeRule]", "1557.2881" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/url.min.js?ver=b4979979018b684be209']]", "ChildRule[AttributeRule]", "1557.2883" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-api-fetch-js\"]]", "ChildRule[IDRule]", "1557.2885" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-api-fetch-js\"]]", "ChildRule[IDRule]", "1557.2887" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/api-fetch.min.js?ver=0fa4dabf8bf2c7adf21a']]", "ChildRule[AttributeRule]", "1557.2889" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/api-fetch.min.js?ver=0fa4dabf8bf2c7adf21a']]", "ChildRule[AttributeRule]", "1557.2891" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-api-fetch-js-after\"]]", "ChildRule[IDRule]", "1557.2893" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-api-fetch-js-after\"]]", "ChildRule[IDRule]", "1557.2895" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-settings-js-before\"]]", "ChildRule[IDRule]", "1557.2897" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-settings-js-before\"]]", "ChildRule[IDRule]", "1557.2899" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-settings-js\"]]", "ChildRule[IDRule]", "1557.2901" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-settings-js\"]]", "ChildRule[IDRule]", "1557.2903" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-settings.js?ver=07c2f0675ddd247d2325']]", "ChildRule[AttributeRule]", "1557.2905" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-settings.js?ver=07c2f0675ddd247d2325']]", "ChildRule[AttributeRule]", "1557.2907" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-data-controls-js\"]]", "ChildRule[IDRule]", "1557.2909" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-data-controls-js\"]]", "ChildRule[IDRule]", "1557.2911" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data-controls.min.js?ver=fe4ccc8a1782ea8e2cb1']]", "ChildRule[AttributeRule]", "1557.2913" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data-controls.min.js?ver=fe4ccc8a1782ea8e2cb1']]", "ChildRule[AttributeRule]", "1557.2915" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-html-entities-js\"]]", "ChildRule[IDRule]", "1557.2917" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-html-entities-js\"]]", "ChildRule[IDRule]", "1557.2919" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/html-entities.min.js?ver=36a4a255da7dd2e1bf8e']]", "ChildRule[AttributeRule]", "1557.2921" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/html-entities.min.js?ver=36a4a255da7dd2e1bf8e']]", "ChildRule[AttributeRule]", "1557.2923" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-notices-js\"]]", "ChildRule[IDRule]", "1557.2925" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-notices-js\"]]", "ChildRule[IDRule]", "1557.2927" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/notices.min.js?ver=38e88f4b627cf873edd0']]", "ChildRule[AttributeRule]", "1557.2929" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/notices.min.js?ver=38e88f4b627cf873edd0']]", "ChildRule[AttributeRule]", "1557.2931" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-middleware-js-before\"]]", "ChildRule[IDRule]", "1557.2933" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-middleware-js-before\"]]", "ChildRule[IDRule]", "1557.2935" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-middleware-js\"]]", "ChildRule[IDRule]", "1557.2937" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-middleware-js\"]]", "ChildRule[IDRule]", "1557.2939" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-middleware.js?ver=ca04183222edaf8a26be']]", "ChildRule[AttributeRule]", "1557.2941" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-middleware.js?ver=ca04183222edaf8a26be']]", "ChildRule[AttributeRule]", "1557.2943" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-data-store-js\"]]", "ChildRule[IDRule]", "1557.2945" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-data-store-js\"]]", "ChildRule[IDRule]", "1557.2947" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-data.js?ver=c96aba0171b12e03b8a6']]", "ChildRule[AttributeRule]", "1557.2949" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-data.js?ver=c96aba0171b12e03b8a6']]", "ChildRule[AttributeRule]", "1557.2951" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-dom-ready-js\"]]", "ChildRule[IDRule]", "1557.2953" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-dom-ready-js\"]]", "ChildRule[IDRule]", "1557.2955" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom-ready.min.js?ver=392bdd43726760d1f3ca']]", "ChildRule[AttributeRule]", "1557.2957" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom-ready.min.js?ver=392bdd43726760d1f3ca']]", "ChildRule[AttributeRule]", "1557.2959" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-a11y-js\"]]", "ChildRule[IDRule]", "1557.2961" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-a11y-js\"]]", "ChildRule[IDRule]", "1557.2963" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/a11y.min.js?ver=7032343a947cfccf5608']]", "ChildRule[AttributeRule]", "1557.2965" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/a11y.min.js?ver=7032343a947cfccf5608']]", "ChildRule[AttributeRule]", "1557.2967" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-primitives-js\"]]", "ChildRule[IDRule]", "1557.2969" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-primitives-js\"]]", "ChildRule[IDRule]", "1557.2971" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/primitives.min.js?ver=6984e6eb5d6157c4fe44']]", "ChildRule[AttributeRule]", "1557.2973" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/primitives.min.js?ver=6984e6eb5d6157c4fe44']]", "ChildRule[AttributeRule]", "1557.2975" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-warning-js\"]]", "ChildRule[IDRule]", "1557.2977" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-warning-js\"]]", "ChildRule[IDRule]", "1557.2979" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/warning.min.js?ver=122829a085511691f14d']]", "ChildRule[AttributeRule]", "1557.2981" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/warning.min.js?ver=122829a085511691f14d']]", "ChildRule[AttributeRule]", "1557.2983" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-components-js\"]]", "ChildRule[IDRule]", "1557.2985" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-components-js\"]]", "ChildRule[IDRule]", "1557.2987" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-components.js?ver=b165bb2bd213326d7f31']]", "ChildRule[AttributeRule]", "1557.2989" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-components.js?ver=b165bb2bd213326d7f31']]", "ChildRule[AttributeRule]", "1557.2991" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-checkout-js\"]]", "ChildRule[IDRule]", "1557.2993" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-checkout-js\"]]", "ChildRule[IDRule]", "1557.2995" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-checkout.js?ver=9f469ef17beaf7c51576']]", "ChildRule[AttributeRule]", "1557.2997" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-checkout.js?ver=9f469ef17beaf7c51576']]", "ChildRule[AttributeRule]", "1557.2999" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-order-attribution-blocks-js\"]]", "ChildRule[IDRule]", "1557.3001" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-order-attribution-blocks-js\"]]", "ChildRule[IDRule]", "1557.3003" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution-blocks.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1557.3005" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution-blocks.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1557.3007" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"starter-templates-zip-preview-js-extra\"]]", "ChildRule[IDRule]", "1557.3009" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"starter-templates-zip-preview-js-extra\"]]", "ChildRule[IDRule]", "1557.3011" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"starter-templates-zip-preview-js\"]]", "ChildRule[IDRule]", "1557.3013" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"starter-templates-zip-preview-js\"]]", "ChildRule[IDRule]", "1557.3015" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/astra-sites/inc/lib/onboarding/assets/dist/template-preview/main.js?ver=06758d4d807d9d22c6ea']]", "ChildRule[AttributeRule]", "1557.3017" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/astra-sites/inc/lib/onboarding/assets/dist/template-preview/main.js?ver=06758d4d807d9d22c6ea']]", "ChildRule[AttributeRule]", "1557.3019" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-addon-js-js-extra\"]]", "ChildRule[IDRule]", "1557.3021" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-addon-js-js-extra\"]]", "ChildRule[IDRule]", "1557.3023" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-addon-js-js\"]]", "ChildRule[IDRule]", "1557.3025" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-addon-js-js\"]]", "ChildRule[IDRule]", "1557.3027" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/uploads/astra-addon/astra-addon-65bbf48dab7809-78711485.js?ver=4.6.3']]", "ChildRule[AttributeRule]", "1557.3029" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/uploads/astra-addon/astra-addon-65bbf48dab7809-78711485.js?ver=4.6.3']]", "ChildRule[AttributeRule]", "1557.3031" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@id=\"a11y-speak-intro-text\"]]", "ChildRule[IDRule]", "1557.3033" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"a11y-speak-intro-text\"]]", "ChildRule[IDRule]", "1557.3035" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@class='a11y-speak-intro-text']]", "ChildRule[AttributeRule]", "1557.3037" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='a11y-speak-intro-text']]", "ChildRule[AttributeRule]", "1557.3039" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@style='position: absolute;margin: -1px;padding: 0;height: 1px;width: 1px;overflow: hidden;clip: rect(1px, 1px, 1px, 1px);-webkit-clip-path: inset(50%);clip-path: inset(50%);border: 0;word-wrap: normal !important;']]", "ChildRule[AttributeRule]", "1557.3041" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@hidden='hidden']]", "ChildRule[AttributeRule]", "1557.3043" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@hidden='hidden']]", "ChildRule[AttributeRule]", "1557.3045" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@id=\"a11y-speak-assertive\"]]", "ChildRule[IDRule]", "1557.3047" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"a11y-speak-assertive\"]]", "ChildRule[IDRule]", "1557.3049" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@aria-live='assertive']]", "ChildRule[AttributeRule]", "1557.3051" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@aria-live='assertive']]", "ChildRule[AttributeRule]", "1557.3053" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@id=\"a11y-speak-polite\"]]", "ChildRule[IDRule]", "1557.3055" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"a11y-speak-polite\"]]", "ChildRule[IDRule]", "1557.3057" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@aria-live='polite']]", "ChildRule[AttributeRule]", "1557.3059" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@aria-live='polite']]", "ChildRule[AttributeRule]", "1557.3061" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SPAN[@class='select2-container select2-container--default select2-container--open']]", "ChildRule[AttributeRule]", "1557.3063" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='select2-container select2-container--default select2-container--open']]", "ChildRule[AttributeRule]", "1557.3065" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SPAN[@style='position: absolute; top: 480.703px; left: 171.375px;']]", "ChildRule[AttributeRule]", "1557.3067" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@style='position: absolute; top: 480.703px; left: 171.375px;']]", "ChildRule[AttributeRule]", "1557.3069" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[@itemtype='https://schema.org/WebPage']", "AttributeRule", "1557.3071" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@itemtype='https://schema.org/WebPage']", "AttributeRule", "1557.3073" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[@itemscope='itemscope']", "AttributeRule", "1557.3075" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[@class='page-template-default page page-id-1190 wp-custom-logo theme-astra woocommerce-checkout woocommerce-page woocommerce-js ast-desktop ast-separate-container ast-two-container ast-no-sidebar astra-4.6.4 ast-single-post ast-inherit-site-logo-transparent ast-hfb-header ast-normal-title-enabled elementor-default elementor-kit-1083 astra-addon-4.6.3  ']", "AttributeRule", "1557.3077" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='page-template-default page page-id-1190 wp-custom-logo theme-astra woocommerce-checkout woocommerce-page woocommerce-js ast-desktop ast-separate-container ast-two-container ast-no-sidebar astra-4.6.4 ast-single-post ast-inherit-site-logo-transparent ast-hfb-header ast-normal-title-enabled elementor-default elementor-kit-1083 astra-addon-4.6.3  ']", "AttributeRule", "1557.3079" ) );
bC.add( new ByFactory( ByXPath.class, "//HTML[@lang='en-US']/BODY[1]", "ParentRule[AttributeRule]", "1557.3081" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@lang='en-US']/BODY[1]", "ParentRule[AttributeRule]", "1557.3083" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[text()=\"Notifications\"]]", "ChildRule[TextRule]", "1557.3085" ) );
bC.add( new ByFactory( ByXPath.class, "//HEAD/following-sibling::BODY[1]", "SiblingRule", "1557.3087" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY", "TagRule", "1557.3089" ) );
bC.add( new ByFactory( ByXPath.class, "//HTML/BODY[1]", "ParentRule[TagRule]", "1557.3091" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]", "AbsoluteRule", "1557.3093" ) );


objectMap.put( "1557.2655", bC );


bC = new ByFactoryCollection("billing_address_1", "1557.3096");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_address_1\"]", "IDRule", "1557.3098" ) );
bC.add( new ByFactory( ByXPath.class, "billing_address_1", "IDRule", "1557.3100" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_address_1\"]", "IDRule", "1557.3102" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_address_1\"]", "NameRule", "1557.3104" ) );
bC.add( new ByFactory( ByXPath.class, "billing_address_1", "NameRule", "1557.3106" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_address_1\"]", "NameRule", "1557.3108" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@type='text'])[6]", "AttributeRule", "1557.3110" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[4]", "AttributeRule", "1557.3112" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@autocomplete='address-line1'])[1]", "AttributeRule", "1557.3114" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@placeholder='House number and street name'])[1]", "AttributeRule", "1557.3116" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@data-placeholder='House number and street name'])[1]", "AttributeRule", "1557.3118" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[5]/INPUT[1]", "ParentRule[AttributeRule]", "1557.3120" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[5]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.3122" ) );


objectMap.put( "1557.3096", bC );


bC = new ByFactoryCollection("billing_city", "1557.3127");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_city\"]", "IDRule", "1557.3129" ) );
bC.add( new ByFactory( ByXPath.class, "billing_city", "IDRule", "1557.3131" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_city\"]", "IDRule", "1557.3133" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_city\"]", "NameRule", "1557.3135" ) );
bC.add( new ByFactory( ByXPath.class, "billing_city", "NameRule", "1557.3137" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_city\"]", "NameRule", "1557.3139" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@type='text'])[8]", "AttributeRule", "1557.3141" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[6]", "AttributeRule", "1557.3143" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@autocomplete='address-level2'])[1]", "AttributeRule", "1557.3145" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[7]/INPUT[1]", "ParentRule[AttributeRule]", "1557.3147" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[7]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.3149" ) );


objectMap.put( "1557.3127", bC );


bC = new ByFactoryCollection("billing_postcode", "1557.3154");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_postcode\"]", "IDRule", "1557.3156" ) );
bC.add( new ByFactory( ByXPath.class, "billing_postcode", "IDRule", "1557.3158" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_postcode\"]", "IDRule", "1557.3160" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_postcode\"]", "NameRule", "1557.3162" ) );
bC.add( new ByFactory( ByXPath.class, "billing_postcode", "NameRule", "1557.3164" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_postcode\"]", "NameRule", "1557.3166" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@type='text'])[9]", "AttributeRule", "1557.3168" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[7]", "AttributeRule", "1557.3170" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@autocomplete='postal-code'])[1]", "AttributeRule", "1557.3172" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[9]/INPUT[1]", "ParentRule[AttributeRule]", "1557.3174" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[9]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.3176" ) );


objectMap.put( "1557.3154", bC );


bC = new ByFactoryCollection("SelectanoptionAlabamaAlaskaArizonaArkansasCaliforniaColoradoConn...", "1557.3179");
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SELECT[@id=\"billing_state\"]]", "ChildRule[IDRule]", "1557.3181" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@id=\"billing_state\"]]", "ChildRule[IDRule]", "1557.3183" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SELECT[@name=\"billing_state\"]]", "ChildRule[NameRule]", "1557.3185" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@name=\"billing_state\"]]", "ChildRule[NameRule]", "1557.3187" ) );
bC.add( new ByFactory( ByXPath.class, "//LABEL[@for='billing_state']/following-sibling::SPAN[1]", "SiblingRule", "1557.3189" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[8]", "AttributeRule", "1557.3191" ) );
bC.add( new ByFactory( ByXPath.class, "//P[@id=\"billing_state_field\"]/SPAN[1]", "ParentRule[IDRule]", "1557.3193" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_state_field\"]/SPAN[1]", "ParentRule[IDRule]", "1557.3195" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@class='form-row address-field validate-required validate-state form-row-wide'])[1]/SPAN[1]", "ParentRule[AttributeRule]", "1557.3197" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@data-priority='80'])[1]/SPAN[1]", "ParentRule[AttributeRule]", "1557.3199" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@data-o_class='form-row form-row-wide address-field validate-required validate-state'])[1]/SPAN[1]", "ParentRule[AttributeRule]", "1557.3201" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[8]/SPAN[1]", "AbsoluteRule", "1557.3203" ) );


objectMap.put( "1557.3179", bC );


bC = new ByFactoryCollection("billing_phone", "1557.3209");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_phone\"]", "IDRule", "1557.3211" ) );
bC.add( new ByFactory( ByXPath.class, "billing_phone", "IDRule", "1557.3213" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_phone\"]", "IDRule", "1557.3215" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_phone\"]", "NameRule", "1557.3217" ) );
bC.add( new ByFactory( ByXPath.class, "billing_phone", "NameRule", "1557.3219" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_phone\"]", "NameRule", "1557.3221" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@type='tel']", "AttributeRule", "1557.3223" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='tel']", "AttributeRule", "1557.3225" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@autocomplete='tel']", "AttributeRule", "1557.3227" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autocomplete='tel']", "AttributeRule", "1557.3229" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[8]", "AttributeRule", "1557.3231" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[10]/INPUT[1]", "ParentRule[AttributeRule]", "1557.3233" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[10]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.3235" ) );


objectMap.put( "1557.3209", bC );


bC = new ByFactoryCollection("billing_email", "1557.3239");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_email\"]", "IDRule", "1557.3241" ) );
bC.add( new ByFactory( ByXPath.class, "billing_email", "IDRule", "1557.3243" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_email\"]", "IDRule", "1557.3245" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_email\"]", "NameRule", "1557.3247" ) );
bC.add( new ByFactory( ByXPath.class, "billing_email", "NameRule", "1557.3249" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_email\"]", "NameRule", "1557.3251" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@type='email']", "AttributeRule", "1557.3253" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='email']", "AttributeRule", "1557.3255" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@autocomplete='email username']", "AttributeRule", "1557.3257" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autocomplete='email username']", "AttributeRule", "1557.3259" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='input-text '])[9]", "AttributeRule", "1557.3261" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[11]/INPUT[1]", "ParentRule[AttributeRule]", "1557.3263" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/P[11]/SPAN[1]/INPUT[1]", "AbsoluteRule", "1557.3265" ) );


objectMap.put( "1557.3239", bC );


bC = new ByFactoryCollection("createaccount", "1557.3269");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"createaccount\"]", "IDRule", "1557.3271" ) );
bC.add( new ByFactory( ByXPath.class, "createaccount", "IDRule", "1557.3273" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"createaccount\"]", "IDRule", "1557.3275" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"createaccount\"]", "NameRule", "1557.3277" ) );
bC.add( new ByFactory( ByXPath.class, "createaccount", "NameRule", "1557.3279" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"createaccount\"]", "NameRule", "1557.3281" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@type='checkbox'])[2]", "AttributeRule", "1557.3283" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@class='woocommerce-form__input woocommerce-form__input-checkbox input-checkbox'])[1]", "AttributeRule", "1557.3285" ) );
bC.add( new ByFactory( ByXPath.class, "(//INPUT[@value='1'])[1]", "AttributeRule", "1557.3287" ) );
bC.add( new ByFactory( ByXPath.class, "(//LABEL[@class='woocommerce-form__label woocommerce-form__label-for-checkbox checkbox'])[1]/INPUT[1]", "ParentRule[AttributeRule]", "1557.3289" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[1]/DIV[1]/DIV[2]/P[1]/LABEL[1]/INPUT[1]", "AbsoluteRule", "1557.3291" ) );


objectMap.put( "1557.3269", bC );


bC = new ByFactoryCollection("woocommerce_checkout_place_order", "1557.3294");
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@id=\"place_order\"]", "IDRule", "1557.3296" ) );
bC.add( new ByFactory( ByXPath.class, "place_order", "IDRule", "1557.3298" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"place_order\"]", "IDRule", "1557.3300" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@name=\"woocommerce_checkout_place_order\"]", "NameRule", "1557.3302" ) );
bC.add( new ByFactory( ByXPath.class, "woocommerce_checkout_place_order", "NameRule", "1557.3304" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"woocommerce_checkout_place_order\"]", "NameRule", "1557.3306" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce-terms-and-conditions-wrapper']/following-sibling::BUTTON[1]", "SiblingRule", "1557.3308" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@class='button alt']", "AttributeRule", "1557.3310" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='button alt']", "AttributeRule", "1557.3312" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@value='Place order']", "AttributeRule", "1557.3314" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='Place order']", "AttributeRule", "1557.3316" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@data-value='Place order']", "AttributeRule", "1557.3318" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-value='Place order']", "AttributeRule", "1557.3320" ) );
bC.add( new ByFactory( ByXPath.class, "(//BUTTON[@type='submit'])[3]", "AttributeRule", "1557.3322" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='form-row place-order']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.3324" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='form-row place-order']/BUTTON[1]", "ParentRule[AttributeRule]", "1557.3326" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]/DIV[2]/DIV[1]/DIV[1]/BUTTON[1]", "AbsoluteRule", "1557.3328" ) );


objectMap.put( "1557.3294", bC );


bC = new ByFactoryCollection("checkout", "1557.3331");
bC.add( new ByFactory( ByXPath.class, "//FORM[@name=\"checkout\"]", "NameRule", "1557.3333" ) );
bC.add( new ByFactory( ByXPath.class, "checkout", "NameRule", "1557.3335" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"checkout\"]", "NameRule", "1557.3337" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@class='woocommerce-NoticeGroup woocommerce-NoticeGroup-checkout']]", "ChildRule[AttributeRule]", "1557.3339" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@class='woocommerce-NoticeGroup woocommerce-NoticeGroup-checkout']]", "ChildRule[AttributeRule]", "1557.3341" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@id=\"customer_details\"]]", "ChildRule[IDRule]", "1557.3343" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@id=\"customer_details\"]]", "ChildRule[IDRule]", "1557.3345" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@class='col2-set']]", "ChildRule[AttributeRule]", "1557.3347" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@class='col2-set']]", "ChildRule[AttributeRule]", "1557.3349" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./H3[@id=\"order_review_heading\"]]", "ChildRule[IDRule]", "1557.3351" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@id=\"order_review_heading\"]]", "ChildRule[IDRule]", "1557.3353" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@id=\"order_review\"]]", "ChildRule[IDRule]", "1557.3355" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@id=\"order_review\"]]", "ChildRule[IDRule]", "1557.3357" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@class='woocommerce-checkout-review-order']]", "ChildRule[AttributeRule]", "1557.3359" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@class='woocommerce-checkout-review-order']]", "ChildRule[AttributeRule]", "1557.3361" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce-form-login-toggle']/following-sibling::FORM[3]", "SiblingRule", "1557.3363" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='checkout woocommerce-checkout']", "AttributeRule", "1557.3365" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='checkout woocommerce-checkout']", "AttributeRule", "1557.3367" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@action='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1557.3369" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1557.3371" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@enctype='multipart/form-data']", "AttributeRule", "1557.3373" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@enctype='multipart/form-data']", "AttributeRule", "1557.3375" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@novalidate='novalidate']", "AttributeRule", "1557.3377" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@novalidate='novalidate']", "AttributeRule", "1557.3379" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@style='position: static; zoom: 1;']", "AttributeRule", "1557.3381" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@method='post'])[3]", "AttributeRule", "1557.3383" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce']/FORM[3]", "ParentRule[AttributeRule]", "1557.3385" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce']/FORM[3]", "ParentRule[AttributeRule]", "1557.3387" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./H3[text()=\"Your order\"]]", "ChildRule[TextRule]", "1557.3389" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/FORM[3]", "AbsoluteRule", "1557.3391" ) );


objectMap.put( "1557.3331", bC );


bC = new ByFactoryCollection("HOME", "1557.3394");
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[1]", "AttributeRule", "1557.3396" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/'])[2]", "AttributeRule", "1557.3398" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1194\"]/A[1]", "ParentRule[IDRule]", "1557.3400" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1194\"]/A[1]", "ParentRule[IDRule]", "1557.3402" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-1194'])[1]/A[1]", "ParentRule[AttributeRule]", "1557.3404" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[1]/A[1]", "AbsoluteRule", "1557.3406" ) );


objectMap.put( "1557.3394", bC );
/*
    Site: Old Bike Shop 1
    Add a description of alchemydemo01.wpenginepowered.com
    */
    /* Page: The Bike Shop  The Ride Of A Lifetime 
    
    */

    

bC = new ByFactoryCollection("BICYCLES", "5625.442");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/?product_cat=bicycles'])[1]", "IndexedAttributeRule", "5625.444" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[2]", "IndexedAttributeRule", "5625.446" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1252\"]/A[1]", "ParentRule[IDRule]", "5625.448" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1252\"]/A[1]", "ParentRule[IDRule]", "5625.450" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1252'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "5625.452" ) );


objectMap.put( "5625.442", bC );


bC = new ByFactoryCollection("ACCESSORIES", "6663.2533");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/?product_cat=accessories'])[1]", "IndexedAttributeRule", "6663.2535" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[3]", "IndexedAttributeRule", "6663.2537" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1251\"]/A[1]", "ParentRule[IDRule]", "6663.2539" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1251\"]/A[1]", "ParentRule[IDRule]", "6663.2541" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1251'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "6663.2543" ) );


objectMap.put( "6663.2533", bC );


bC = new ByFactoryCollection("CONTACT", "7051.817");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/?page_id=1193'])[1]", "IndexedAttributeRule", "7051.819" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[5]", "IndexedAttributeRule", "7051.821" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-28\"]/A[1]", "ParentRule[IDRule]", "7051.823" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-28\"]/A[1]", "ParentRule[IDRule]", "7051.825" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-28'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "7051.827" ) );


objectMap.put( "7051.817", bC );
/* Page: default 
    
    */

    /* Page: Accessories  The Bike Shop 
    
    */

    /*
    Site: Bike Shop
    Add a description of bikeshop.alchemytesting.com
    */
    /* Page: Checkout  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("KryoX 26 - Model X", "1923.239");
bC.add( new ByFactory( ByXPath.class, "//H2[@class='woocommerce-order-details__title']/following-sibling::TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]", "TableRule[SiblingRule]", "1923.241" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[@class='woocommerce-table woocommerce-table--order-details shop_table order_details']/TBODY[1]/TR[1]/TD[1]/A[1]", "TableRule[AttributeRule]", "1923.243" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-table woocommerce-table--order-details shop_table order_details']/TBODY[1]/TR[1]/TD[1]/A[1]", "TableRule[AttributeRule]", "1923.245" ) );
bC.add( new ByFactory( ByXPath.class, "//A[@href='https://bikeshop.alchemytesting.com/product/kryo-x26-mtb-model-x/']", "AttributeRule", "1923.247" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='https://bikeshop.alchemytesting.com/product/kryo-x26-mtb-model-x/']", "AttributeRule", "1923.249" ) );
bC.add( new ByFactory( ByXPath.class, "//SECTION[@class='woocommerce-order-details']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]", "TableRule[ParentRule[AttributeRule]]", "1923.251" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-order-details']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]", "TableRule[ParentRule[AttributeRule]]", "1923.253" ) );
bC.add( new ByFactory( ByXPath.class, "//SECTION/TABLE[1]/TBODY[1]/TR[1]/TD[1]/A[1]", "TableRule[ParentRule[TagRule]]", "1923.255" ) );
bC.add( new ByFactory( ByXPath.class, "//TD[@class='woocommerce-table__product-name product-name']/A[1]", "ParentRule[AttributeRule]", "1923.257" ) );


objectMap.put( "1923.239", bC );


bC = new ByFactoryCollection("Checkout", "1925.2741");
bC.add( new ByFactory( ByXPath.class, "//H1[@class='entry-title']", "AttributeRule", "1925.2743" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='entry-title']", "AttributeRule", "1925.2745" ) );
bC.add( new ByFactory( ByXPath.class, "//H1[@itemprop='headline']", "AttributeRule", "1925.2747" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@itemprop='headline']", "AttributeRule", "1925.2749" ) );
bC.add( new ByFactory( ByXPath.class, "//HEADER[@class='entry-header ']/H1[1]", "ParentRule[AttributeRule]", "1925.2751" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='entry-header ']/H1[1]", "ParentRule[AttributeRule]", "1925.2753" ) );


objectMap.put( "1925.2741", bC );


bC = new ByFactoryCollection("HOME", "1926.1673");
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[1]", "IndexedAttributeRule", "1926.1675" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/'])[2]", "IndexedAttributeRule", "1926.1677" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1194\"]/A[1]", "ParentRule[IDRule]", "1926.1679" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1194\"]/A[1]", "ParentRule[IDRule]", "1926.1681" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-1194'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "1926.1683" ) );


objectMap.put( "1926.1673", bC );
/* Page: Bicycles  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("KryoX26ModelX", "1923.264");
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='ast-woo-product-category'])[2]/following-sibling::A[1]", "SiblingRule", "1923.266" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/product/kryo-x26-mtb-model-x/'])[3]", "IndexedAttributeRule", "1923.268" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='ast-loop-product__link'])[2]", "IndexedAttributeRule", "1923.270" ) );
bC.add( new ByFactory( ByXPath.class, "(//DIV[@class='astra-shop-summary-wrap'])[2]/A[1]", "ParentRule[IndexedAttributeRule]", "1923.272" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/MAIN[1]/DIV[1]/UL[1]/LI[2]/DIV[2]/A[1]", "AbsoluteRule", "1923.274" ) );


objectMap.put( "1923.264", bC );


bC = new ByFactoryCollection("ACCESSORIES", "1926.1703");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/product-category/accessories/'])[1]", "IndexedAttributeRule", "1926.1705" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[3]", "IndexedAttributeRule", "1926.1707" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1251\"]/A[1]", "ParentRule[IDRule]", "1926.1709" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1251\"]/A[1]", "ParentRule[IDRule]", "1926.1711" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1251'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "1926.1713" ) );


objectMap.put( "1926.1703", bC );


bC = new ByFactoryCollection("woocommerce-LoopProduct-linkwoocommerce-loop-product__link", "11812.1579");
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@src='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-300x300.png']]", "ChildRule[AttributeRule]", "11812.1581" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@src='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-300x300.png']]", "ChildRule[AttributeRule]", "11812.1583" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@srcset='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-300x300.png 300w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-150x150.png 150w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-100x100.png 100w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001.png 500w']]", "ChildRule[AttributeRule]", "11812.1585" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@srcset='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-300x300.png 300w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-150x150.png 150w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001-100x100.png 100w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/03/Bike001.png 500w']]", "ChildRule[AttributeRule]", "11812.1587" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/?product=kryo-x26-mtb-model-y'])[1]", "IndexedAttributeRule", "11812.1589" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[3]", "IndexedAttributeRule", "11812.1591" ) );
bC.add( new ByFactory( ByXPath.class, "(//DIV[@class='astra-shop-thumbnail-wrap'])[3]/A[1]", "ParentRule[IndexedAttributeRule]", "11812.1593" ) );


objectMap.put( "11812.1579", bC );
/* Page: default 
    
    */

    /* Page: The Bike Shop  The Ride Of A Lifetime 
    
    */

    

bC = new ByFactoryCollection("BICYCLES", "1926.1690");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/product-category/bicycles/'])[1]", "IndexedAttributeRule", "1926.1692" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[2]", "IndexedAttributeRule", "1926.1694" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1252\"]/A[1]", "ParentRule[IDRule]", "1926.1696" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1252'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "1926.1698" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]", "AbsoluteRule", "1926.1700" ) );


objectMap.put( "1926.1690", bC );


bC = new ByFactoryCollection("ACCESSORIES", "11812.1391");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/?product_cat=accessories'])[1]", "IndexedAttributeRule", "11812.1393" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[3]", "IndexedAttributeRule", "11812.1395" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1251\"]/A[1]", "ParentRule[IDRule]", "11812.1397" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1251\"]/A[1]", "ParentRule[IDRule]", "11812.1399" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1251'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "11812.1401" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[3]/A[1]", "AbsoluteRule", "11812.1403" ) );


objectMap.put( "11812.1391", bC );
/* Page: Accessories  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("ABOUTUS", "1926.1718");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/about-us/'])[1]", "IndexedAttributeRule", "1926.1720" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[4]", "IndexedAttributeRule", "1926.1722" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-27\"]/A[1]", "ParentRule[IDRule]", "1926.1724" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-27\"]/A[1]", "ParentRule[IDRule]", "1926.1726" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-27'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "1926.1728" ) );


objectMap.put( "1926.1718", bC );


bC = new ByFactoryCollection("woocommerce-LoopProduct-linkwoocommerce-loop-product__link", "11812.1406");
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@id=\"NDM1OjEwMzQ=-1\"]]", "ChildRule[IDRule]", "11812.1408" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@id=\"NDM1OjEwMzQ=-1\"]]", "ChildRule[IDRule]", "11812.1410" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@fetchpriority='high']]", "ChildRule[AttributeRule]", "11812.1412" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@fetchpriority='high']]", "ChildRule[AttributeRule]", "11812.1414" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@nitro-lazy-srcset='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg 300w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-100x100.jpg 100w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-600x600.jpg 600w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-150x150.jpg 150w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-768x768.jpg 768w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4.jpg 1000w']]", "ChildRule[AttributeRule]", "11812.1416" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@nitro-lazy-srcset='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg 300w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-100x100.jpg 100w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-600x600.jpg 600w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-150x150.jpg 150w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-768x768.jpg 768w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4.jpg 1000w']]", "ChildRule[AttributeRule]", "11812.1418" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@nitro-lazy-src='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg']]", "ChildRule[AttributeRule]", "11812.1420" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@nitro-lazy-src='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg']]", "ChildRule[AttributeRule]", "11812.1422" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@src='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg']]", "ChildRule[AttributeRule]", "11812.1424" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@src='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg']]", "ChildRule[AttributeRule]", "11812.1426" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@srcset='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg 300w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-100x100.jpg 100w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-600x600.jpg 600w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-150x150.jpg 150w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-768x768.jpg 768w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4.jpg 1000w']]", "ChildRule[AttributeRule]", "11812.1428" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@srcset='https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-300x300.jpg 300w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-100x100.jpg 100w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-600x600.jpg 600w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-150x150.jpg 150w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4-768x768.jpg 768w, https://cdn-ikpmgbj.nitrocdn.com/HmLGvSdjhoMNNXYrERQWxXxduHvFlRvp/assets/images/optimized/rev-ecc6868/bikeshop.alchemytesting.com/wp-content/uploads/2021/04/accessories-4.jpg 1000w']]", "ChildRule[AttributeRule]", "11812.1430" ) );
bC.add( new ByFactory( ByXPath.class, "(//DIV[@class='astra-shop-thumbnail-wrap'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "11812.1432" ) );


objectMap.put( "11812.1406", bC );
/* Page: About Us  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("CONTACT", "1926.1733");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/contact/'])[1]", "IndexedAttributeRule", "1926.1735" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[5]", "IndexedAttributeRule", "1926.1737" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-28\"]/A[1]", "ParentRule[IDRule]", "1926.1739" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-28\"]/A[1]", "ParentRule[IDRule]", "1926.1741" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-28'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "1926.1743" ) );


objectMap.put( "1926.1733", bC );
/* Page: Contact  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("MYACCOUNT", "1926.1748");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/my-account/'])[1]", "IndexedAttributeRule", "1926.1750" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[6]", "IndexedAttributeRule", "1926.1752" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1353\"]/A[1]", "ParentRule[IDRule]", "1926.1754" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1353\"]/A[1]", "ParentRule[IDRule]", "1926.1756" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1353'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "1926.1758" ) );


objectMap.put( "1926.1748", bC );
/* Page: My Account  The Bike Shop 
    
    */

    /* Page: Bicycle Gloves Blue  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("XL", "11812.1437");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@class='variations cfvsw-variation-disable-logic']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[AttributeRule]", "11812.1439" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='variations cfvsw-variation-disable-logic']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[AttributeRule]", "11812.1441" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[@cellspacing='0']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[AttributeRule]", "11812.1443" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@cellspacing='0']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[AttributeRule]", "11812.1445" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[@role='presentation']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[AttributeRule]", "11812.1447" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='variations_form cart']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1449" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='variations_form cart']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1451" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@action='https://bikeshop.alchemytesting.com/?product=bicycle-gloves-blue']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1453" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='https://bikeshop.alchemytesting.com/?product=bicycle-gloves-blue']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1455" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@method='post']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1457" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@method='post']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1459" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@enctype='multipart/form-data']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1461" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@enctype='multipart/form-data']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1463" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@data-product_id='1092']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1465" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-product_id='1092']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1467" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@data-product_variations='[{\"attributes\":{\"attribute_pa_size\":\"l\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":27,\"display_regular_price\":27,\"image\":{\"title\":\"accessories-4\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"alt\":\"accessories-4\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1080,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>27.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1275,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"m\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":30,\"display_regular_price\":30,\"image\":{\"title\":\"accessories-4\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"alt\":\"accessories-4\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1080,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>30.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1276,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"xl\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":35,\"display_regular_price\":35,\"image\":{\"title\":\"accessories-4\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"alt\":\"accessories-4\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1080,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>35.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1277,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"}]']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1469" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-product_variations='[{\"attributes\":{\"attribute_pa_size\":\"l\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":27,\"display_regular_price\":27,\"image\":{\"title\":\"accessories-4\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"alt\":\"accessories-4\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1080,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>27.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1275,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"m\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":30,\"display_regular_price\":30,\"image\":{\"title\":\"accessories-4\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"alt\":\"accessories-4\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1080,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>30.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1276,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"xl\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":35,\"display_regular_price\":35,\"image\":{\"title\":\"accessories-4\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"alt\":\"accessories-4\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/accessories-4-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1080,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>35.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1277,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"}]']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[3]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1471" ) );


objectMap.put( "11812.1437", bC );


bC = new ByFactoryCollection("ADDTOCART", "11812.1474");
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='quantity']/following-sibling::BUTTON[1]", "SiblingRule", "11812.1476" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@class='single_add_to_cart_button button alt lazyloaded']", "AttributeRule", "11812.1478" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='single_add_to_cart_button button alt lazyloaded']", "AttributeRule", "11812.1480" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@type='submit']", "AttributeRule", "11812.1482" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "11812.1484" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce-variation-add-to-cart variations_button woocommerce-variation-add-to-cart-enabled']/BUTTON[1]", "ParentRule[AttributeRule]", "11812.1486" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-variation-add-to-cart variations_button woocommerce-variation-add-to-cart-enabled']/BUTTON[1]", "ParentRule[AttributeRule]", "11812.1488" ) );


objectMap.put( "11812.1474", bC );


bC = new ByFactoryCollection("woocommerce-LoopProduct-linkwoocommerce-loop-product__link", "11812.1491");
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@src='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-300x300.jpg']]", "ChildRule[AttributeRule]", "11812.1493" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@src='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-300x300.jpg']]", "ChildRule[AttributeRule]", "11812.1495" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./IMG[@srcset='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-300x300.jpg 300w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-100x100.jpg 100w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-600x600.jpg 600w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-150x150.jpg 150w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-768x768.jpg 768w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3.jpg 1000w']]", "ChildRule[AttributeRule]", "11812.1497" ) );
bC.add( new ByFactory( ByXPath.class, "//A[./*[@srcset='https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-300x300.jpg 300w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-100x100.jpg 100w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-600x600.jpg 600w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-150x150.jpg 150w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3-768x768.jpg 768w, https://bikeshop.alchemytesting.com/wp-content/uploads/2021/04/helmet-3.jpg 1000w']]", "ChildRule[AttributeRule]", "11812.1499" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/?product=bicycle-helmet-red'])[1]", "IndexedAttributeRule", "11812.1501" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='woocommerce-LoopProduct-link woocommerce-loop-product__link'])[2]", "IndexedAttributeRule", "11812.1503" ) );
bC.add( new ByFactory( ByXPath.class, "(//DIV[@class='astra-shop-thumbnail-wrap'])[2]/A[1]", "ParentRule[IndexedAttributeRule]", "11812.1505" ) );


objectMap.put( "11812.1491", bC );
/* Page: Bicycle Helmet Red  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("M", "11812.1510");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@class='variations cfvsw-variation-disable-logic']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[AttributeRule]", "11812.1512" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='variations cfvsw-variation-disable-logic']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[AttributeRule]", "11812.1514" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[@cellspacing='0']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[AttributeRule]", "11812.1516" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@cellspacing='0']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[AttributeRule]", "11812.1518" ) );
bC.add( new ByFactory( ByXPath.class, "//TABLE[@role='presentation']/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[AttributeRule]", "11812.1520" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='variations_form cart']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1522" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='variations_form cart']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1524" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@action='https://bikeshop.alchemytesting.com/?product=bicycle-helmet-red']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1526" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='https://bikeshop.alchemytesting.com/?product=bicycle-helmet-red']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1528" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@method='post']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1530" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@method='post']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1532" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@enctype='multipart/form-data']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1534" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@enctype='multipart/form-data']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1536" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@data-product_id='631']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1538" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-product_id='631']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1540" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@data-product_variations='[{\"attributes\":{\"attribute_pa_size\":\"l\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":200,\"display_regular_price\":200,\"image\":{\"title\":\"helmet-3\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"alt\":\"helmet-3\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1085,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>200.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1290,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"m\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":215,\"display_regular_price\":215,\"image\":{\"title\":\"helmet-3\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"alt\":\"helmet-3\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1085,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>215.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1291,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"xl\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":225,\"display_regular_price\":225,\"image\":{\"title\":\"helmet-3\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"alt\":\"helmet-3\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1085,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>225.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1292,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"}]']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1542" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-product_variations='[{\"attributes\":{\"attribute_pa_size\":\"l\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":200,\"display_regular_price\":200,\"image\":{\"title\":\"helmet-3\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"alt\":\"helmet-3\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1085,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>200.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1290,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"m\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":215,\"display_regular_price\":215,\"image\":{\"title\":\"helmet-3\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"alt\":\"helmet-3\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1085,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>215.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1291,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"},{\"attributes\":{\"attribute_pa_size\":\"xl\"},\"availability_html\":\"\",\"backorders_allowed\":false,\"dimensions\":{\"length\":\"\",\"width\":\"\",\"height\":\"\"},\"dimensions_html\":\"N\\/A\",\"display_price\":225,\"display_regular_price\":225,\"image\":{\"title\":\"helmet-3\",\"caption\":\"\",\"url\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"alt\":\"helmet-3\",\"src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg\",\"srcset\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-600x600.jpg 600w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg 300w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg 100w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-150x150.jpg 150w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-768x768.jpg 768w, https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg 1000w\",\"sizes\":\"(max-width: 600px) 100vw, 600px\",\"full_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3.jpg\",\"full_src_w\":1000,\"full_src_h\":1000,\"gallery_thumbnail_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-100x100.jpg\",\"gallery_thumbnail_src_w\":100,\"gallery_thumbnail_src_h\":100,\"thumb_src\":\"https:\\/\\/bikeshop.alchemytesting.com\\/wp-content\\/uploads\\/2021\\/04\\/helmet-3-300x300.jpg\",\"thumb_src_w\":300,\"thumb_src_h\":300,\"src_w\":600,\"src_h\":600},\"image_id\":1085,\"is_downloadable\":false,\"is_in_stock\":true,\"is_purchasable\":true,\"is_sold_individually\":\"no\",\"is_virtual\":false,\"max_qty\":\"\",\"min_qty\":1,\"price_html\":\"<span class=\\\"price\\\"><span class=\\\"woocommerce-Price-amount amount\\\"><bdi><span class=\\\"woocommerce-Price-currencySymbol\\\">&#36;<\\/span>225.00<\\/bdi><\\/span><\\/span>\",\"sku\":\"\",\"variation_description\":\"\",\"variation_id\":1292,\"variation_is_active\":true,\"variation_is_visible\":true,\"weight\":\"\",\"weight_html\":\"N\\/A\"}]']/TABLE[1]/TBODY[1]/TR[1]/TD[1]/DIV[2]/DIV[2]/DIV[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1544" ) );


objectMap.put( "11812.1510", bC );


bC = new ByFactoryCollection("ADDTOCART", "11812.1547");
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='quantity']/following-sibling::BUTTON[1]", "SiblingRule", "11812.1549" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@class='single_add_to_cart_button button alt']", "AttributeRule", "11812.1551" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='single_add_to_cart_button button alt']", "AttributeRule", "11812.1553" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@type='submit']", "AttributeRule", "11812.1555" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "11812.1557" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce-variation-add-to-cart variations_button woocommerce-variation-add-to-cart-enabled']/BUTTON[1]", "ParentRule[AttributeRule]", "11812.1559" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-variation-add-to-cart variations_button woocommerce-variation-add-to-cart-enabled']/BUTTON[1]", "ParentRule[AttributeRule]", "11812.1561" ) );


objectMap.put( "11812.1547", bC );


bC = new ByFactoryCollection("BICYCLES", "11812.1564");
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://bikeshop.alchemytesting.com/?product_cat=bicycles'])[1]", "IndexedAttributeRule", "11812.1566" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='menu-link'])[2]", "IndexedAttributeRule", "11812.1568" ) );
bC.add( new ByFactory( ByXPath.class, "//LI[@id=\"menu-item-1252\"]/A[1]", "ParentRule[IDRule]", "11812.1570" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"menu-item-1252\"]/A[1]", "ParentRule[IDRule]", "11812.1572" ) );
bC.add( new ByFactory( ByXPath.class, "(//LI[@class='menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-1252'])[1]/A[1]", "ParentRule[IndexedAttributeRule]", "11812.1574" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/HEADER[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/DIV[1]/DIV[1]/DIV[1]/NAV[1]/DIV[1]/UL[1]/LI[2]/A[1]", "AbsoluteRule", "11812.1576" ) );


objectMap.put( "11812.1564", bC );
/* Page: Kryo X26  Model Y  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("add-to-cart", "11812.1598");
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@name=\"add-to-cart\"]", "NameRule", "11812.1600" ) );
bC.add( new ByFactory( ByName.class, "add-to-cart", "NameRule", "11812.1602" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"add-to-cart\"]", "NameRule", "11812.1604" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='quantity']/following-sibling::BUTTON[1]", "SiblingRule", "11812.1606" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@type='submit']", "AttributeRule", "11812.1608" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "11812.1610" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@value='325']", "AttributeRule", "11812.1612" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='325']", "AttributeRule", "11812.1614" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@class='single_add_to_cart_button button alt']", "AttributeRule", "11812.1616" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='single_add_to_cart_button button alt']", "AttributeRule", "11812.1618" ) );


objectMap.put( "11812.1598", bC );


bC = new ByFactoryCollection("VIEWCART", "11812.1621");
bC.add( new ByFactory( ByXPath.class, "//A[@tabindex='1']", "AttributeRule", "11812.1623" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@tabindex='1']", "AttributeRule", "11812.1625" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce-message']/A[1]", "ParentRule[AttributeRule]", "11812.1627" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-message']/A[1]", "ParentRule[AttributeRule]", "11812.1629" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@role='alert']/A[1]", "ParentRule[AttributeRule]", "11812.1631" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='alert']/A[1]", "ParentRule[AttributeRule]", "11812.1633" ) );


objectMap.put( "11812.1621", bC );
/* Page: Cart  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("coupon_code", "11812.1638");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/TBODY[1]/TR[4]/TD[1]/DIV[1]/INPUT[1]", "TableRule[AttributeRule]", "11812.1640" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/TBODY[1]/TR[4]/TD[1]/DIV[1]/INPUT[1]", "TableRule[AttributeRule]", "11812.1642" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='woocommerce-cart-form']/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/INPUT[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1644" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-cart-form']/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/INPUT[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1646" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@action='https://bikeshop.alchemytesting.com/?page_id=15'])[1]/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/INPUT[1]", "TableRule[ParentRule[IndexedAttributeRule]]", "11812.1648" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@method='post'])[1]/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/INPUT[1]", "TableRule[ParentRule[IndexedAttributeRule]]", "11812.1650" ) );


objectMap.put( "11812.1638", bC );


bC = new ByFactoryCollection("apply_coupon", "11812.1654");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/TBODY[1]/TR[4]/TD[1]/DIV[1]/BUTTON[1]", "TableRule[AttributeRule]", "11812.1656" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='shop_table shop_table_responsive cart woocommerce-cart-form__contents']/TBODY[1]/TR[4]/TD[1]/DIV[1]/BUTTON[1]", "TableRule[AttributeRule]", "11812.1658" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='woocommerce-cart-form']/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/BUTTON[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1660" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-cart-form']/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/BUTTON[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1662" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@action='https://bikeshop.alchemytesting.com/?page_id=15'])[1]/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/BUTTON[1]", "TableRule[ParentRule[IndexedAttributeRule]]", "11812.1664" ) );
bC.add( new ByFactory( ByXPath.class, "(//FORM[@method='post'])[1]/TABLE[1]/TBODY[1]/TR[4]/TD[1]/DIV[1]/BUTTON[1]", "TableRule[ParentRule[IndexedAttributeRule]]", "11812.1666" ) );


objectMap.put( "11812.1654", bC );


bC = new ByFactoryCollection("Couponcheaperbuydoesnotexist!", "11812.1669");
bC.add( new ByFactory( ByXPath.class, "//UL[@class='woocommerce-error']/LI[1]", "ParentRule[AttributeRule]", "11812.1671" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce-error']/LI[1]", "ParentRule[AttributeRule]", "11812.1673" ) );
bC.add( new ByFactory( ByXPath.class, "//UL[@role='alert']/LI[1]", "ParentRule[AttributeRule]", "11812.1675" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@role='alert']/LI[1]", "ParentRule[AttributeRule]", "11812.1677" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/DIV[1]/UL[1]/LI[1]", "AbsoluteRule", "11812.1679" ) );


objectMap.put( "11812.1669", bC );


bC = new ByFactoryCollection("$60000", "11812.1684");
bC.add( new ByFactory( ByXPath.class, "//TABLE[@class='shop_table shop_table_responsive']/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[AttributeRule]", "11812.1686" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='shop_table shop_table_responsive']/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[AttributeRule]", "11812.1688" ) );
bC.add( new ByFactory( ByXPath.class, "//TBODY[./TR[@class='cart-subtotal']]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ChildRule[AttributeRule]]", "11812.1690" ) );
bC.add( new ByFactory( ByXPath.class, "//TBODY[./*[@class='cart-subtotal']]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ChildRule[AttributeRule]]", "11812.1692" ) );
bC.add( new ByFactory( ByXPath.class, "//TBODY[./TR[@class='woocommerce-shipping-totals shipping']]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ChildRule[AttributeRule]]", "11812.1694" ) );
bC.add( new ByFactory( ByXPath.class, "//TBODY[./*[@class='woocommerce-shipping-totals shipping']]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ChildRule[AttributeRule]]", "11812.1696" ) );
bC.add( new ByFactory( ByXPath.class, "//TBODY[./TR[@class='order-total']]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ChildRule[AttributeRule]]", "11812.1698" ) );
bC.add( new ByFactory( ByXPath.class, "//TBODY[./*[@class='order-total']]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ChildRule[AttributeRule]]", "11812.1700" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='cart_totals calculated_shipping']/TABLE[1]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1702" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='cart_totals calculated_shipping']/TABLE[1]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[ParentRule[AttributeRule]]", "11812.1704" ) );
bC.add( new ByFactory( ByXPath.class, "//H2/following-sibling::TABLE[1]/TBODY[1]/TR[3]/TD[1]/STRONG[1]/SPAN[1]/BDI[1]", "TableRule[SiblingRule]", "11812.1706" ) );


objectMap.put( "11812.1684", bC );


bC = new ByFactoryCollection("PROCEEDTOCHECKOUT", "11812.1709");
bC.add( new ByFactory( ByXPath.class, "//A[@class='checkout-button button alt wc-forward']", "AttributeRule", "11812.1711" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='checkout-button button alt wc-forward']", "AttributeRule", "11812.1713" ) );
bC.add( new ByFactory( ByXPath.class, "//A[@href='https://bikeshop.alchemytesting.com/?page_id=1190']", "AttributeRule", "11812.1715" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='https://bikeshop.alchemytesting.com/?page_id=1190']", "AttributeRule", "11812.1717" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='wc-proceed-to-checkout']/A[1]", "ParentRule[AttributeRule]", "11812.1719" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wc-proceed-to-checkout']/A[1]", "ParentRule[AttributeRule]", "11812.1721" ) );


objectMap.put( "11812.1709", bC );
/*
    Site: Old Bike Shop
    Add a description of alchemydemo01.wpenginepowered.com
    */
    /* Page: The Bike Shop  The Ride Of A Lifetime 
    
    */

    

bC = new ByFactoryCollection("EXPLORENOW", "1764.1929");
bC.add( new ByFactory( ByXPath.class, "(//A[@class='elementor-button elementor-button-link elementor-size-sm'])[3]", "IndexedAttributeRule", "1764.1931" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/product-category/bicycles/'])[5]", "IndexedAttributeRule", "1764.1933" ) );
bC.add( new ByFactory( ByXPath.class, "(//DIV[@class='elementor-button-wrapper'])[3]/A[1]", "ParentRule[IndexedAttributeRule]", "1764.1935" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/MAIN[1]/ARTICLE[1]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[4]/DIV[1]/DIV[1]/DIV[1]/DIV[1]/A[1]", "AbsoluteRule", "1764.1937" ) );


objectMap.put( "1764.1929", bC );
/* Page: default 
    
    */

    /* Page: Bicycles  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("KryoX26MTBModelX", "1764.1944");
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='ast-woo-product-category'])[2]/following-sibling::A[1]", "SiblingRule", "1764.1946" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-x/'])[2]", "IndexedAttributeRule", "1764.1948" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='ast-loop-product__link'])[2]", "IndexedAttributeRule", "1764.1950" ) );
bC.add( new ByFactory( ByXPath.class, "(//DIV[@class='astra-shop-summary-wrap'])[2]/A[1]", "ParentRule[IndexedAttributeRule]", "1764.1952" ) );
bC.add( new ByFactory( ByXPath.class, "/BODY[1]/DIV[1]/DIV[1]/DIV[1]/DIV[2]/MAIN[1]/DIV[1]/UL[1]/LI[2]/DIV[2]/A[1]", "AbsoluteRule", "1764.1954" ) );


objectMap.put( "1764.1944", bC );
/* Page: Kryo X26 MTB  Model X  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("add-to-cart", "1764.1959");
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@name=\"add-to-cart\"]", "NameRule", "1764.1961" ) );
bC.add( new ByFactory( ByName.class, "add-to-cart", "NameRule", "1764.1963" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"add-to-cart\"]", "NameRule", "1764.1965" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='quantity']/following-sibling::BUTTON[1]", "SiblingRule", "1764.1967" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@type='submit']", "AttributeRule", "1764.1969" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='submit']", "AttributeRule", "1764.1971" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@value='106']", "AttributeRule", "1764.1973" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='106']", "AttributeRule", "1764.1975" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@class='single_add_to_cart_button button alt']", "AttributeRule", "1764.1977" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='single_add_to_cart_button button alt']", "AttributeRule", "1764.1979" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='cart']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1981" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='cart']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1983" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@action='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-x/']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1985" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='https://alchemydemo01.wpenginepowered.com/product/kryo-x26-mtb-model-x/']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1987" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@method='post']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1989" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@method='post']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1991" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@enctype='multipart/form-data']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1993" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@enctype='multipart/form-data']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.1995" ) );


objectMap.put( "1764.1959", bC );


bC = new ByFactoryCollection("VIEWCART", "1764.1998");
bC.add( new ByFactory( ByXPath.class, "//A[@tabindex='1']", "AttributeRule", "1764.2000" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@tabindex='1']", "AttributeRule", "1764.2002" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@href='https://alchemydemo01.wpenginepowered.com/cart/'])[3]", "IndexedAttributeRule", "1764.2004" ) );
bC.add( new ByFactory( ByXPath.class, "(//A[@class='button wc-forward'])[2]", "IndexedAttributeRule", "1764.2006" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='wc-block-components-notice-banner__content']/A[1]", "ParentRule[AttributeRule]", "1764.2008" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wc-block-components-notice-banner__content']/A[1]", "ParentRule[AttributeRule]", "1764.2010" ) );


objectMap.put( "1764.1998", bC );
/* Page: Cart  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("PROCEEDTOCHECKOUT", "1764.2015");
bC.add( new ByFactory( ByXPath.class, "//A[@href='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1764.2017" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@href='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1764.2019" ) );
bC.add( new ByFactory( ByXPath.class, "//A[@class='checkout-button button alt wc-forward']", "AttributeRule", "1764.2021" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='checkout-button button alt wc-forward']", "AttributeRule", "1764.2023" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='wc-proceed-to-checkout']/A[1]", "ParentRule[AttributeRule]", "1764.2025" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='wc-proceed-to-checkout']/A[1]", "ParentRule[AttributeRule]", "1764.2027" ) );


objectMap.put( "1764.2015", bC );
/* Page: Checkout  The Bike Shop 
    
    */

    

bC = new ByFactoryCollection("billing_first_name", "1764.2032");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_first_name\"]", "IDRule", "1764.2034" ) );
bC.add( new ByFactory( ById.class, "billing_first_name", "IDRule", "1764.2036" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_first_name\"]", "IDRule", "1764.2038" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_first_name\"]", "NameRule", "1764.2040" ) );
bC.add( new ByFactory( ByName.class, "billing_first_name", "NameRule", "1764.2042" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_first_name\"]", "NameRule", "1764.2044" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[1]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2046" ) );


objectMap.put( "1764.2032", bC );


bC = new ByFactoryCollection("billing_last_name", "1764.2050");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_last_name\"]", "IDRule", "1764.2052" ) );
bC.add( new ByFactory( ById.class, "billing_last_name", "IDRule", "1764.2054" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_last_name\"]", "IDRule", "1764.2056" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_last_name\"]", "NameRule", "1764.2058" ) );
bC.add( new ByFactory( ByName.class, "billing_last_name", "NameRule", "1764.2060" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_last_name\"]", "NameRule", "1764.2062" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[2]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2064" ) );


objectMap.put( "1764.2050", bC );


bC = new ByFactoryCollection("billing_company", "1764.2069");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_company\"]", "IDRule", "1764.2071" ) );
bC.add( new ByFactory( ById.class, "billing_company", "IDRule", "1764.2073" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_company\"]", "IDRule", "1764.2075" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_company\"]", "NameRule", "1764.2077" ) );
bC.add( new ByFactory( ByName.class, "billing_company", "NameRule", "1764.2079" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_company\"]", "NameRule", "1764.2081" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[3]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2083" ) );


objectMap.put( "1764.2069", bC );


bC = new ByFactoryCollection("billing_address_1", "1764.2088");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_address_1\"]", "IDRule", "1764.2090" ) );
bC.add( new ByFactory( ById.class, "billing_address_1", "IDRule", "1764.2092" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_address_1\"]", "IDRule", "1764.2094" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_address_1\"]", "NameRule", "1764.2096" ) );
bC.add( new ByFactory( ByName.class, "billing_address_1", "NameRule", "1764.2098" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_address_1\"]", "NameRule", "1764.2100" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[5]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2102" ) );


objectMap.put( "1764.2088", bC );


bC = new ByFactoryCollection("billing_address_2", "1764.2107");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_address_2\"]", "IDRule", "1764.2109" ) );
bC.add( new ByFactory( ById.class, "billing_address_2", "IDRule", "1764.2111" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_address_2\"]", "IDRule", "1764.2113" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_address_2\"]", "NameRule", "1764.2115" ) );
bC.add( new ByFactory( ByName.class, "billing_address_2", "NameRule", "1764.2117" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_address_2\"]", "NameRule", "1764.2119" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[6]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2121" ) );


objectMap.put( "1764.2107", bC );


bC = new ByFactoryCollection("billing_city", "1764.2125");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_city\"]", "IDRule", "1764.2127" ) );
bC.add( new ByFactory( ById.class, "billing_city", "IDRule", "1764.2129" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_city\"]", "IDRule", "1764.2131" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_city\"]", "NameRule", "1764.2133" ) );
bC.add( new ByFactory( ByName.class, "billing_city", "NameRule", "1764.2135" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_city\"]", "NameRule", "1764.2137" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[7]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2139" ) );


objectMap.put( "1764.2125", bC );


bC = new ByFactoryCollection("SelectanoptionAlabamaAlaskaArizonaArkansasCaliforniaColoradoConn...", "1764.2144");
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SELECT[@id=\"billing_state\"]]", "ChildRule[IDRule]", "1764.2146" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@id=\"billing_state\"]]", "ChildRule[IDRule]", "1764.2148" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SELECT[@name=\"billing_state\"]]", "ChildRule[NameRule]", "1764.2150" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@name=\"billing_state\"]]", "ChildRule[NameRule]", "1764.2152" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./SPAN[@class='select2 select2-container select2-container--default select2-container--focus']]", "ChildRule[AttributeRule]", "1764.2154" ) );
bC.add( new ByFactory( ByXPath.class, "//SPAN[./*[@class='select2 select2-container select2-container--default select2-container--focus']]", "ChildRule[AttributeRule]", "1764.2156" ) );
bC.add( new ByFactory( ByXPath.class, "//LABEL[@for='billing_state']/following-sibling::SPAN[1]", "SiblingRule", "1764.2158" ) );
bC.add( new ByFactory( ByXPath.class, "//P[@id=\"billing_state_field\"]/SPAN[1]", "ParentRule[IDRule]", "1764.2160" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_state_field\"]/SPAN[1]", "ParentRule[IDRule]", "1764.2162" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@class='form-row address-field validate-required validate-state form-row-wide'])[1]/SPAN[1]", "ParentRule[IndexedAttributeRule]", "1764.2164" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@data-priority='80'])[1]/SPAN[1]", "ParentRule[IndexedAttributeRule]", "1764.2166" ) );
bC.add( new ByFactory( ByXPath.class, "(//P[@data-o_class='form-row form-row-wide address-field validate-required validate-state'])[1]/SPAN[1]", "ParentRule[IndexedAttributeRule]", "1764.2168" ) );


objectMap.put( "1764.2144", bC );


bC = new ByFactoryCollection("SkiptocontentHOMEBICYCLESACCESSORIESABOUTUSCONTACT$35000Checkout...", "1764.2171");
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@class='skip-link screen-reader-text']]", "ChildRule[AttributeRule]", "1764.2173" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='skip-link screen-reader-text']]", "ChildRule[AttributeRule]", "1764.2175" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@href='#content']]", "ChildRule[AttributeRule]", "1764.2177" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@href='#content']]", "ChildRule[AttributeRule]", "1764.2179" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@role='link']]", "ChildRule[AttributeRule]", "1764.2181" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@role='link']]", "ChildRule[AttributeRule]", "1764.2183" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./A[@title='Skip to content']]", "ChildRule[AttributeRule]", "1764.2185" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@title='Skip to content']]", "ChildRule[AttributeRule]", "1764.2187" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@id=\"page\"]]", "ChildRule[IDRule]", "1764.2189" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"page\"]]", "ChildRule[IDRule]", "1764.2191" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@class='hfeed site']]", "ChildRule[AttributeRule]", "1764.2193" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='hfeed site']]", "ChildRule[AttributeRule]", "1764.2195" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./LINK[@id=\"wc-blocks-style-css\"]]", "ChildRule[IDRule]", "1764.2197" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-style-css\"]]", "ChildRule[IDRule]", "1764.2199" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./LINK[@href='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks.css?ver=11.8.0-dev']]", "ChildRule[AttributeRule]", "1764.2201" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@href='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks.css?ver=11.8.0-dev']]", "ChildRule[AttributeRule]", "1764.2203" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-theme-js-js-extra\"]]", "ChildRule[IDRule]", "1764.2205" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-theme-js-js-extra\"]]", "ChildRule[IDRule]", "1764.2207" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-theme-js-js\"]]", "ChildRule[IDRule]", "1764.2209" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-theme-js-js\"]]", "ChildRule[IDRule]", "1764.2211" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/frontend.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1764.2213" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/frontend.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1764.2215" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-mobile-cart-js-extra\"]]", "ChildRule[IDRule]", "1764.2217" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-mobile-cart-js-extra\"]]", "ChildRule[IDRule]", "1764.2219" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-mobile-cart-js\"]]", "ChildRule[IDRule]", "1764.2221" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-mobile-cart-js\"]]", "ChildRule[IDRule]", "1764.2223" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/mobile-cart.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1764.2225" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/themes/astra/assets/js/minified/mobile-cart.min.js?ver=4.6.4']]", "ChildRule[AttributeRule]", "1764.2227" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"sourcebuster-js-js\"]]", "ChildRule[IDRule]", "1764.2229" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"sourcebuster-js-js\"]]", "ChildRule[IDRule]", "1764.2231" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/sourcebuster/sourcebuster.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1764.2233" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/sourcebuster/sourcebuster.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1764.2235" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-order-attribution-js-extra\"]]", "ChildRule[IDRule]", "1764.2237" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-order-attribution-js-extra\"]]", "ChildRule[IDRule]", "1764.2239" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-order-attribution-js\"]]", "ChildRule[IDRule]", "1764.2241" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-order-attribution-js\"]]", "ChildRule[IDRule]", "1764.2243" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1764.2245" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1764.2247" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"react-js\"]]", "ChildRule[IDRule]", "1764.2249" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"react-js\"]]", "ChildRule[IDRule]", "1764.2251" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1764.2253" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1764.2255" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-deprecated-js\"]]", "ChildRule[IDRule]", "1764.2257" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-deprecated-js\"]]", "ChildRule[IDRule]", "1764.2259" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/deprecated.min.js?ver=73ad3591e7bc95f4777a']]", "ChildRule[AttributeRule]", "1764.2261" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/deprecated.min.js?ver=73ad3591e7bc95f4777a']]", "ChildRule[AttributeRule]", "1764.2263" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-dom-js\"]]", "ChildRule[IDRule]", "1764.2265" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-dom-js\"]]", "ChildRule[IDRule]", "1764.2267" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom.min.js?ver=49ff2869626fbeaacc23']]", "ChildRule[AttributeRule]", "1764.2269" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom.min.js?ver=49ff2869626fbeaacc23']]", "ChildRule[AttributeRule]", "1764.2271" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"react-dom-js\"]]", "ChildRule[IDRule]", "1764.2273" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"react-dom-js\"]]", "ChildRule[IDRule]", "1764.2275" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react-dom.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1764.2277" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/react-dom.min.js?ver=18.2.0']]", "ChildRule[AttributeRule]", "1764.2279" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-escape-html-js\"]]", "ChildRule[IDRule]", "1764.2281" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-escape-html-js\"]]", "ChildRule[IDRule]", "1764.2283" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/escape-html.min.js?ver=03e27a7b6ae14f7afaa6']]", "ChildRule[AttributeRule]", "1764.2285" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/escape-html.min.js?ver=03e27a7b6ae14f7afaa6']]", "ChildRule[AttributeRule]", "1764.2287" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-element-js\"]]", "ChildRule[IDRule]", "1764.2289" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-element-js\"]]", "ChildRule[IDRule]", "1764.2291" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/element.min.js?ver=ed1c7604880e8b574b40']]", "ChildRule[AttributeRule]", "1764.2293" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/element.min.js?ver=ed1c7604880e8b574b40']]", "ChildRule[AttributeRule]", "1764.2295" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-is-shallow-equal-js\"]]", "ChildRule[IDRule]", "1764.2297" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-is-shallow-equal-js\"]]", "ChildRule[IDRule]", "1764.2299" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/is-shallow-equal.min.js?ver=20c2b06ecf04afb14fee']]", "ChildRule[AttributeRule]", "1764.2301" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/is-shallow-equal.min.js?ver=20c2b06ecf04afb14fee']]", "ChildRule[AttributeRule]", "1764.2303" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-i18n-js\"]]", "ChildRule[IDRule]", "1764.2305" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-i18n-js\"]]", "ChildRule[IDRule]", "1764.2307" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/i18n.min.js?ver=7701b0c3857f914212ef']]", "ChildRule[AttributeRule]", "1764.2309" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/i18n.min.js?ver=7701b0c3857f914212ef']]", "ChildRule[AttributeRule]", "1764.2311" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-i18n-js-after\"]]", "ChildRule[IDRule]", "1764.2313" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-i18n-js-after\"]]", "ChildRule[IDRule]", "1764.2315" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-keycodes-js\"]]", "ChildRule[IDRule]", "1764.2317" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-keycodes-js\"]]", "ChildRule[IDRule]", "1764.2319" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/keycodes.min.js?ver=3460bd0fac9859d6886c']]", "ChildRule[AttributeRule]", "1764.2321" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/keycodes.min.js?ver=3460bd0fac9859d6886c']]", "ChildRule[AttributeRule]", "1764.2323" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-priority-queue-js\"]]", "ChildRule[IDRule]", "1764.2325" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-priority-queue-js\"]]", "ChildRule[IDRule]", "1764.2327" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/priority-queue.min.js?ver=422e19e9d48b269c5219']]", "ChildRule[AttributeRule]", "1764.2329" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/priority-queue.min.js?ver=422e19e9d48b269c5219']]", "ChildRule[AttributeRule]", "1764.2331" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-compose-js\"]]", "ChildRule[IDRule]", "1764.2333" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-compose-js\"]]", "ChildRule[IDRule]", "1764.2335" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/compose.min.js?ver=3189b344ff39fef940b7']]", "ChildRule[AttributeRule]", "1764.2337" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/compose.min.js?ver=3189b344ff39fef940b7']]", "ChildRule[AttributeRule]", "1764.2339" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-private-apis-js\"]]", "ChildRule[IDRule]", "1764.2341" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-private-apis-js\"]]", "ChildRule[IDRule]", "1764.2343" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/private-apis.min.js?ver=11cb2ebaa70a9f1f0ab5']]", "ChildRule[AttributeRule]", "1764.2345" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/private-apis.min.js?ver=11cb2ebaa70a9f1f0ab5']]", "ChildRule[AttributeRule]", "1764.2347" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-redux-routine-js\"]]", "ChildRule[IDRule]", "1764.2349" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-redux-routine-js\"]]", "ChildRule[IDRule]", "1764.2351" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/redux-routine.min.js?ver=0be1b2a6a79703e28531']]", "ChildRule[AttributeRule]", "1764.2353" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/redux-routine.min.js?ver=0be1b2a6a79703e28531']]", "ChildRule[AttributeRule]", "1764.2355" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-data-js\"]]", "ChildRule[IDRule]", "1764.2357" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-data-js\"]]", "ChildRule[IDRule]", "1764.2359" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data.min.js?ver=dc5f255634f3da29c8d5']]", "ChildRule[AttributeRule]", "1764.2361" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data.min.js?ver=dc5f255634f3da29c8d5']]", "ChildRule[AttributeRule]", "1764.2363" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-data-js-after\"]]", "ChildRule[IDRule]", "1764.2365" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-data-js-after\"]]", "ChildRule[IDRule]", "1764.2367" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"lodash-js\"]]", "ChildRule[IDRule]", "1764.2369" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"lodash-js\"]]", "ChildRule[IDRule]", "1764.2371" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/lodash.min.js?ver=4.17.19']]", "ChildRule[AttributeRule]", "1764.2373" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/vendor/lodash.min.js?ver=4.17.19']]", "ChildRule[AttributeRule]", "1764.2375" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"lodash-js-after\"]]", "ChildRule[IDRule]", "1764.2377" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"lodash-js-after\"]]", "ChildRule[IDRule]", "1764.2379" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-registry-js\"]]", "ChildRule[IDRule]", "1764.2381" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-registry-js\"]]", "ChildRule[IDRule]", "1764.2383" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-registry.js?ver=1c879273bd5c193cad0a']]", "ChildRule[AttributeRule]", "1764.2385" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-registry.js?ver=1c879273bd5c193cad0a']]", "ChildRule[AttributeRule]", "1764.2387" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-url-js\"]]", "ChildRule[IDRule]", "1764.2389" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-url-js\"]]", "ChildRule[IDRule]", "1764.2391" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/url.min.js?ver=b4979979018b684be209']]", "ChildRule[AttributeRule]", "1764.2393" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/url.min.js?ver=b4979979018b684be209']]", "ChildRule[AttributeRule]", "1764.2395" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-api-fetch-js\"]]", "ChildRule[IDRule]", "1764.2397" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-api-fetch-js\"]]", "ChildRule[IDRule]", "1764.2399" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/api-fetch.min.js?ver=0fa4dabf8bf2c7adf21a']]", "ChildRule[AttributeRule]", "1764.2401" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/api-fetch.min.js?ver=0fa4dabf8bf2c7adf21a']]", "ChildRule[AttributeRule]", "1764.2403" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-api-fetch-js-after\"]]", "ChildRule[IDRule]", "1764.2405" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-api-fetch-js-after\"]]", "ChildRule[IDRule]", "1764.2407" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-settings-js-before\"]]", "ChildRule[IDRule]", "1764.2409" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-settings-js-before\"]]", "ChildRule[IDRule]", "1764.2411" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-settings-js\"]]", "ChildRule[IDRule]", "1764.2413" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-settings-js\"]]", "ChildRule[IDRule]", "1764.2415" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-settings.js?ver=07c2f0675ddd247d2325']]", "ChildRule[AttributeRule]", "1764.2417" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-settings.js?ver=07c2f0675ddd247d2325']]", "ChildRule[AttributeRule]", "1764.2419" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-data-controls-js\"]]", "ChildRule[IDRule]", "1764.2421" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-data-controls-js\"]]", "ChildRule[IDRule]", "1764.2423" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data-controls.min.js?ver=fe4ccc8a1782ea8e2cb1']]", "ChildRule[AttributeRule]", "1764.2425" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/data-controls.min.js?ver=fe4ccc8a1782ea8e2cb1']]", "ChildRule[AttributeRule]", "1764.2427" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-html-entities-js\"]]", "ChildRule[IDRule]", "1764.2429" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-html-entities-js\"]]", "ChildRule[IDRule]", "1764.2431" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/html-entities.min.js?ver=36a4a255da7dd2e1bf8e']]", "ChildRule[AttributeRule]", "1764.2433" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/html-entities.min.js?ver=36a4a255da7dd2e1bf8e']]", "ChildRule[AttributeRule]", "1764.2435" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-notices-js\"]]", "ChildRule[IDRule]", "1764.2437" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-notices-js\"]]", "ChildRule[IDRule]", "1764.2439" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/notices.min.js?ver=38e88f4b627cf873edd0']]", "ChildRule[AttributeRule]", "1764.2441" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/notices.min.js?ver=38e88f4b627cf873edd0']]", "ChildRule[AttributeRule]", "1764.2443" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-middleware-js-before\"]]", "ChildRule[IDRule]", "1764.2445" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-middleware-js-before\"]]", "ChildRule[IDRule]", "1764.2447" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-middleware-js\"]]", "ChildRule[IDRule]", "1764.2449" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-middleware-js\"]]", "ChildRule[IDRule]", "1764.2451" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-middleware.js?ver=ca04183222edaf8a26be']]", "ChildRule[AttributeRule]", "1764.2453" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-middleware.js?ver=ca04183222edaf8a26be']]", "ChildRule[AttributeRule]", "1764.2455" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-data-store-js\"]]", "ChildRule[IDRule]", "1764.2457" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-data-store-js\"]]", "ChildRule[IDRule]", "1764.2459" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-data.js?ver=c96aba0171b12e03b8a6']]", "ChildRule[AttributeRule]", "1764.2461" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/wc-blocks-data.js?ver=c96aba0171b12e03b8a6']]", "ChildRule[AttributeRule]", "1764.2463" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-dom-ready-js\"]]", "ChildRule[IDRule]", "1764.2465" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-dom-ready-js\"]]", "ChildRule[IDRule]", "1764.2467" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom-ready.min.js?ver=392bdd43726760d1f3ca']]", "ChildRule[AttributeRule]", "1764.2469" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/dom-ready.min.js?ver=392bdd43726760d1f3ca']]", "ChildRule[AttributeRule]", "1764.2471" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-a11y-js\"]]", "ChildRule[IDRule]", "1764.2473" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-a11y-js\"]]", "ChildRule[IDRule]", "1764.2475" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/a11y.min.js?ver=7032343a947cfccf5608']]", "ChildRule[AttributeRule]", "1764.2477" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/a11y.min.js?ver=7032343a947cfccf5608']]", "ChildRule[AttributeRule]", "1764.2479" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-primitives-js\"]]", "ChildRule[IDRule]", "1764.2481" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-primitives-js\"]]", "ChildRule[IDRule]", "1764.2483" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/primitives.min.js?ver=6984e6eb5d6157c4fe44']]", "ChildRule[AttributeRule]", "1764.2485" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/primitives.min.js?ver=6984e6eb5d6157c4fe44']]", "ChildRule[AttributeRule]", "1764.2487" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wp-warning-js\"]]", "ChildRule[IDRule]", "1764.2489" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wp-warning-js\"]]", "ChildRule[IDRule]", "1764.2491" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/warning.min.js?ver=122829a085511691f14d']]", "ChildRule[AttributeRule]", "1764.2493" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-includes/js/dist/warning.min.js?ver=122829a085511691f14d']]", "ChildRule[AttributeRule]", "1764.2495" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-components-js\"]]", "ChildRule[IDRule]", "1764.2497" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-components-js\"]]", "ChildRule[IDRule]", "1764.2499" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-components.js?ver=b165bb2bd213326d7f31']]", "ChildRule[AttributeRule]", "1764.2501" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-components.js?ver=b165bb2bd213326d7f31']]", "ChildRule[AttributeRule]", "1764.2503" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-blocks-checkout-js\"]]", "ChildRule[IDRule]", "1764.2505" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-blocks-checkout-js\"]]", "ChildRule[IDRule]", "1764.2507" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-checkout.js?ver=9f469ef17beaf7c51576']]", "ChildRule[AttributeRule]", "1764.2509" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/client/blocks/blocks-checkout.js?ver=9f469ef17beaf7c51576']]", "ChildRule[AttributeRule]", "1764.2511" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"wc-order-attribution-blocks-js\"]]", "ChildRule[IDRule]", "1764.2513" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"wc-order-attribution-blocks-js\"]]", "ChildRule[IDRule]", "1764.2515" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution-blocks.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1764.2517" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/woocommerce/assets/js/frontend/order-attribution-blocks.min.js?ver=8.5.2']]", "ChildRule[AttributeRule]", "1764.2519" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"starter-templates-zip-preview-js-extra\"]]", "ChildRule[IDRule]", "1764.2521" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"starter-templates-zip-preview-js-extra\"]]", "ChildRule[IDRule]", "1764.2523" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"starter-templates-zip-preview-js\"]]", "ChildRule[IDRule]", "1764.2525" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"starter-templates-zip-preview-js\"]]", "ChildRule[IDRule]", "1764.2527" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/astra-sites/inc/lib/onboarding/assets/dist/template-preview/main.js?ver=06758d4d807d9d22c6ea']]", "ChildRule[AttributeRule]", "1764.2529" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/plugins/astra-sites/inc/lib/onboarding/assets/dist/template-preview/main.js?ver=06758d4d807d9d22c6ea']]", "ChildRule[AttributeRule]", "1764.2531" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-addon-js-js-extra\"]]", "ChildRule[IDRule]", "1764.2533" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-addon-js-js-extra\"]]", "ChildRule[IDRule]", "1764.2535" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@id=\"astra-addon-js-js\"]]", "ChildRule[IDRule]", "1764.2537" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"astra-addon-js-js\"]]", "ChildRule[IDRule]", "1764.2539" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SCRIPT[@src='https://alchemydemo01.wpenginepowered.com/wp-content/uploads/astra-addon/astra-addon-65bbf48dab7809-78711485.js?ver=4.6.3']]", "ChildRule[AttributeRule]", "1764.2541" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@src='https://alchemydemo01.wpenginepowered.com/wp-content/uploads/astra-addon/astra-addon-65bbf48dab7809-78711485.js?ver=4.6.3']]", "ChildRule[AttributeRule]", "1764.2543" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@id=\"a11y-speak-intro-text\"]]", "ChildRule[IDRule]", "1764.2545" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"a11y-speak-intro-text\"]]", "ChildRule[IDRule]", "1764.2547" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@class='a11y-speak-intro-text']]", "ChildRule[AttributeRule]", "1764.2549" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='a11y-speak-intro-text']]", "ChildRule[AttributeRule]", "1764.2551" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@style='position: absolute;margin: -1px;padding: 0;height: 1px;width: 1px;overflow: hidden;clip: rect(1px, 1px, 1px, 1px);-webkit-clip-path: inset(50%);clip-path: inset(50%);border: 0;word-wrap: normal !important;']]", "ChildRule[AttributeRule]", "1764.2553" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./P[@hidden='hidden']]", "ChildRule[AttributeRule]", "1764.2555" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@hidden='hidden']]", "ChildRule[AttributeRule]", "1764.2557" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@id=\"a11y-speak-assertive\"]]", "ChildRule[IDRule]", "1764.2559" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"a11y-speak-assertive\"]]", "ChildRule[IDRule]", "1764.2561" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@aria-live='assertive']]", "ChildRule[AttributeRule]", "1764.2563" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@aria-live='assertive']]", "ChildRule[AttributeRule]", "1764.2565" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@id=\"a11y-speak-polite\"]]", "ChildRule[IDRule]", "1764.2567" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@id=\"a11y-speak-polite\"]]", "ChildRule[IDRule]", "1764.2569" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./DIV[@aria-live='polite']]", "ChildRule[AttributeRule]", "1764.2571" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@aria-live='polite']]", "ChildRule[AttributeRule]", "1764.2573" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SPAN[@class='select2-container select2-container--default select2-container--open']]", "ChildRule[AttributeRule]", "1764.2575" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@class='select2-container select2-container--default select2-container--open']]", "ChildRule[AttributeRule]", "1764.2577" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./SPAN[@style='position: absolute; top: 817.109px; left: 252.875px;']]", "ChildRule[AttributeRule]", "1764.2579" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[./*[@style='position: absolute; top: 817.109px; left: 252.875px;']]", "ChildRule[AttributeRule]", "1764.2581" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[@itemtype='https://schema.org/WebPage']", "AttributeRule", "1764.2583" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@itemtype='https://schema.org/WebPage']", "AttributeRule", "1764.2585" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[@itemscope='itemscope']", "AttributeRule", "1764.2587" ) );
bC.add( new ByFactory( ByXPath.class, "//BODY[@class='page-template-default page page-id-1190 wp-custom-logo theme-astra woocommerce-checkout woocommerce-page woocommerce-js ast-desktop ast-separate-container ast-two-container ast-no-sidebar astra-4.6.4 ast-single-post ast-inherit-site-logo-transparent ast-hfb-header ast-normal-title-enabled elementor-default elementor-kit-1083 astra-addon-4.6.3  ']", "AttributeRule", "1764.2589" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='page-template-default page page-id-1190 wp-custom-logo theme-astra woocommerce-checkout woocommerce-page woocommerce-js ast-desktop ast-separate-container ast-two-container ast-no-sidebar astra-4.6.4 ast-single-post ast-inherit-site-logo-transparent ast-hfb-header ast-normal-title-enabled elementor-default elementor-kit-1083 astra-addon-4.6.3  ']", "AttributeRule", "1764.2591" ) );
bC.add( new ByFactory( ByXPath.class, "//HTML[@lang='en-US']/BODY[1]", "ParentRule[AttributeRule]", "1764.2593" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@lang='en-US']/BODY[1]", "ParentRule[AttributeRule]", "1764.2595" ) );
bC.add( new ByFactory( ByXPath.class, "//HEAD/following-sibling::BODY[1]", "SiblingRule", "1764.2597" ) );
bC.add( new ByFactory( ByXPath.class, "//HTML/BODY[1]", "ParentRule[TagRule]", "1764.2599" ) );


objectMap.put( "1764.2171", bC );


bC = new ByFactoryCollection("billing_postcode", "1764.2602");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_postcode\"]", "IDRule", "1764.2604" ) );
bC.add( new ByFactory( ById.class, "billing_postcode", "IDRule", "1764.2606" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_postcode\"]", "IDRule", "1764.2608" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_postcode\"]", "NameRule", "1764.2610" ) );
bC.add( new ByFactory( ByName.class, "billing_postcode", "NameRule", "1764.2612" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_postcode\"]", "NameRule", "1764.2614" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[9]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2616" ) );


objectMap.put( "1764.2602", bC );


bC = new ByFactoryCollection("billing_phone", "1764.2621");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_phone\"]", "IDRule", "1764.2623" ) );
bC.add( new ByFactory( ById.class, "billing_phone", "IDRule", "1764.2625" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_phone\"]", "IDRule", "1764.2627" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_phone\"]", "NameRule", "1764.2629" ) );
bC.add( new ByFactory( ByName.class, "billing_phone", "NameRule", "1764.2631" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_phone\"]", "NameRule", "1764.2633" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@type='tel']", "AttributeRule", "1764.2635" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='tel']", "AttributeRule", "1764.2637" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@autocomplete='tel']", "AttributeRule", "1764.2639" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autocomplete='tel']", "AttributeRule", "1764.2641" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[10]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2643" ) );


objectMap.put( "1764.2621", bC );


bC = new ByFactoryCollection("billing_email", "1764.2646");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"billing_email\"]", "IDRule", "1764.2648" ) );
bC.add( new ByFactory( ById.class, "billing_email", "IDRule", "1764.2650" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"billing_email\"]", "IDRule", "1764.2652" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"billing_email\"]", "NameRule", "1764.2654" ) );
bC.add( new ByFactory( ByName.class, "billing_email", "NameRule", "1764.2656" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"billing_email\"]", "NameRule", "1764.2658" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@type='email']", "AttributeRule", "1764.2660" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='email']", "AttributeRule", "1764.2662" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@autocomplete='email username']", "AttributeRule", "1764.2664" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autocomplete='email username']", "AttributeRule", "1764.2666" ) );
bC.add( new ByFactory( ByXPath.class, "(//SPAN[@class='woocommerce-input-wrapper'])[11]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2668" ) );


objectMap.put( "1764.2646", bC );


bC = new ByFactoryCollection("createaccount", "1764.2672");
bC.add( new ByFactory( ByXPath.class, "//INPUT[@id=\"createaccount\"]", "IDRule", "1764.2674" ) );
bC.add( new ByFactory( ById.class, "createaccount", "IDRule", "1764.2676" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"createaccount\"]", "IDRule", "1764.2678" ) );
bC.add( new ByFactory( ByXPath.class, "//INPUT[@name=\"createaccount\"]", "NameRule", "1764.2680" ) );
bC.add( new ByFactory( ByName.class, "createaccount", "NameRule", "1764.2682" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"createaccount\"]", "NameRule", "1764.2684" ) );
bC.add( new ByFactory( ByXPath.class, "(//LABEL[@class='woocommerce-form__label woocommerce-form__label-for-checkbox checkbox'])[1]/INPUT[1]", "ParentRule[IndexedAttributeRule]", "1764.2686" ) );


objectMap.put( "1764.2672", bC );


bC = new ByFactoryCollection("Place Order", "1764.2689");
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@id=\"place_order\"]", "IDRule", "1764.2691" ) );
bC.add( new ByFactory( ById.class, "place_order", "IDRule", "1764.2693" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"place_order\"]", "IDRule", "1764.2695" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@name=\"woocommerce_checkout_place_order\"]", "NameRule", "1764.2697" ) );
bC.add( new ByFactory( ByName.class, "woocommerce_checkout_place_order", "NameRule", "1764.2699" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"woocommerce_checkout_place_order\"]", "NameRule", "1764.2701" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce-terms-and-conditions-wrapper']/following-sibling::BUTTON[1]", "SiblingRule", "1764.2703" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@class='button alt']", "AttributeRule", "1764.2705" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='button alt']", "AttributeRule", "1764.2707" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@value='Place order']", "AttributeRule", "1764.2709" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@value='Place order']", "AttributeRule", "1764.2711" ) );
bC.add( new ByFactory( ByXPath.class, "//BUTTON[@data-value='Place order']", "AttributeRule", "1764.2713" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-value='Place order']", "AttributeRule", "1764.2715" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='form-row place-order']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.2717" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='form-row place-order']/BUTTON[1]", "ParentRule[AttributeRule]", "1764.2719" ) );


objectMap.put( "1764.2689", bC );


bC = new ByFactoryCollection("checkout", "1764.2722");
bC.add( new ByFactory( ByXPath.class, "//FORM[@name=\"checkout\"]", "NameRule", "1764.2724" ) );
bC.add( new ByFactory( ByName.class, "checkout", "NameRule", "1764.2726" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"checkout\"]", "NameRule", "1764.2728" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@class='woocommerce-NoticeGroup woocommerce-NoticeGroup-checkout']]", "ChildRule[AttributeRule]", "1764.2730" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@class='woocommerce-NoticeGroup woocommerce-NoticeGroup-checkout']]", "ChildRule[AttributeRule]", "1764.2732" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@id=\"customer_details\"]]", "ChildRule[IDRule]", "1764.2734" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@id=\"customer_details\"]]", "ChildRule[IDRule]", "1764.2736" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@class='col2-set']]", "ChildRule[AttributeRule]", "1764.2738" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@class='col2-set']]", "ChildRule[AttributeRule]", "1764.2740" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./H3[@id=\"order_review_heading\"]]", "ChildRule[IDRule]", "1764.2742" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@id=\"order_review_heading\"]]", "ChildRule[IDRule]", "1764.2744" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@id=\"order_review\"]]", "ChildRule[IDRule]", "1764.2746" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@id=\"order_review\"]]", "ChildRule[IDRule]", "1764.2748" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./DIV[@class='woocommerce-checkout-review-order']]", "ChildRule[AttributeRule]", "1764.2750" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[./*[@class='woocommerce-checkout-review-order']]", "ChildRule[AttributeRule]", "1764.2752" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce-form-login-toggle']/following-sibling::FORM[3]", "SiblingRule", "1764.2754" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@class='checkout woocommerce-checkout']", "AttributeRule", "1764.2756" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='checkout woocommerce-checkout']", "AttributeRule", "1764.2758" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@action='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1764.2760" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@action='https://alchemydemo01.wpenginepowered.com/checkout-2/']", "AttributeRule", "1764.2762" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@enctype='multipart/form-data']", "AttributeRule", "1764.2764" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@enctype='multipart/form-data']", "AttributeRule", "1764.2766" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@novalidate='novalidate']", "AttributeRule", "1764.2768" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@novalidate='novalidate']", "AttributeRule", "1764.2770" ) );
bC.add( new ByFactory( ByXPath.class, "//FORM[@style='position: static; zoom: 1;']", "AttributeRule", "1764.2772" ) );
bC.add( new ByFactory( ByXPath.class, "//DIV[@class='woocommerce']/FORM[3]", "ParentRule[AttributeRule]", "1764.2774" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='woocommerce']/FORM[3]", "ParentRule[AttributeRule]", "1764.2776" ) );


objectMap.put( "1764.2722", bC );


bC = new ByFactoryCollection("StateSelector", "1796.1572");
bC.add( new ByFactory( ByXPath.class, "//select[@id='billing_state']", "", "0.0" ) );


objectMap.put( "1796.1572", bC );




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
