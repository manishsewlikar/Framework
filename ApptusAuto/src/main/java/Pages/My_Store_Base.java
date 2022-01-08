package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import Utilities.CheckLoader;
import Utilities.ReadProperty;
import junit.framework.Assert;
 
public class My_Store_Base extends Base.My_Store_Base
{
	 
	String url = ReadProperty.getResources("URL");
	String user = ReadProperty.getResources("Username");
	String password = ReadProperty.getResources("Password");
	String verifytext=null;
	String SName=null;
	String SColor=null;
	String Sqty=null;
	String SPrice=null;
	WebDriver driver;
	ArrayList<String> Slist = new ArrayList<String>();
	
	CheckLoader cls = new CheckLoader();
	

	 
    public My_Store_Base(WebDriver driver)
    { 
         
            this.driver=driver;
            PageFactory.initElements(driver,this);
    }
    
    //Using FindBy for locating elements
    @FindBy(how=How.CSS, using="a[title='Log in to your customer account']")
	public WebElement Pageheader;
    
    
    @CacheLookup
    @FindBy(how=How.CSS, using="a[title='Log in to your customer account']")
	public WebElement Lnk_Signin;
    
    @FindBy(how=How.CSS, using="#email")
	public WebElement TxtUsername;
    
    @FindBy(how=How.CSS, using="#passwd")
	public WebElement TxtPwd;
    
    @FindBy(how=How.CSS, using="#login_form .submit span")
	public WebElement BtnSignin;
    
    @FindBy(how=How.CSS, using="#block_top_menu li:nth-of-type(3) [title='T-shirts']")
	public WebElement LnkTshrit;
    
    @FindBy(how=How.CSS, using="a[title='Add to cart'] > span")
	public WebElement BtnAddCart;
    
    @FindBy(how=How.CSS, using=".col-md-6.col-xs-12.layer_cart_product > h2")
	public WebElement MsgTxt;
    
    @FindBy(how=How.CSS, using="[title='Proceed to checkout'] span")
   	public WebElement BtnContShopping;
    
    @FindBy(how=How.CSS, using="a[title='Log me out']")
   	public WebElement LnkSignout;
    
    @FindBy(how=How.CSS, using="#layer_cart_product_title")
	public WebElement Shirtname;
    
    @FindBy(how=How.CSS, using="#layer_cart_product_attributes")
	public WebElement Shirtcolor;
     
    @FindBy(how=How.CSS, using="#layer_cart_product_quantity")
   	public WebElement Shirtqty;
    
    @FindBy(how=How.CSS, using="#layer_cart_product_price")
   	public WebElement ShirtPrice;
    
    @FindBy(how=How.CSS, using=".col-md-6.col-xs-12.layer_cart_product")
	public WebElement focusPopCart;
    
    
    
    public void LanuchApp() throws InterruptedException
{
	 driver.get(url);
     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Thread.sleep(5000);
     
    // driver.navigate().refresh();
     cls.waitForPageLoadBro(driver);
     Thread.sleep(3000);
     cls.waitForJavascript(driver);
     System.out.println("App lanuched");
     logger1.info("lanuching Successful..");  
}

public void LoginApp() throws InterruptedException
{
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView();", Lnk_Signin);
	Thread.sleep(3000);
	cls.EleisClickable(driver, Lnk_Signin);
	Thread.sleep(3000);
	cls.ElementClickable(driver, Lnk_Signin);
	Thread.sleep(3000);
	executor.executeScript("document.getElementById('login_form').focus()");
	Thread.sleep(3000);
	cls.EleisClickable(driver, TxtUsername);
	Thread.sleep(3000);
	TxtUsername.clear();
	TxtUsername.sendKeys(user);
	Thread.sleep(3000);
	cls.EleisClickable(driver, TxtPwd);
	Thread.sleep(3000);
	TxtPwd.clear();
	Thread.sleep(3000);
	cls.Sendkeys(driver, TxtPwd, 10, password);
//TxtPwd.sendKeys(password);
	Thread.sleep(3000);
	cls.EleisClickable(driver, BtnSignin);
	Thread.sleep(3000);
    cls.ElementClickable(driver, BtnSignin);
   
    cls.WaitforPageLoad(driver);
    Wait<WebDriver> gWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
            .pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
   
}



public void CartOperation() throws InterruptedException
{
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].scrollIntoView();", LnkTshrit);
	Thread.sleep(3000);
	cls.EleisClickable(driver, LnkTshrit);
	Thread.sleep(3000);
	cls.ElementClickable(driver, LnkTshrit);
	Thread.sleep(3000);
	cls.EleisClickable(driver, BtnAddCart);
	Thread.sleep(3000);
	cls.ElementClickable(driver, BtnAddCart);
	Thread.sleep(3000);
	
    cls.WaitUntilvisiblity("//div[@id='layer_cart']", driver);
    Thread.sleep(3000);
    System.out.println("Cart is visible");
    
    //executor.executeScript("arguments[0].scrollIntoView();", focusPopCart);
    executor.executeScript("document.getElementById('layer_cart').focus()");
    Thread.sleep(3000);
    
          	executor.executeScript("arguments[0].scrollIntoView();", MsgTxt);
              Verifytext=MsgTxt.getText();
              System.out.println("captured text"+Verifytext);
              SName=Shirtname.getText();
              SColor=Shirtcolor.getText();
              Sqty=Shirtqty.getText();
              SPrice=ShirtPrice.getText();
              SColor = SColor.replaceAll("[,;\\s]", "");
            //  System.out.println(SColor);
              captureScreenshot(driver, "screenShotName");
              Assert.assertEquals("Product successfully added to your shopping cart", Verifytext);
              Assert.assertEquals("Faded Short Sleeve T-shirts",SName);
              Assert.assertEquals("OrangeS", SColor);
              Assert.assertEquals("1",Sqty );
              Assert.assertEquals("$16.51",SPrice);
              
              cls.EleisClickable(driver, BtnContShopping);
              Thread.sleep(3000);
              cls.ElementClickable(driver, BtnContShopping);
              Thread.sleep(3000);
              try {
				executor.executeScript("arguments[0].scrollIntoView();", LnkSignout);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
              Thread.sleep(3000);
              try {
				cls.EleisClickable(driver, LnkSignout);
				  Thread.sleep(3000);
				  cls.ElementClickable(driver, LnkSignout);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
              //driver.quit();
                         
              
    
    
}

public void Logout() throws InterruptedException
{
	
	driver.quit();
	
}

public static String[] GetStringArray(ArrayList<String> arr) 
{ 

    // Convert ArrayList to object array 
    Object[] objArr = arr.toArray(); 

    // convert Object array to String array 
    String[] str = Arrays 
                       .copyOf(objArr, objArr 
                                           .length, 
                               String[].class); 

    return str; 
} 

}




