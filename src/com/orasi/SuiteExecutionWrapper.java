/**
 * @version 107
 */
  
package com.orasi;
  
import java.util.*;
import java.util.concurrent.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.orasi.event.spi.*;
import static com.orasi.shared_library.*;
import com.orasi.integration.*;
import com.orasi.event.Event;
import com.orasi.event.action.EventAction;
import com.orasi.event.handler.AbstractEventHandler;
import com.orasi.event.hook.EventHook;
import com.orasi.model.*;
import org.apache.commons.cli.*;
import com.orasi.secrets.*;
import com.orasi.datasource.*;
import java.io.InputStream;
import java.util.logging.LogManager;
import com.google.gson.Gson;

  
  
public class SuiteExecutionWrapper {

  static {
    try ( InputStream iS = SuiteExecutionWrapper.class.getClassLoader().getResourceAsStream( "logging.properties") ) {
      LogManager.getLogManager().readConfiguration(iS);
    } catch( Exception e ) {
      e.printStackTrace();
    }
  }

  private static final Random numberGenerator = new Random();
  public static final String generateCharacters(int characterCount) {
    StringBuilder sB = new StringBuilder();
    for (int i = 0; i < characterCount; i++) {
      int rV = numberGenerator.nextInt(26);

      rV += numberGenerator.nextBoolean() ? 65 : 97;

      sB.append((char) rV);

    }

    return sB.toString();
  }

  private static int failureCount = 0;
  private static int failureLevel = 0;

  private static class TestFailureHandler extends AbstractEventHandler<TestPayload> {

      public TestFailureHandler() {
        super( EventAction.ALL, EventHook.FAILURE.getId(), TestEvent.EVENT_TYPE );
      }
    
      @Override
      protected void _handleEvent(Event<TestPayload> e) {
        if ( e.getPayload().getFailureType() > failureLevel ) {
          failureLevel = e.getPayload().getFailureType();
        }
        failureCount++;
      }

    }
  
    private final Options cliOptions = new Options();
  private static CommandLine cli;
  private int threadCount = 10;
  private static final Logger log = LoggerFactory.getLogger(SuiteExecutionWrapper.class);
  private static final SuiteExecutionWrapper singleton = new SuiteExecutionWrapper();
  private int executionId;
  private int checkFailureLevel = 2;

  private String name;
  private String description;
  private int id;
  private String userName;
  private List<String> testList;
  private List<String> targetList;
  private List<Router> routerList = new ArrayList<>(5);

  private static final Map<String, Map<String, String>> environmentMap = new HashMap<>(10);
  
    private SuiteExecutionWrapper() {
  
    }

    public CommandLine getCommandLine() {
      return cli;
    }

    public Options getOptions() {
      return cliOptions;
    }

    public void addOptions(Option[] options) {
      for (Option option : options) {
        cliOptions.addOption(option);
      }
    }

    public String getOption( String name, String defaultValue ) {
      if ( cli.hasOption(name) ) {
        if ( SuiteExecutionWrapper.instance().getOptions().getOption(name).hasArg() ) {
          return cli.getOptionValue(name);
        } else {
          return "true";
        }
      } else {
        return defaultValue;
      }
    }
  
    public String getOption( String key, String name, String defaultValue ) {
      String keyName = key + "_" + name;
      if ( cli.hasOption(keyName) ) {
        if ( SuiteExecutionWrapper.instance().getOptions().getOption(keyName).hasArg() ) {
          return cli.getOptionValue(keyName);
        } else {
          return "true";
        }
      } else {
        return defaultValue;
      }
    }

  private static boolean hasValue(String option, String value) {
    String[] oV = cli.getOptionValues(option);
    if (oV != null) {
      for (String v : oV) {
        if (v.equals(value)) {
          return true;
        }
      }
      return false;
    } else {
      return true;
    }
    
  }

   
    public static void main(String[] args) {

            System.out.println( "                                                                                \n" +
"                                                                                \n" +
"                                                                                \n" +
"                                                                        &##     \n" +
"                                                               &######&  %%     \n" +
"                              &##################%              &&#& &%#& ####% \n" +
"                             &#####################&         %#% %#######& %#   \n" +
"                            ########################&      #####%##&  %####%    \n" +
"                          &###########################    %##########%%###%     \n" +
"                         ##############################&%##%  #######%          \n" +
"                       &#####################################%#####%%##%        \n" +
"                      #################  &#####################%%#####          \n" +
"                    &################      ###################%  ####           \n" +
"                   ################%         ######################             \n" +
"                  ################%           ####################              \n" +
"                %################&             &################&               \n" +
"               ###################            %###################              \n" +
"             &#####################%         ######################             \n" +
"           &#########################      &########################%           \n" +
"           ###########################%   ############################&         \n" +
"         ############################### ##############################         \n" +
"        ################&##############################&#################       \n" +
"      #################   &###########################&  &################      \n" +
"    &################      &########################%      ################%    \n" +
"   &################         %#####################&        &################   \n" +
"  ################&           %###################            ################% \n" +
" ################&              %%%%%%%%%%%%%%%%&              &################");
      
      System.out.println( "\n\nAlchemy by Orasi");
      System.out.println( "Copyright Orasi, Inc. | All Rights Reserved.\n\n");

      DataSourceProviderFactory.instance().setDataSourceProvider( DataManager.instance() );

      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("h", "help", false, "Print this message"));
      Option o = new Option("t", "tags", true, "A space separated list of test tags.  Each test that contains any of the supplied tags will be executed.");
      o.setArgs(Option.UNLIMITED_VALUES);
      SuiteExecutionWrapper.instance().getOptions().addOption(o);

      o = new Option("it", "includetests", true, "A space separated list of test identifiers that will be executed");
      o.setArgs(Option.UNLIMITED_VALUES);
      SuiteExecutionWrapper.instance().getOptions().addOption(o);

      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("e", "environment", true, "The environment variable set to use during execution"));
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("p", "threadcount", true, "The maximum amount of threads to run in parellel"));
 
      o = new Option("ir", "includerouters", true, "A space separated list of router identifiers.  Only targets belonging to these routers will run");
      o.setArgs(Option.UNLIMITED_VALUES);
      SuiteExecutionWrapper.instance().getOptions().addOption(o);

      o = new Option("iw", "includeintegrations", true, "A space separated list of integration identifiers to use");
      o.setArgs(Option.UNLIMITED_VALUES);
      SuiteExecutionWrapper.instance().getOptions().addOption(o);

      o = new Option("ie", "includetargets", true, "A space separated list of execution target identifiers.  Only the names targets will run");
      o.setArgs(Option.UNLIMITED_VALUES);
      SuiteExecutionWrapper.instance().getOptions().addOption(o);
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("a", "name", true, "Override the default name of this test suite"));
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("u", "user", true, "Override the name of the executing user"));
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("d", "description", true, "Override the description of this test suite"));
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("q", "queryids", false, "List the ID's of all elements that make up this suite"));
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("rd", "rundevelopment", false, "Indicates that tests in the development state should run"));
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("rq", "runquarantine", false, "Indicates that tests in the quarantine state should run"));
      SuiteExecutionWrapper.instance().getOptions().addOption(new Option("f", "failurelevel", true, "What error level fails a test suite.  1: Infrastructure, 2: Automation Failure (default), 3: Application Failure, 4: Unknown Error"));

      SuiteExecutionWrapper.instance().addOptions( new com.orasi.integration.html.HTMLSerializer().getOptions() );
      SuiteExecutionWrapper.instance().addOptions( new com.orasi.integration.console.ExecutionConsole().getOptions() );
      SuiteExecutionWrapper.instance().addOptions( new com.orasi.integration.guiconsole.GUIExecutionConsole().getOptions() );
      

      CommandLineParser cP = new DefaultParser();
      try {
        cli = cP.parse(SuiteExecutionWrapper.instance().getOptions(), args);
      } catch( ParseException pE ) {
        System.err.println("Failed to parse command line: " + pE.getMessage());
      }

      // Default Environment Properties 
      DataManager.instance().addDefaultEnvironmentProperty( "url", DataManager.instance().replaceValues( "https://alchemydemo01.wpenginepowered.com/" ) + "" );



      Map<String,String> envMap;
      //* A production configuration containing a Production URL */
      envMap = new HashMap<>( 10 );
      
      environmentMap.put( "Production", envMap );
//* A staging configuration containing a Staging URL */
      envMap = new HashMap<>( 10 );
      
      environmentMap.put( "Staging", envMap );

      

      if ( cli.hasOption( "e" ) ) {
        envMap = environmentMap.get( cli.getOptionValue( "e" ) );
        if ( envMap == null ) {
          System.err.println( "Specified Environment " + cli.getOptionValue( "e" ) + " does not exist" );
        } else {
          DataManager.instance().addEnvironmentProperties( envMap );
        }
      }

      



      if ( cli.hasOption( "h" ) ) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar Buy_Bicycles", SuiteExecutionWrapper.instance().getOptions() );
        System.exit( 0 );
      }

      if ( cli.hasOption( "q" ) ) {
        System.out.println( "Buy Bicycles (Suite): 1764.1920" ); 
        
        System.out.println( "Purchase Any Bike Pattern Match (Test): 8885.945" );
        System.out.println( "Purchase Various Products (Test): 11812.1383" );
        
        
        
        
        
	System.out.println( "For114 (Router): 13745.1478" );
	System.out.println( "chrome (Execution Target): 13745.1479" );
	System.out.println( "firefox (Execution Target): 13745.1480" );
	System.out.println( "MicrosoftEdge (Execution Target): 13745.1481" );
	
        System.out.println( "Old Bike Shop 3 (Site): 1557.2272" );
        System.out.println( "The Bike Shop  The Ride Of A Lifetime (Page): 1557.2275" );
        System.out.println( "default (Page): 1557.2292" );
        System.out.println( "Bicycles  The Bike Shop (Page): 1557.2294" );
        System.out.println( "Kryo X26 MTB  Model K  The Bike Shop (Page): 1557.2373" );
        System.out.println( "Cart  The Bike Shop (Page): 1557.2493" );
        System.out.println( "Checkout  The Bike Shop (Page): 1557.2545" );
        System.out.println( "Old Bike Shop 1 (Site): 5625.435" );
        System.out.println( "The Bike Shop  The Ride Of A Lifetime (Page): 5625.438" );
        System.out.println( "default (Page): 5625.455" );
        System.out.println( "Accessories  The Bike Shop (Page): 6663.2546" );
        System.out.println( "Bike Shop (Site): 1923.235" );
        System.out.println( "Checkout  The Bike Shop (Page): 1923.237" );
        System.out.println( "Bicycles  The Bike Shop (Page): 1923.262" );
        System.out.println( "default (Page): 1926.1686" );
        System.out.println( "The Bike Shop  The Ride Of A Lifetime (Page): 1926.1688" );
        System.out.println( "Accessories  The Bike Shop (Page): 1926.1716" );
        System.out.println( "About Us  The Bike Shop (Page): 1926.1731" );
        System.out.println( "Contact  The Bike Shop (Page): 1926.1746" );
        System.out.println( "My Account  The Bike Shop (Page): 1926.1761" );
        System.out.println( "Bicycle Gloves Blue  The Bike Shop (Page): 11812.1435" );
        System.out.println( "Bicycle Helmet Red  The Bike Shop (Page): 11812.1508" );
        System.out.println( "Kryo X26  Model Y  The Bike Shop (Page): 11812.1596" );
        System.out.println( "Cart  The Bike Shop (Page): 11812.1636" );
        System.out.println( "Old Bike Shop (Site): 1764.1924" );
        System.out.println( "The Bike Shop  The Ride Of A Lifetime (Page): 1764.1927" );
        System.out.println( "default (Page): 1764.1940" );
        System.out.println( "Bicycles  The Bike Shop (Page): 1764.1942" );
        System.out.println( "Kryo X26 MTB  Model X  The Bike Shop (Page): 1764.1957" );
        System.out.println( "Cart  The Bike Shop (Page): 1764.2013" );
        System.out.println( "Checkout  The Bike Shop (Page): 1764.2030" );
        
        
        System.out.println( "HTML Generator (Integration): 9406.4024" );
        
        System.out.println( "Alchemy Execution Console (Integration): 9406.4026" );
        System.out.println( "Alchemy GUI Execution Console (Integration): 9406.4025" );
        
	
        System.exit( 0 );
      }

      DataSource<String,DataTable> _dS = null;
      DataTable<String,DataField,DataRow> _dT = null;
      DataField<String> _dF = null; 
      

      

      if ( cli.hasOption( "a" ) ) {
        SuiteExecutionWrapper.instance().setName(cli.getOptionValue( "a" ));
      } else {
        SuiteExecutionWrapper.instance().setName("Buy Bicycles");
      }
      if ( cli.hasOption( "u" ) ) {
        SuiteExecutionWrapper.instance().setUserName(cli.getOptionValue( "u" ));
      } else {
        SuiteExecutionWrapper.instance().setUserName("");
      }
      if ( cli.hasOption( "d" ) ) {
        SuiteExecutionWrapper.instance().setDescription(cli.getOptionValue( "d" ));
      } else {
        SuiteExecutionWrapper.instance().setDescription("No description was added for Buy Bicycles");
      }

      //
      // Configure the test level information
      //
      List<String> testList = new ArrayList(5);
      
      if ( hasValue( "it", "8885.945" ) ) {
        if ( 0 == 0 || ( 0 == 1 && cli.hasOption( "rd" ) ) || ( 0 == 2 && cli.hasOption( "rq" ) ) ) {
          TestManager.instance().registerTest( new org.org_1.buy_bicycles.purchase_any_bike_pattern_match() );
          testList.add("Purchase Any Bike Pattern Match");
        }
      }
      
      if ( hasValue( "it", "11812.1383" ) ) {
        if ( 0 == 0 || ( 0 == 1 && cli.hasOption( "rd" ) ) || ( 0 == 2 && cli.hasOption( "rq" ) ) ) {
          TestManager.instance().registerTest( new org.org_1.buy_bicycles.purchase_various_products() );
          testList.add("Purchase Various Products");
        }
      }
      
      

      
      



      
      //
      // Register the execution routers here
      //
      Router r;
      /*
      Routers from For114
      Add a description of For114
      */
      if ( hasValue( "ir", "13745.1478" ) ) { 
        r = new Router( 1, "For114", "13745.1478" ,"{\"name\":\"For114\",\"description\":\"For114\",\"alchemyId\":1478,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"routerId\":1,\"status\":0,\"userId\":0,\"propertyList\":[{\"name\":\"URL\",\"value\":\"http://localhost:4444/wd/hub\"}]}" );
      
        r.addProperty( "URL", DataManager.instance().replaceValues( "http://localhost:4444/wd/hub" ) + "" );
        SuiteExecutionWrapper.instance().routerList.add(r);
      }
      
 
      //
      // Configure the endpoint details here
      //
      List<ExecutionTarget> targetList = new ArrayList<>(10);
      ExecutionTarget eT;
      /*
      Targets from For114
      Add a description of For114
      */
      if ( hasValue( "ie", "13745.1479" ) ) {
        eT = new ExecutionTarget( "chrome", "13745.1479", "13745.1478", 1 ,"{\"name\":\"chrome\",\"description\":\"chrome\",\"alchemyId\":1479,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"maximumAvailable\":1,\"executionRouterID\":{\"alchemyId\":1478,\"alchemySeed\":13745},\"propertyList\":[{\"name\":\"browserName\",\"value\":\"chrome\"},{\"name\":\"platformName\",\"value\":\"ANY\"}],\"status\":0,\"userId\":0,\"referenceSuiteID\":0}" );
        eT.addProperty( "browserName", DataManager.instance().replaceValues( "chrome" ) + "" );
        eT.addProperty( "platformName", DataManager.instance().replaceValues( "ANY" ) + "" );
        targetList.add(eT);
      }
      if ( hasValue( "ie", "13745.1480" ) ) {
        eT = new ExecutionTarget( "firefox", "13745.1480", "13745.1478", 0 ,"{\"name\":\"firefox\",\"description\":\"firefox\",\"alchemyId\":1480,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"maximumAvailable\":0,\"executionRouterID\":{\"alchemyId\":1478,\"alchemySeed\":13745},\"propertyList\":[{\"name\":\"browserName\",\"value\":\"firefox\"},{\"name\":\"platformName\",\"value\":\"ANY\"}],\"status\":0,\"userId\":0,\"referenceSuiteID\":0}" );
        eT.addProperty( "browserName", DataManager.instance().replaceValues( "firefox" ) + "" );
        eT.addProperty( "platformName", DataManager.instance().replaceValues( "ANY" ) + "" );
        targetList.add(eT);
      }
      if ( hasValue( "ie", "13745.1481" ) ) {
        eT = new ExecutionTarget( "MicrosoftEdge", "13745.1481", "13745.1478", 0 ,"{\"name\":\"MicrosoftEdge\",\"description\":\"MicrosoftEdge\",\"alchemyId\":1481,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"maximumAvailable\":0,\"executionRouterID\":{\"alchemyId\":1478,\"alchemySeed\":13745},\"propertyList\":[{\"name\":\"browserName\",\"value\":\"MicrosoftEdge\"},{\"name\":\"platformName\",\"value\":\"ANY\"}],\"status\":0,\"userId\":0,\"referenceSuiteID\":0}" );
        eT.addProperty( "browserName", DataManager.instance().replaceValues( "MicrosoftEdge" ) + "" );
        eT.addProperty( "platformName", DataManager.instance().replaceValues( "ANY" ) + "" );
        targetList.add(eT);
      }
      

      //
      // This will add all targets to the correct router
      //
      targetList.forEach((t) -> {
        SuiteExecutionWrapper.instance().routerList.forEach((_t) -> {
          _t.addTarget(t);
        });
      });


      if ( cli.hasOption( "t" ) ) {
        TestManager.instance().setTags( cli.getOptionValues( "t" ));
      }

      if (testList.isEmpty() || targetList.isEmpty()) {
        if (testList.isEmpty()) {
          throw new IllegalArgumentException("No tests were added - nothing to do");
        }

        if (targetList.isEmpty()) {
          throw new IllegalArgumentException("No Execution Targets were defined - nowhere to run your tests");
        }
      } else {


      //
      // Configuration Integrations
      //
      Integration cI = null;
      
      if ( hasValue( "iw", "9406.4024" ) ) { 
        cI = new com.orasi.integration.html.HTMLSerializer();
        log.warn( "Enabling Integration: " + cI.getTitle() );
        cI.setProperty( "outputFolder", SuiteExecutionWrapper.instance().getOption( cI.getKey(), "outputFolder", DataManager.instance().replaceValues( "." ) + "" ) );
        cI.setProperty( "launchUi", SuiteExecutionWrapper.instance().getOption( cI.getKey(), "launchUi", DataManager.instance().replaceValues( "false" ) + "" ) );
      
        cI.initialize();
        cI.getHandlers().forEach((t) -> {
          addEventHandler(t);
        });
      }
      
      
      
      if ( hasValue( "iw", "9406.4026" ) ) { 
        cI = new com.orasi.integration.console.ExecutionConsole();
        log.warn( "Enabling Integration: " + cI.getTitle() );
        cI.setProperty( "color", SuiteExecutionWrapper.instance().getOption( cI.getKey(), "color", DataManager.instance().replaceValues( "false" ) + "" ) );
      
        cI.initialize();
        cI.getHandlers().forEach((t) -> {
          addEventHandler(t);
        });
      }
      
      if ( hasValue( "iw", "9406.4025" ) ) { 
        cI = new com.orasi.integration.guiconsole.GUIExecutionConsole();
        log.warn( "Enabling Integration: " + cI.getTitle() );
        cI.setProperty( "port", SuiteExecutionWrapper.instance().getOption( cI.getKey(), "port", DataManager.instance().replaceValues( "8086" ) + "" ) );
      
        cI.initialize();
        cI.getHandlers().forEach((t) -> {
          addEventHandler(t);
        });
      }
      

        //
      // Get all active targets
      //
      List<String> targetNames = new ArrayList<>(10);
      List<String> localTargetNames = new ArrayList<>(10);
      SuiteExecutionWrapper.instance().routerList.forEach((_t) -> {
        _t.getTargetList().forEach((t) -> {
          
          String useName = t.getName() + " from " + _t.getName();
          useName = useName.toLowerCase();
          
          if ( localTargetNames.contains( useName ) ) {
            t.setName( t.getName() + "_" + generateCharacters( 5 ) );
            targetNames.add(t.getName() + " from " + _t.getName());
          } else {
            localTargetNames.add( useName );
            targetNames.add(t.getName() + " from " + _t.getName());
          }
        });
      });

      SuiteExecutionWrapper.instance().targetList = targetNames;
      SuiteExecutionWrapper.instance().testList = TestManager.instance().getTestNames();
      SuiteExecutionWrapper.instance().start();
      }  
    }
    
    public int getExecutionId() {
      return executionId;
    }
  
    public static SuiteExecutionWrapper instance() {
      return singleton;
    }
  
    private ExecutorService eS;
  
    public void start() {
      
      if ( cli.hasOption( "p" ) ) {
        try { threadCount = Integer.parseInt( cli.getOptionValue( "p" ) ); } catch( Exception e ) {}
      }

      if ( cli.hasOption( "f" ) ) {
        try { checkFailureLevel = Integer.parseInt( cli.getOptionValue( "f" ) ); } catch( Exception e ) {}
      }

      executionId = 1;

      int totalTargets = 0;
      for ( Router _t : SuiteExecutionWrapper.instance().routerList ) {
        for ( ExecutionTarget t : _t.getTargetList() ){
          totalTargets++;
        }
      }

      Map<String, String> cliMap = new HashMap<>(5);
      for (Option o : cli.getOptions()) {
        if (o.getLongOpt() != null && !o.getLongOpt().trim().isEmpty()) {
          cliMap.put(o.getLongOpt() + " (-" + o.getOpt() + ")", String.join(",", o.getValuesList()));
        } else {
          cliMap.put("-" + o.getOpt(), String.join(",", o.getValuesList()));
        }
      }

      

      int totalTasks = TestManager.instance().getSize() * totalTargets;

      ExecutionQueue eQ = new ExecutionQueue(totalTasks > threadCount ? threadCount : totalTasks, 3, 3);
      if ( threadCount > totalTasks ) {
        threadCount = totalTasks;
      }

      SuitePayload suitePayload = new SuitePayload();
      suitePayload.setExecutionIdentifier( executionId );
      suitePayload.setName(name);
      suitePayload.setDescription(description);
      suitePayload.setUserName(userName);
      suitePayload.setSuiteDetail(  "{\"id\":2635,\"name\":\"Buy Bicycles\",\"description\":\"No description was added for Buy Bicycles\",\"userId\":20,\"userConfidence\":0,\"organizationId\":1,\"organizationConfidence\":0,\"status\":1,\"endpointId\":1,\"endpointStyleId\":1,\"targetId\":2781,\"targetConfigurationId\":0,\"targetVersionId\":0,\"reviewFlag\":0,\"importTests\":0,\"importFunctions\":0,\"importSites\":0,\"importTargets\":0,\"importData\":0,\"shareCount\":0,\"conductorList\":[{\"reviewFlag\":0,\"id\":3118,\"name\":\"For114\",\"description\":\"Add a description of For114\",\"alchemyId\":1477,\"alchemySeed\":13745,\"organizationId\":1,\"userId\":20,\"version\":0,\"targetDetail\":\"[{\\\"name\\\": \\\"chrome\\\", \\\"status\\\": 0, \\\"userId\\\": 0, \\\"changed\\\": false, \\\"alchemyId\\\": 1479, \\\"alchemySeed\\\": 13745, \\\"description\\\": \\\"chrome\\\", \\\"propertyList\\\": [{\\\"name\\\": \\\"browserName\\\", \\\"value\\\": \\\"chrome\\\"}, {\\\"name\\\": \\\"platformName\\\", \\\"value\\\": \\\"ANY\\\"}], \\\"organizationId\\\": 0, \\\"maximumAvailable\\\": 1, \\\"referenceSuiteID\\\": 0, \\\"executionRouterID\\\": {\\\"alchemyId\\\": 1478, \\\"alchemySeed\\\": 13745}}, {\\\"name\\\": \\\"firefox\\\", \\\"status\\\": 0, \\\"userId\\\": 0, \\\"changed\\\": false, \\\"alchemyId\\\": 1480, \\\"alchemySeed\\\": 13745, \\\"description\\\": \\\"firefox\\\", \\\"propertyList\\\": [{\\\"name\\\": \\\"browserName\\\", \\\"value\\\": \\\"firefox\\\"}, {\\\"name\\\": \\\"platformName\\\", \\\"value\\\": \\\"ANY\\\"}], \\\"organizationId\\\": 0, \\\"maximumAvailable\\\": 0, \\\"referenceSuiteID\\\": 0, \\\"executionRouterID\\\": {\\\"alchemyId\\\": 1478, \\\"alchemySeed\\\": 13745}}, {\\\"name\\\": \\\"MicrosoftEdge\\\", \\\"status\\\": 0, \\\"userId\\\": 0, \\\"changed\\\": false, \\\"alchemyId\\\": 1481, \\\"alchemySeed\\\": 13745, \\\"description\\\": \\\"MicrosoftEdge\\\", \\\"propertyList\\\": [{\\\"name\\\": \\\"browserName\\\", \\\"value\\\": \\\"MicrosoftEdge\\\"}, {\\\"name\\\": \\\"platformName\\\", \\\"value\\\": \\\"ANY\\\"}], \\\"organizationId\\\": 0, \\\"maximumAvailable\\\": 0, \\\"referenceSuiteID\\\": 0, \\\"executionRouterID\\\": {\\\"alchemyId\\\": 1478, \\\"alchemySeed\\\": 13745}}]\",\"routerDetail\":\"[{\\\"name\\\": \\\"For114\\\", \\\"status\\\": 0, \\\"userId\\\": 0, \\\"changed\\\": false, \\\"routerId\\\": 1, \\\"alchemyId\\\": 1478, \\\"alchemySeed\\\": 13745, \\\"description\\\": \\\"For114\\\", \\\"propertyList\\\": [{\\\"name\\\": \\\"URL\\\", \\\"value\\\": \\\"http://localhost:4444/wd/hub\\\"}], \\\"organizationId\\\": 0}]\",\"status\":1,\"lockUserId\":0,\"changed\":false,\"createDate\":\"Aug 7, 2024, 10:42:20 PM\",\"modifyDate\":\"Aug 7, 2024, 10:42:20 PM\",\"targetList\":[{\"name\":\"chrome\",\"description\":\"chrome\",\"alchemyId\":1479,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"maximumAvailable\":1,\"executionRouterID\":{\"alchemyId\":1478,\"alchemySeed\":13745},\"propertyList\":[{\"name\":\"browserName\",\"value\":\"chrome\"},{\"name\":\"platformName\",\"value\":\"ANY\"}],\"status\":0,\"userId\":0,\"referenceSuiteID\":0},{\"name\":\"firefox\",\"description\":\"firefox\",\"alchemyId\":1480,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"maximumAvailable\":0,\"executionRouterID\":{\"alchemyId\":1478,\"alchemySeed\":13745},\"propertyList\":[{\"name\":\"browserName\",\"value\":\"firefox\"},{\"name\":\"platformName\",\"value\":\"ANY\"}],\"status\":0,\"userId\":0,\"referenceSuiteID\":0},{\"name\":\"MicrosoftEdge\",\"description\":\"MicrosoftEdge\",\"alchemyId\":1481,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"maximumAvailable\":0,\"executionRouterID\":{\"alchemyId\":1478,\"alchemySeed\":13745},\"propertyList\":[{\"name\":\"browserName\",\"value\":\"MicrosoftEdge\"},{\"name\":\"platformName\",\"value\":\"ANY\"}],\"status\":0,\"userId\":0,\"referenceSuiteID\":0}],\"routerList\":[{\"name\":\"For114\",\"description\":\"For114\",\"alchemyId\":1478,\"alchemySeed\":13745,\"organizationId\":0,\"changed\":false,\"routerId\":1,\"status\":0,\"userId\":0,\"propertyList\":[{\"name\":\"URL\",\"value\":\"http://localhost:4444/wd/hub\"}]}],\"acls\":[]}],\"version\":107,\"lockUserId\":0,\"testDisplay\":0,\"alchemyId\":1920,\"alchemySeed\":1764,\"referenceSuiteID\":0,\"changed\":false}" );
      suitePayload.setTestList(testList);
      suitePayload.setTargetList(targetList);
      suitePayload.setTotalTests(totalTasks);
      suitePayload.setOtherValue( "threadCount", threadCount );
      suitePayload.setOtherValue( "cliMap", cliMap );
      suitePayload.setOtherValue( "routers", new Gson().toJson( SuiteExecutionWrapper.instance().routerList ) );
      notifyListeners( new SuiteEvent( suitePayload, name, 1 ) );

      
      log.warn(TestManager.instance().getSize() + " Tests executing across " + totalTargets + " devices ");
      log.warn("Submitting " + totalTasks + " tasks for execution");
      addEventHandler(new TestFailureHandler());

      TestManager.instance().getTests().forEach((t) -> {
        SuiteExecutionWrapper.instance().routerList.forEach((r) -> {
          r.getTargetList().forEach((_t) -> {
            eQ.addExecution(new EndpointDevice(r, _t), t);
          });
        });
      });

      eQ.run();

    if (failureCount > 0 && failureLevel >= checkFailureLevel) {
      log.atWarn().log("Notifying Integration of Suite Failure");
      try {
        notifyListeners(new SuiteEvent(suitePayload, name, EventHook.FAILURE.getId()));
      } catch (Exception e) {
        log.atError().log("Failed to notify suites of failure");
      }
    } else {

      log.atWarn().log("Notifying Integration of Suite Success");
      try {
        notifyListeners(new SuiteEvent(suitePayload, name, EventHook.SUCCESS.getId()));
      } catch (Exception e) {
        log.atError().log("Failed to notify suites of success");
      }
    }

    log.atWarn().log("Notifying Integration of Suite Complete");
    try {
      notifyListeners(new SuiteEvent(suitePayload, name, EventHook.AFTER.getId()));
    } catch (Exception e) {
      log.atError().log("Failed to notify suites of success");
    }
  }
  
  
    /**
     * @return the name
     */
    public String getName() {
      return name;
    }
  
    /**
     * @param name the name to set
     */
    private void setName(String name) {
      this.name = name;
    }
  
    /**
     * @return the description
     */
    public String getDescription() {
      return description;
    }
  
    /**
     * @param description the description to set
     */
    private void setDescription(String description) {
      this.description = description;
    }
  
    /**
     * @return the id
     */
    public int getId() {
      return id;
    }
  
    /**
     * @param id the id to set
     */
    private void setId(int id) {
      this.id = id;
    }
  
    /**
     * @return the userName
     */
    public String getUserName() {
      return userName;
    }
  
    /**
     * @param userName the userName to set
     */
    private void setUserName(String userName) {
      this.userName = userName;
    }
  
  }
  