package Utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.Charsets;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Base.My_Store_Base;
import com.google.common.io.Resources;

/*import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
*/
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CheckLoader extends My_Store_Base 
{

	
		// TODO Auto-generated constructor stub
	    @FindBy(how=How.XPATH, using="//div[2]/div[@role='dialog']//div[@class='oj-dialog-footer']/button")
	    public static WebElement RDialog;
	    
		//JavascriptExecutor js;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		static WebDriver driver=null;
		//  ATUTestRecorder recorder;
		
		
	    public void Logout(WebDriver driver) 
	    {
	    	//System.out.println("Logging out...");
	    	driver.findElement(By.xpath("//a[contains(text(),'logout')]")).click();
	    	System.out.println("Loggin-out...");
	    }
	    
	    
	   
	    
	   
	   

	    
	    
	    
	    
	   
	   
	    public void waitForLoad(WebDriver driver) { 
	    	System.out.println("Waiting for page load..");
	        ExpectedCondition<Boolean> pageLoadCondition = new 
	               ExpectedCondition<Boolean>() { 
	                  public Boolean apply(WebDriver driver) { 
	                     return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");                 } 
	               }; 
	       WebDriverWait wait = new WebDriverWait(driver, 30); 
	         wait.until(pageLoadCondition); 
	     } 
	    
	    
	    public  void ElementClickable(WebDriver driver, WebElement ele)
	    {
	        JavascriptExecutor js=(JavascriptExecutor)driver;
	        WebDriverWait wait = new WebDriverWait(driver, 20);
	        try{
	         ele.click();
	        }
	        catch(ElementNotVisibleException e){
	           // logger.info("Inside Element not visible exception");
	            wait.until(ExpectedConditions.visibilityOf(ele));
	            wait.until(ExpectedConditions.elementToBeClickable(ele));
	            ele.click();
	        }
	        catch(StaleElementReferenceException e)
	        {
	           // logger.info("Inside Stale Element reference catch block");
	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            ele.click();

	        }
	        catch(TimeoutException e){
	           // logger.info("Inside Timeout Exception");
	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	            wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	            // ele.click();
	        }

	        catch(WebDriverException e){
	          js.executeScript("arguments[0].click()",ele);
	        	//ele.click();
	            //logger.info("Clicked on element properly");
	        }


	        catch (Exception e){
	            e.printStackTrace();
	            //logger.info("Exception caught");
	        }


	    }
	    
	   
	    
	    public boolean WaitUntilInvisiblity(String xpath , WebDriver driver) 
		   {
	              // TODO Auto-generated constructor stub
	    	 System.out.println("Element is visible");
	              try {
	                     WebDriverWait wait = new WebDriverWait (driver, 4000);
	              wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	              return true;
	              }catch(Exception e) 
	              {
	            	 //e.getMessage();
	              }
	              System.out.println("Element is invisible");
				return false;
	       }
	    
	    
	    
	    
	    
	   
	    public boolean WaitUntilvisiblity(String xpath , WebDriver driver) 
		   {
	              // TODO Auto-generated constructor stub
	              System.out.println("Check Visiblity...");
	              try {
	                     WebDriverWait wait = new WebDriverWait (driver, 5000);
	              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	              return true;
	              }catch(Exception e) 
	              {
	            	  System.out.println("Elemented Visible");
	              }
				return false;
	       }
public void LoadingDataInd(WebDriver driver) 
	    {
	    	System.out.println("Checking Loading state...");
	    	try
	    	{
	    	long timeoutInSeconds = 5;
	        new WebDriverWait(driver, timeoutInSeconds)
	      .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@alt='loading']")));
	        System.out.println("Move to Next step...");
	    	}catch (ElementNotVisibleException e)
	    	   {
	    	   	//e.printStackTrace();
	    	   }
	    	System.out.println("Operation completed...");
	    }
	    


	    public void FileUploading(WebDriver driver) 
	    {
	    	System.out.println("Checking file loading state...");
	    	try
	    	{
	    	long timeoutInSeconds = 5;
	        new WebDriverWait(driver, timeoutInSeconds)
	      .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='ui-id-178']")));
	        System.out.println("Move to Next step...");
	    	}catch (ElementNotVisibleException e)
	    	   {
	    	   	//e.printStackTrace();
	    	   }
	    }
	    
	    public static boolean closeAllOtherWindows(String openWindowHandle) {
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String currentWindowHandle : allWindowHandles) {
				if (!currentWindowHandle.equals(openWindowHandle)) {
					driver.switchTo().window(currentWindowHandle);
					driver.close();
				}
			}
			
			driver.switchTo().window(openWindowHandle);
			if (driver.getWindowHandles().size() == 1)
				return true;
			else
				return false;
		}

	    public String getValueOfCookieNamed(String name) { 
	    	       return driver.manage().getCookieNamed(name).getValue(); 
	    	       } 

	    
	    public Set<Cookie> getAllCookies() { 
	    	      return driver.manage().getCookies(); 
	    	    } 

	    	public void waitForPageLoadBro(WebDriver driver) 
	    	
	    	{ 
	    	ExpectedCondition<Boolean> pageLoadCondition = new 
	    	               ExpectedCondition<Boolean>() { 
	    	                   public Boolean apply(WebDriver driver) { 
	    	                     return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"); 
	    	                  } 
	    	              }; 
	    	        WebDriverWait wait = new WebDriverWait(driver, 30); 
	    	      wait.until(pageLoadCondition); 
	    	      System.out.println("Page is loaded..");
	    	   } 
	    	
	    	public void selectItemByIndex(WebElement ele,int itemIndex,String customMessage){
	            try{
	                Select select = new Select(ele);
	                select.selectByIndex(itemIndex);
	          System.out.println("Selected item at index: " + itemIndex + " From " + customMessage);
	            }catch(NoSuchElementException e){
	                //logger.error(e.getMessage());
	                throw e;
	            }
	        }
	    	
	    	public void selectItemByOption(WebElement ele,String Option,String customMessage){
	            try{
	                Select select = new Select(ele);
	                select.selectByVisibleText(Option);
	          System.out.println("Selected item at index: " + Option + " From " + customMessage);
	            }catch(NoSuchElementException e){
	                //logger.error(e.getMessage());
	                throw e;
	            }
	        }
	    	
	    	
	    	public void DismissAlert() 
		    {
		    	System.out.println("Capturing Alerts...");
	    		try
		    	{
		    		int retries = 5;

		    		while (retries > 0) {
		    		    

		    		     Alert alert = driver.switchTo().alert();
		    		     alert.accept();

		    		    retries--;

		    		}
		        System.out.println("Moving to Next step...");
		    	}catch(TimeoutException e)
		    	{
		           //e.getMessage();
		        }
		    }
	    	
	    	/*public void setUp() throws Exception {
	            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
	            Date date = new Date();
	     
	            //create an object of ATUTestRecorder class and pass 3 parameters explained above.
	            recorder = new ATUTestRecorder("D:/COLTGen/","Script_Video_" + dateFormat.format(date), false);
	     
	            //To start video recording.
	            recorder.start();
	        }*/
	    	 /*public void StopRec() throws ATUTestRecorderException {
	             //close browser
	            
	              recorder.stop();
	              System.out.println("Recording is Stopped");
	        }
	    */
	    	 public  void waitForLoadtime(int i) {
	    	        try {
	    	            Thread.sleep(i);
	    	        } catch (InterruptedException e) {
	    	            e.printStackTrace();
	    	        }
	    	    } 
	    	 public  void clickWhenClickable(WebDriver driver, WebElement ele)
	    	    {
	    	        JavascriptExecutor js=(JavascriptExecutor)driver;
	    	        WebDriverWait wait = new WebDriverWait(driver, 20);
	    	        try{
	    	         ele.click();
	    	        }
	    	        catch(ElementNotVisibleException e){
	    	            logger.info("Inside Element not visible exception");
	    	            wait.until(ExpectedConditions.visibilityOf(ele));
	    	            wait.until(ExpectedConditions.elementToBeClickable(ele));
	    	            ele.click();
	    	        }
	    	        catch(StaleElementReferenceException e){
	    	            logger.info("Inside Stale Element reference catch block");
	    	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	            ele.click();

	    	        }
	    	        catch(TimeoutException e){
	    	            logger.info("Inside Timeout Exception");
	    	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    	            wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
	    	            // ele.click();
	    	        }

	    	        catch(WebDriverException e){
	    	            js.executeScript("arguments[0].click()",ele);
	    	            logger.info("Clicked on element properly");
	    	        }


	    	        catch (Exception e){
	    	            e.printStackTrace();
	    	            logger.info("Exception caught");
	    	        }


	    	    }
	    	 public void GeQuoteIdfFile() throws InterruptedException

	    	 {
	    	 	
	    	 	String SelQT=null;
	    	 	
	    	 	StringBuilder sb = new StringBuilder();
	    	    /* String strLine = "";
	    	     String str_data = "";*/
	    	     try {
	    	          BufferedReader br = new BufferedReader(new FileReader("TestEvidence/QuoteID.txt"));
	    	          while (strLine != null)
	    	          {
	    	             if (strLine == null)
	    	               break;
	    	             str_data += strLine;
	    	             strLine = br.readLine();
	    	             
	    	         }
	    	           System.out.println("Quote id is..."+str_data);
	    	          br.close();
	    	     } catch (FileNotFoundException e) {
	    	         System.err.println("File not found");
	    	     } catch (IOException e) {
	    	         System.err.println("Unable to read the file.");
	    	     }
	    	  	

	    	 }
	    	 public void WaitforPageLoad(WebDriver driver) throws InterruptedException {
	    		 int maxWaitMillis=30;
	    		 int pollDelimiter=10;
	    		    double startTime = System.currentTimeMillis();
	    		    while (System.currentTimeMillis() < startTime + maxWaitMillis) {
	    		        String prevState = driver.getPageSource();
	    		        Thread.sleep(pollDelimiter); // <-- would need to wrap in a try catch
	    		        if (prevState.equals(driver.getPageSource())) {
	    		            return;
	    		        }
	    		    }
	    		}
	    	 public void waitForJavascript(WebDriver driver) throws InterruptedException {
	    		 int maxWaitMillis=30;
	    		 int pollDelimiter=10;
	    		    double startTime = System.currentTimeMillis();
	    		    while (System.currentTimeMillis() < startTime + maxWaitMillis) {
	    		        String prevState = driver.getPageSource();
	    		        Thread.sleep(pollDelimiter); // <-- would need to wrap in a try catch
	    		        if (prevState.equals(driver.getPageSource())) {
	    		            return;
	    		        }
	    		    }
	    		    System.out.println("Page loaded Completely..");
	    	 }
	    	 
	    	  public boolean EleisClickable(WebDriver driver, WebElement ele)
	    	  {
	    		 try
	    		 { 
	    		 WebDriverWait wait = new WebDriverWait(driver, 15);
	    		 wait.until(ExpectedConditions.elementToBeClickable(ele));
	    		    return true;
	    		  }
	    		 catch (Exception e)
	    		 {
	    		 return false;
	    		  }
	    		 
	    		 

}
	    	  
	    	  public boolean CircleLodIndicator(WebDriver driver)
	    	  {
	    		 try
	    		 { 
	    		 WebDriverWait wait = new WebDriverWait(driver, 8);
	    		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[type='circle'] div]")));
	    		    return true;
	    		  }
	    		 catch (Exception e)
	    		 {
	    		 return false;
	    		  }    	  
	    	  
	    	  }
	    	  public void javascriptclick(String element)
	    	  {
	    	      WebElement webElement = driver.findElement(By.xpath(element));
	    	      JavascriptExecutor js = (JavascriptExecutor) driver;

	    	      js.executeScript("arguments[0].click();", webElement);
	    	      System.out.println("javascriptclick" + " " + element);
	    	  }
	    	  
	    	  public boolean LoadingAfLoginInd(WebDriver driver, WebElement ele)
	    	  {
	    		 try
	    		 { 
	    			  System.out.println("Element is visible ");
	    			 WebDriverWait wait = new WebDriverWait(driver, 15);
	    		 wait.until(ExpectedConditions.invisibilityOf(ele));
	    		 System.out.println("Element is Invisible move ahead ");
	    		    return true;
	    		  }
	    		 catch (Exception e)
	    		 {
	    		 return false;
	    		  }

	    	  
	  	   
	    	  
}

	    	  public Object  scrollElementIntoView(WebDriver driver, WebElement element) 
	    	  {
	    	        return ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
	    	        
	    	    }

	    	  public  void drawBorder(WebDriver driver, WebElement element)
	    	  {
	    	        
	    	        JavascriptExecutor jse = (JavascriptExecutor) driver;
	    	        jse.executeScript("arguments[0].style.border='3px solid green'", element);
	    	    }
	    	  
}


	     



	    
			



