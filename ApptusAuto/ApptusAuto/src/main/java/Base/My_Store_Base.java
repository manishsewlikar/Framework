/**
 * 
 */
package Base;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.testng.ITestResult;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.relevantcodes.extentreports.LogStatus;

import Utilities.CheckLoader;
import Utilities.ReadProperty;
import Utilities.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
//import com.aventstack.extentreports.ExtentReports;
import org.apache.commons.io.FileUtils;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.LogStatus;
//import com.itextpdf.text.Document;




public class My_Store_Base {

	/**
	 * @param driver2 
	 * 
	 */
	

	/**
	 * @param args
	 */
	 public static WebDriver driver;
	 public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
	public static ExtentTest logger;	
	 public static String str_data = "";
	 public static String strLine = "";
	 public static String UAT=null;
	 public static String OSName=null;
	 public static WebElement ProxyLogin;
	 public static WebElement User;
	
	 
	 public ExtentReports reports1;
	 public	 static ExtentReports reports;
	 //public static ExtentHtmlReporter htmlReporter;
	 public static String url=null;
	 
	 public static String SITUser=null;
	 public static String Verifytext=null;
	 public static long  startTime;
  
	 /*public static String strLine = "";
	 public static String str_data = "";*/
	
	 
		
		
		
 
	    public String QuoteID;
	    Date today = Calendar.getInstance().getTime();
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-hh.mm.ss");
	    String folderName = formatter.format(today);
	    	
	    public static String dateAndTime = new SimpleDateFormat("dd-MMM-yyy hh-mm a z").format(Calendar.getInstance().getTime());
	    public static String screenshotsDirectory = System.getProperty("user.dir") +  "\\TestEvidence\\Screenshots"+"_"+ dateAndTime;
	 //   private static Logger logger = LoggerFactory.getLogger(TestBase.class);
	    
	    //public static ExtentHtmlReporter htmlReporter;
	    	 
	 
	 @SuppressWarnings("deprecation")
	@BeforeSuite
	 public void initialize() throws IOException, InterruptedException, ConfigurationException
	 {
		// DOMConfigurator.configure("log4j.xml");
		  startTime = System.currentTimeMillis();
		   CheckLoader cls = new CheckLoader();
		   SITUser=ReadProperty.getResources("Username");
		   //String IEpath=ReadProperty.getResources("IE.path");
			 url = ReadProperty.getResources("URL");
			//String Edgepath = ReadProperty.getResources("Edge.path");
			String user = ReadProperty.getResources("Username");
			String password = ReadProperty.getResources("Password");
		   String chromePath = ReadProperty.getResources("chrome.path");
		   Thread.sleep(5000);
		   /*String fileName = ("Teststatus/EthernetP2PNew.txt");
		  File file = new File(fileName);
		   */
		   String Chromdriver="taskkill /f /t /im chromedriver.exe";
		    /*String chrombro="taskkill /f /t /im chrome.exe";
		    
		    try {
		        Process process = Runtime.getRuntime().exec(chrombro);
		        
		        System.out.println("Chrome Browser process "+process.getOutputStream());
		        BufferedReader reader=new BufferedReader( new InputStreamReader(process.getInputStream()));
		        String s; 
		        while ((s = reader.readLine()) != null){
		            System.out.println("The inout stream is " + s);
		        }                   
		    } catch (IOException e) {
		        e.printStackTrace();
		    }*/
		    
		    try {
		        Process process1 = Runtime.getRuntime().exec(Chromdriver);
		        
		        System.out.println("Chromdriver Process "+process1.getOutputStream());
		        BufferedReader reader=new BufferedReader( new InputStreamReader(process1.getInputStream()));
		        String s; 
		        while ((s = reader.readLine()) != null){
		            System.out.println("The inout stream is " + s);
		        }                   
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    Thread.sleep(5000);
		   /*File file = new  File("Teststatus/EthernetP2P.txt");
			try{

		    
		    	
		    	
		        if(  file.exists() )
		    	{
		        	file.delete();
		    		System.out.println(file.getName() + " is deleted!");
		    	}else{
		    		System.out.println("Delete operation is failed.");
		    	}

		    }catch(Exception e){

		    	e.printStackTrace();

		    }
			 FileWriter fw = new FileWriter(file.getAbsoluteFile());
		        BufferedWriter bw = new BufferedWriter(fw);*/
		
		   
		  // PropertiesConfiguration config = new PropertiesConfiguration("D:\\SanityBackup27Dec2019-All\\SanityBKP27Dec19\\COLT_SANITY_WS\\Colt_Auto_TEST2\\TestData\\COLTRes.properties");
		 //  D:\\SanityBackup27Dec2019-All\\SanityBKP27Dec19\\COLT_SANITY_WS\\Colt_Auto_TEST2\\drivers\\chromedriver.exe
			System.out.println("Current instance under test...."+url);
			
			
		  // setDriver(driver);
		//	WebDriverManager.chromedriver().setup();
		  
		  // System.setProperty("webdriver.chrome.driver","D:\\SanityBackup27Dec2019-All\\SanityBKP27Dec19\\COLT_SANITY_WS\\Colt_Auto_TEST2\\drivers\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver","D:\\Manish_COLT\\Colt_Auto\\drivers\\chromedriver.exe");\
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		  // D:\SanityBackup27Dec2019-All\SanityBKP27Dec19\COLT_SANITY_WS\Colt_Auto_TEST2\drivers
		   DesiredCapabilities dcap = new DesiredCapabilities();

		 /*  DesiredCapabilities options = DesiredCapabilities.chrome();
		   options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);*/
           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_content_setting_values.popups", 1);

		   ChromeOptions options1 = new ChromeOptions();
		   options1.setExperimentalOption("prefs", prefs);
		   //options1.addArguments("disable-infobars");
		  // options1.addArguments("--start-maximized");

		   options1.addArguments("no-sandbox");
		   options1.addArguments("--dns-prefetch-disable");
		   options1.addArguments("ignore-certificate-errors"); 
		   options1.addArguments("--allow-running-insecure-content");
		  // options1.setCapability("chrome.binary", chromePath);
		   //options1.setCapability("chrome.binary", chromePath);
		   options1.setCapability(ChromeOptions.CAPABILITY, options1);
		   options1.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		   dcap.setCapability("pageLoadStrategy", "normal");
		   options1.setPageLoadStrategy(PageLoadStrategy.EAGER);	
		   options1.merge(dcap);

		   options1.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
 
//("user.dir")+"\\drivers\\chromedriver.exe
		   WebDriverManager.chromedriver().version("84.0.4147.30").setup();
	     	driver = new ChromeDriver(options1);
		  driver.manage().deleteAllCookies();
	         driver.manage().window().maximize();
	         //Implicit wait
	        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        		Thread.sleep(3000);
	        		OSName = System.getProperty("os.name");
					System.out.println("OS: " + OSName);
					
	 }
	 

	
	 @SuppressWarnings("deprecation")

	 public WebDriver getDriver() {

	        return driver;

	    }

	    public void setDriver(WebDriver driver)
	    {
	        this.driver = driver;
	    }


	 public String captureScreenshot(WebDriver driver, String screenShotName){
	       // logger.info("screenshotsDirectory:"+screenshotsDirectory);
	        String dateAndTime = new SimpleDateFormat("dd-MMM-yyy hh-mm a z").format(Calendar.getInstance().getTime());
	     //   logger.info("dateAndTime:"+dateAndTime);
	        try {
	            TakesScreenshot screenShot = (TakesScreenshot)driver;
	            File source = screenShot.getScreenshotAs(OutputType.FILE);
	            String dest = screenshotsDirectory + "\\"+ screenShotName +"_"+dateAndTime+ ".jpg";
	            File destination = new File(dest);
	            FileUtils.copyFile(source, destination);
	            return dest;
	        } catch (IOException e) {
	           // logger.error("Error in captureScreenshot Method: ", e.getMessage());
	            return e.getMessage();
	        }

	    }
	 
	 	    
	    

	    @BeforeSuite
		public void setup() {
			// TODO Auto-generated constructor stub
			//String	timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			//htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STM"+timeStamp+"ExtentReport.html");
			 extent = new ExtentReports ();
			 htmlReporter = new ExtentHtmlReporter("./ExtentReport/MyStore.html.html");
			 htmlReporter.setAppendExisting(true);
			 //htmlReporter = new ExtentHtmlReporter(System.getProperty("./ExtentReport/Report.html"));
				 extent = new ExtentReports();
				 extent.attachReporter(htmlReporter);
			
				 extent.setSystemInfo("OS", OSName);
			        extent.setSystemInfo("Tester", "Manish Sewlikar");
			        String SITUser=null;
					//extent.setSystemInfo("Environment", "QA");
			        extent.setSystemInfo("Logined as", SITUser);
			        htmlReporter.setAppendExisting(true);
			        htmlReporter.config().setChartVisibilityOnOpen(true);
			        htmlReporter.config().setDocumentTitle("MyStore Report");
			        htmlReporter.config().setReportName("MyStore Report");
			       // extent.setSystemInfo("Environment", UAT);
			        htmlReporter.config().setTimeStampFormat("dd-MMM-yyy hh-mm aa");
			        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			        htmlReporter.config().setTheme(Theme.DARK);
			        htmlReporter.setAppendExisting(true);
			 
			        
			        }
		
		 @AfterSuite	
		   public void tearDown()
		   
		   {
			 try {
				extent.setSystemInfo("Environment", UAT);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		       extent.flush();
		  }
	
		   /* @AfterMethod
		    public void getResult(ITestResult result) throws IOException
		    {
		        if(result.getStatus() == ITestResult.FAILURE)
		        {
		        	//logger.log(Status.FAIL,"Quote Failed");
		        	String screenShotPath = CheckLoader.capture(driver, "screenShotName");
		            logger.log(Status.FAIL, result.getThrowable());
		            
		           logger.log(Status.FAIL, "Snapshot below: " + logger.addScreencastFromPath(screenShotPath));
		       //	logger.log(Status.FAIL,"Price Lookup");
		       	try {
	        		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
					  String tep=Utility.getScreenshot(driver,"Screenshot"+timeStamp+".jpg");
					logger.fail("Sanity Quote failed",MediaEntityBuilder.createScreenCaptureFromPath(tep).build());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		       		//extent.flush();
		        }
		       

		    }*/
		 private static WebElement expandRootElement(WebElement element) {
			    WebElement ele = (WebElement) ((JavascriptExecutor) driver)
			            .executeScript("return arguments[0].shadowRoot", element);
			    return ele;
			}
	    

		 
}
	   


