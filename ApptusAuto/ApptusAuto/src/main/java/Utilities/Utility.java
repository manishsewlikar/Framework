package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static   String getScreenshot(WebDriver driver, String screenshotname ) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(src, new File("./ExtentReport/screenshot/"+screenshotname+".png"));
		String path=System.getProperty("user.dir")+"./ExtentReport/screenshot/"+screenshotname+".png";
		
		
		 return path;
	}

	
		
		
			
		
	

}
