
package Pages;

     import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
/*import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.log4j.xml.DOMConfigurator;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
 

import Utilities.CheckLoader;
import Utilities.ReadProperty;
import Utilities.Utility;

// Import package pageObject.*

     

    
public class My_Store_Login extends Base.My_Store_Base

{
	 Utilities.CheckLoader cls = new Utilities.CheckLoader();
	
	 @Test
	public void Login() throws Exception{
		
		 
		 
		 logger = extent.createTest("MyStore-Add To Cart");
		 logger.info("My Store add to cart operation is Started");
	
		 My_Store_Base LoginApp = PageFactory.initElements(driver, My_Store_Base.class);
		 Thread.sleep(5000);
		 LoginApp.LanuchApp(); 
		 LoginApp.LoginApp();
		 LoginApp.CartOperation();
		 String res = null;
		 
		 if (Verifytext.equalsIgnoreCase("Product successfully added to your shopping cart"))
	        {
	        	 
			 logger.log(Status.PASS,"MyStore-Add To Cart");
			 
	        captureScreenshot(driver, "screenShotName");
	        } else {
	        	
	        	 logger.log(Status.FAIL,"MyStore-Add To Cart");
	        	 captureScreenshot(driver, "screenShotName");
	        	 try {
	        		 String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
					  String tep=Utility.getScreenshot(driver,"Screenshot"+timeStamp+".jpg");
					logger.fail("MyStore-Add To Cart Failed",MediaEntityBuilder.createScreenCaptureFromPath(tep).build());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       	 
	        	 System.out.println("<<Completed>>");
	    
	        }
			
		
	}
	     }
