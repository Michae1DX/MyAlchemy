/**
  * @version 2
  */
 package org.org_1.buy_bicycles;

 import java.util.*;
 import java.util.function.*;
 import java.io.*;
 import java.lang.reflect.*;
 import org.apache.commons.logging.*;
 import org.openqa.selenium.*;
 import org.openqa.selenium.interactions.*;
 import org.openqa.selenium.remote.*;
 import org.openqa.selenium.support.ui.*;
 import com.google.gson.*;
 import static com.orasi.shared_library.*;
 import com.orasi.event.spi.*;
 import com.orasi.event.configuration.*;
 import com.orasi.*;
 import com.orasi.model.*;
 import com.orasi.datasource.*;
 import com.orasi.alchemy.mediation.execution.*;
 import java.time.*;
 
 public class purchase_various_products extends AbstractTestWrapper
 {
   Map<String,FunctionVariableWrapper> ingressSignature = new HashMap<>( 5 );;

   public purchase_various_products() {
     super(10552, "11812.1383", "Purchase Various Products", "Add a description of Purchase Various Products", 0, "", "".split(","), "{\"symphonyId\":0,\"id\":10552,\"name\":\"Purchase Various Products\",\"description\":\"Add a description of Purchase Various Products\",\"userId\":20,\"userConfidence\":0,\"organizationId\":1,\"organizationConfidence\":0,\"status\":1,\"reviewFlag\":0,\"createDate\":\"Jul 22, 2024, 6:20:10 PM\",\"modifyDate\":\"Jul 25, 2024, 8:03:24 PM\",\"version\":2,\"lockUserId\":0,\"level\":1,\"pre\":\"\",\"post\":\"\",\"deviceTagNames\":\"\",\"changeCount\":0,\"uniqueContributors\":0,\"stepCount\":0,\"testUserConfidence\":0.0,\"errorHandler\":\"\",\"classificationId\":0,\"synchronizationId\":0,\"storageVersion\":2,\"alchemyId\":1383,\"alchemySeed\":11812,\"referenceSuiteID\":0,\"signature\":\"null\",\"acls\":[],\"changed\":false}");
   }

   private void sleep( long sleepTime ) {
    try {
      Thread.sleep( sleepTime );
    } catch( InterruptedException ignoreMe) {
      
    }
  }
 
 	@Override
   public void _executeTest( int executionId, int testExecutionId, final WebDriver webDriver, final Map<String,Object> contextMap, String contextName, final Stack<String> callStack, final Stack<Integer> stepStack )
   {
    String testName = "purchase_various_products";

    if ( contextMap.get( "__callStyle" ) == null ) { contextMap.put( "__callStyle", 1 ); }
    callStack.push( getClass().getName() );
    if ( stepStack.isEmpty() ) stepStack.push( 0 );
    int callStyle = (Integer) contextMap.get( "__callStyle" );
    final Deque<StepEvent> eventList = new ArrayDeque<>( 10 );

    DataSourceProvider dS = DataSourceProviderFactory.instance().getDataSourceProvider();
    if ( dS == null ) {
      throw new IllegalArgumentException( "No Data Source Provider was specified" );
    }

    //
    // Initialize the Action Mediator for this test
    //
    ActionMediator aM = new ActionMediator(executionId, testExecutionId, testName, webDriver, contextMap, callStack, stepStack, callStyle);
    VariableMediator vM = new VariableMediator();
    

    try
    {
      
      
      
      
      

      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "url", 15, true, "https://bikeshop.alchemytesting.com/", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "timeout", 2, true, "30000", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Navigate_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":82,\"checkpointId\":1,\"alchemyId\":1388,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"https://bikeshop.alchemytesting.com/\",\"inputId\":7,\"templateId\":0,\"inputName\":\"url\",\"inputDescription\":\"The Application Locator\",\"inputData\":\"null\",\"inputTypeId\":15,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"30000\",\"inputId\":7,\"templateId\":0,\"inputName\":\"timeout\",\"inputDescription\":\"The time in milliseconds to wait for a page to load\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":5,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Navigate to {var:url}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "action", 10, true, "Resize", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "height", 2, true, "808", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "width", 2, true, "1416", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Browser_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":271,\"checkpointId\":1,\"alchemyId\":1389,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Resize\",\"inputId\":0,\"templateId\":0,\"inputName\":\"action\",\"inputDescription\":\"The action to take on the browser\",\"inputData\":\"Back,Forward,Refresh,Resize,Maximize,Minimize,Full Screen\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"808\",\"inputId\":0,\"templateId\":0,\"inputName\":\"height\",\"inputDescription\":\"When the Resize method is selected, this value will specify the height of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1416\",\"inputId\":0,\"templateId\":0,\"inputName\":\"width\",\"inputDescription\":\"When the Resize method is selected, this value will specify the width of the browser\",\"inputData\":\"\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":37,\"parentId\":0,\"endpointId\":0,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Perform the {var:action} browser action\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1391", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1404,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1391\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1406", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1433,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1406\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1437", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1472,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1437\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1474", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1489,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1474\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1491", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1506,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1491\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1510", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1545,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1510\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1547", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1562,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1547\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1564", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1577,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1564\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1579", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1594,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1579\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1598", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1619,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1598\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1621", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1634,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1621\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "measurement", 10, true, "Pixel", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "value", 2, true, "120", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Scroll_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":22,\"checkpointId\":1,\"alchemyId\":1681,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Pixel\",\"inputId\":36,\"templateId\":0,\"inputName\":\"measurement\",\"inputDescription\":\"The measurement type\",\"inputData\":\"Pixel,Page\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"120\",\"inputId\":37,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The amount to scroll defined by the measurement\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":19,\"parentId\":0,\"endpointId\":0,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Scroll the active window {var:value} {var:measurement}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "measurement", 10, true, "Pixel", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "value", 2, true, "1920", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Scroll_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":22,\"checkpointId\":1,\"alchemyId\":1682,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Pixel\",\"inputId\":36,\"templateId\":0,\"inputName\":\"measurement\",\"inputDescription\":\"The measurement type\",\"inputData\":\"Pixel,Page\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1920\",\"inputId\":37,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The amount to scroll defined by the measurement\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":19,\"parentId\":0,\"endpointId\":0,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Scroll the active window {var:value} {var:measurement}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1684", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Exists_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":2,\"checkpointId\":1,\"alchemyId\":1707,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1684\",\"inputId\":15,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element to analyze\",\"inputData\":\"null\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":9,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Check if {var:targetLocator} {inverted? does not exist: exists}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "11812.1709", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":1722,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"11812.1709\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "measurement", 10, true, "Pixel", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "value", 2, true, "120", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Scroll_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":22,\"checkpointId\":1,\"alchemyId\":1723,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Pixel\",\"inputId\":36,\"templateId\":0,\"inputName\":\"measurement\",\"inputDescription\":\"The measurement type\",\"inputData\":\"Pixel,Page\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"120\",\"inputId\":37,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The amount to scroll defined by the measurement\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":19,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Scroll the active window {var:value} {var:measurement}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "measurement", 10, true, "Pixel", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "value", 2, true, "1080", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Scroll_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":22,\"checkpointId\":1,\"alchemyId\":1724,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Pixel\",\"inputId\":36,\"templateId\":0,\"inputName\":\"measurement\",\"inputDescription\":\"The measurement type\",\"inputData\":\"Pixel,Page\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1080\",\"inputId\":37,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The amount to scroll defined by the measurement\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":19,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Scroll the active window {var:value} {var:measurement}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "measurement", 10, true, "Pixel", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "value", 2, true, "120", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Scroll_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":22,\"checkpointId\":1,\"alchemyId\":1725,\"alchemySeed\":11812,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Pixel\",\"inputId\":36,\"templateId\":0,\"inputName\":\"measurement\",\"inputDescription\":\"The measurement type\",\"inputData\":\"Pixel,Page\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"120\",\"inputId\":37,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The amount to scroll defined by the measurement\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":19,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Scroll the active window {var:value} {var:measurement}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      

      
      
      
      
    } catch( BreakException e ) {
      throw e;
    } catch (EOTException e) {
      if (e.getStepPayload() == null) {
        e.setStepPayload(new StepPayload());
      }
      e.getStepPayload().setMessage(e.getMessage());
      if (!e.isTestPassed()) {
        try {
          e.getStepPayload().setScreenShot(screenShot(webDriver));
          e.getStepPayload().setSource(webDriver.getPageSource());
          
        } catch (Exception _e) {
          e.getStepPayload().setMessage("Could not acquire details from connected endpoint");
        }
      }
      throw e;
    } catch (StepException e) {
      log.error( e.getMessage(), e );
      if (e.getStepPayload() == null) {
        e.setStepPayload( new StepPayload() );
      }
      try {
        e.getStepPayload().setScreenShot(screenShot(webDriver));
        e.getStepPayload().setSource(webDriver.getPageSource());
        e.getStepPayload().setMessage(e.getMessage());
      } catch (Exception _e) {
        log.error( _e.getMessage(), _e );
        e.getStepPayload().setMessage("Could not acquire details from connected endpoint");
      }
      notifyListeners(new StepEvent(e.getStepPayload(), testName, 3));
      throw e;
    } finally {
      if ( eventList.peek() != null ) {
        notifyListeners(new StepEvent(eventList.peek().getPayload(), testName, 2));
      } else {
        notifyListeners(new StepEvent(new StepPayload(), testName, 2));
      }
      callStack.pop();
    }
  }

  
  private byte[] screenShot( WebDriver webDriver ) {
    if ( webDriver instanceof TakesScreenshot ) {
      return ( (TakesScreenshot) webDriver ).getScreenshotAs( OutputType.BYTES );
    } else {
      return null;
    }
  }
 }