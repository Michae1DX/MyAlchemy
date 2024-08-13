/**
  * @version 12
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
 
 public class purchase_any_bike_pattern_match extends AbstractTestWrapper
 {
   Map<String,FunctionVariableWrapper> ingressSignature = new HashMap<>( 5 );;

   public purchase_any_bike_pattern_match() {
     super(10006, "8885.945", "Purchase Any Bike Pattern Match", "Add a description of Purchase Any Bike Pattern Match", 0, "", "".split(","), "{\"symphonyId\":0,\"id\":10006,\"name\":\"Purchase Any Bike Pattern Match\",\"description\":\"Add a description of Purchase Any Bike Pattern Match\",\"userId\":20,\"userConfidence\":0,\"organizationId\":1,\"organizationConfidence\":0,\"status\":1,\"reviewFlag\":0,\"createDate\":\"Jun 12, 2024, 9:33:46 PM\",\"modifyDate\":\"Aug 7, 2024, 8:48:41 PM\",\"version\":12,\"lockUserId\":0,\"level\":1,\"pre\":\"\",\"post\":\"\",\"deviceTagNames\":\"\",\"changeCount\":0,\"uniqueContributors\":0,\"stepCount\":0,\"testUserConfidence\":0.0,\"errorHandler\":\"\",\"classificationId\":0,\"synchronizationId\":0,\"storageVersion\":2,\"alchemyId\":945,\"alchemySeed\":8885,\"referenceSuiteID\":0,\"signature\":\"null\",\"acls\":[],\"changed\":false}");
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
    String testName = "purchase_any_bike_pattern_match";

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
      eventList.add( aM.executeAction( "Navigate_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":82,\"checkpointId\":1,\"alchemyId\":946,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"https://bikeshop.alchemytesting.com/\",\"inputId\":7,\"templateId\":0,\"inputName\":\"url\",\"inputDescription\":\"The Application Locator\",\"inputData\":\"null\",\"inputTypeId\":15,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"30000\",\"inputId\":7,\"templateId\":0,\"inputName\":\"timeout\",\"inputDescription\":\"The time in milliseconds to wait for a page to load\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":5,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Navigate to {var:url}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.1929", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":947,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1764.1929\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1923.264", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Get_v1", "OrderedBike", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":58,\"checkpointId\":1,\"alchemyId\":948,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"output\":\"OrderedBike\",\"variableList\":[{\"value\":\"1923.264\",\"inputId\":53,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element to analyze\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":10,\"parentId\":0,\"endpointId\":0,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Get the value of {var:targetLocator} {output}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "[#{OrderedBike}]", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "asAscii", 4, true, "false", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Console_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":9,\"checkpointId\":1,\"alchemyId\":949,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"[#{OrderedBike}]\",\"inputId\":24,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The value to dump to the console\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"false\",\"inputId\":0,\"templateId\":0,\"inputName\":\"asAscii\",\"inputDescription\":\"True ifd you want the ASCII code for each character to be printed, false (default) if you want the value to print as is.\",\"inputData\":\"\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":7,\"parentId\":0,\"endpointId\":0,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Print {var:value} to the console window\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.1944", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":950,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1764.1944\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.1959", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":951,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1764.1959\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.1998", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":952,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1764.1998\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2015", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":953,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1764.2015\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "Ima", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2032", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":954,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Ima\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2032\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "Tester", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2050", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":955,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Tester\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2050\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "Bike Buyers International", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2069", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":956,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Bike Buyers International\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2069\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "1234 Anystreet Rd", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2088", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":957,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1234 Anystreet Rd\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2088\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, " Suite 400", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2107", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":958,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\" Suite 400\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2107\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "Kennesaw", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2125", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":959,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"Kennesaw\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2125\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "21458", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2602", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":961,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"21458\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2602\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "5556647896", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2621", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":962,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"5556647896\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2621\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "ima.tester@example.com", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "clearFirst", 4, true, "true", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2646", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Type_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":85,\"checkpointId\":1,\"alchemyId\":963,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"ima.tester@example.com\",\"inputId\":31,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The text to type\",\"inputData\":\"null\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":32,\"templateId\":0,\"inputName\":\"clearFirst\",\"inputDescription\":\"A flag indicating if the value should first be cleared\",\"inputData\":\"null\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2646\",\"inputId\":33,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will receive the text\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":17,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Type {var:value} into {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2689", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":964,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1764.2689\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "condition", 10, true, "Visible", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "targetLocator", 5, true, "1764.2722", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "timeOut", 2, true, "8", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Wait_For_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":4,\"checkpointId\":1,\"alchemyId\":965,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":2000,\"variableList\":[{\"value\":\"Visible\",\"inputId\":3,\"templateId\":0,\"inputName\":\"condition\",\"inputDescription\":\"A condition to wait for such as Visible, Clickable, etc.\",\"inputData\":\"Clickable,Invisible,Present,Selected,Visible,Frame Exists,Clickable then Click\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"1764.2722\",\"inputId\":4,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element that will accept the action\",\"inputData\":\"null\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"8\",\"inputId\":5,\"templateId\":0,\"inputName\":\"timeOut\",\"inputDescription\":\"The amount of time to wait for the element to appear in seconds\",\"inputData\":\"null\",\"inputTypeId\":2,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":11,\"parentId\":0,\"endpointId\":0,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Wait for {var:targetLocator} to be {var:condition}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 2000, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1923.239", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Get_v1", "BikeInCheckout", 0, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":58,\"checkpointId\":0,\"alchemyId\":966,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"output\":\"BikeInCheckout\",\"variableList\":[{\"value\":\"1923.239\",\"inputId\":53,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The element to analyze\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":10,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Get the value of {var:targetLocator} {output}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "[#{BikeInCheckout}]", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "asAscii", 4, true, "false", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Console_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":9,\"checkpointId\":1,\"alchemyId\":967,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"[#{BikeInCheckout}]\",\"inputId\":24,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The value to dump to the console\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"false\",\"inputId\":0,\"templateId\":0,\"inputName\":\"asAscii\",\"inputDescription\":\"True ifd you want the ASCII code for each character to be printed, false (default) if you want the value to print as is.\",\"inputData\":\"\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":7,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Print {var:value} to the console window\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "#{BikeInCheckout}", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "asAscii", 4, true, "true", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Console_v2", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":276,\"checkpointId\":1,\"alchemyId\":968,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"#{BikeInCheckout}\",\"inputId\":24,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The value to dump to the console\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"true\",\"inputId\":0,\"templateId\":0,\"inputName\":\"asAscii\",\"inputDescription\":\"True ifd you want the ASCII code for each character to be printed, false (default) if you want the value to print as is.\",\"inputData\":\"\",\"inputTypeId\":4,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":7,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":2,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Print {var:value} to the console window\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "value", 1, true, "#{BikeInCheckout}", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "pattern", 1, true, "Kryo X26 .* Model X", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "type", 10, true, "Regular Expression", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Pattern_Match_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":289,\"checkpointId\":1,\"alchemyId\":976,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"#{BikeInCheckout}\",\"inputId\":0,\"templateId\":0,\"inputName\":\"value\",\"inputDescription\":\"The incoming value that you want to compare\",\"inputData\":\"\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Kryo X26 .* Model X\",\"inputId\":0,\"templateId\":0,\"inputName\":\"pattern\",\"inputDescription\":\"The pattern to match. The pattern can be in varying formats, defined by the type.\\n\",\"inputData\":\"\",\"inputTypeId\":1,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Regular Expression\",\"inputId\":0,\"templateId\":0,\"inputName\":\"type\",\"inputDescription\":\"\\u003cp\\u003eThe type of pattern\\u003c/p\\u003e\\n\\u003cul\\u003e\\n    \\u003cli\\u003e\\u003cstrong\\u003eWild Card\\u003c/strong\\u003e: Wild Card allows the user to specify a * character at the start or end of a string. \\u0026nbsp;This indicates that the starred section can be anything effectively allowing the user to match the beginning or ending of a string.\\u003c/li\\u003e\\n    \\u003cli\\u003e\\u003cstrong\\u003eRegular Expression\\u003c/strong\\u003e: \\u003ci\\u003eRegular Expression\\u003c/i\\u003e (RegEx) allows the user to verify that the string matches the pattern by using a \\u003ci\\u003eRegular Expression\\u003c/i\\u003e. \\u0026nbsp;For more information on \\u003ci\\u003eRegular Expressions\\u003c/i\\u003e click \\u003ca target\\u003d\\\"_blank\\\" rel\\u003d\\\"noopener noreferrer\\\" href\\u003d\\\"https://regex101.com/\\\"\\u003ehere\\u003c/a\\u003e\\u003c/li\\u003e\\n\\u003c/ul\\u003e\",\"inputData\":\"Starts With,Ends With,Contains,Regular Expression\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":364,\"parentId\":0,\"endpointId\":0,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Does {var:value} match the {var:type} {var:pattern}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "Expected Value", 1, false, "#{OrderedBike}", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Expected Source", 10, true, "Value", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Actual Value", 1, false, "#{BikeInCheckout}", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Actual Source", 10, true, "Value", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Expected Locator", 5, false, "", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "Actual Locator", 5, false, "", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Match_Value_v1", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":162,\"checkpointId\":1,\"alchemyId\":969,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"#{OrderedBike}\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Expected Value\",\"inputDescription\":\"This is the text value we are comparing against.\",\"inputData\":\"\",\"inputTypeId\":1,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"Value\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Expected Source\",\"inputDescription\":\"The source of the first value\",\"inputData\":\"Value,Locator\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"#{BikeInCheckout}\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Actual Value\",\"inputDescription\":\"This is the text value we are comparing to.\",\"inputData\":\"\",\"inputTypeId\":1,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"Value\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Actual Source\",\"inputDescription\":\"The source of the second value.\",\"inputData\":\"Value,Locator\",\"inputTypeId\":10,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Expected Locator\",\"inputDescription\":\"This is the locator used to extract the value.\",\"inputData\":\"\",\"inputTypeId\":5,\"inputRequired\":0,\"status\":1,\"changed\":false},{\"value\":\"\",\"inputId\":0,\"templateId\":0,\"inputName\":\"Actual Locator\",\"inputDescription\":\"This is the locator used to extract the value.\",\"inputData\":\"\",\"inputTypeId\":5,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":171,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":1,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":2,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Does {ifvar:Actual Source\\u003dLocator;var:Actual Locator}{ifvar:Actual Source\\u003dValue;var:Actual Value} {inverted? not match: match} {ifvar:Expected Source\\u003dLocator;var:Expected Locator}{ifvar:Expected Source\\u003dValue;var:Expected Value}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 2 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1926.1673", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":970,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1926.1673\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1926.1690", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":971,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1926.1690\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1926.1703", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":972,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1926.1703\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1926.1718", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":973,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1926.1718\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1926.1733", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":974,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1926.1733\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      
      vM.clear();

      ingressSignature.clear();
      

      vM.addVariable( createVariable( "targetLocator", 5, true, "1926.1748", dS, contextMap, webDriver ) );
      vM.addVariable( createVariable( "method", 10, false, "Default", dS, contextMap, webDriver ) );
      

      if ( !ingressSignature.isEmpty() ) {
	vM.addVariable( new VariableWrapper( "__dS", dS, "" ) );
        vM.addVariable( new VariableWrapper( "ingressSignature", ingressSignature, "" ) );
      }
      eventList.add( aM.executeAction( "Click_v7", "", 1, vM.generateVariables(), vM.generateVariableDefinitions(), "{\"templateImplId\":189,\"checkpointId\":1,\"alchemyId\":975,\"alchemySeed\":8885,\"pauseBefore\":0,\"waitFor\":5000,\"pauseAfter\":0,\"variableList\":[{\"value\":\"1926.1748\",\"inputId\":1,\"templateId\":0,\"inputName\":\"targetLocator\",\"inputDescription\":\"The name of the locator retrieved from the elements\",\"inputTypeId\":5,\"inputRequired\":1,\"status\":1,\"changed\":false},{\"value\":\"Default\",\"inputId\":59,\"templateId\":0,\"inputName\":\"method\",\"inputDescription\":\"The method used to click.  If omitted, default is used\",\"inputData\":\"Default,No Wait,Simple,Double,Right\",\"inputTypeId\":10,\"inputRequired\":0,\"status\":1,\"changed\":false}],\"functionVariables\":[],\"status\":1,\"actionId\":1,\"parentId\":0,\"endpointId\":1,\"templateId\":0,\"tversion\":7,\"tstyleId\":1,\"tstatus\":1,\"verifiedBy\":0,\"onFailure\":1,\"breakpoint\":false,\"invertResult\":false,\"actionDisplay\":\"Click on {var:targetLocator}\",\"changed\":false}", stepStack.peek(), (t4) -> {  return null; }, false, 0, 5000, 0, 1 ) );
      

      
      
      
      
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