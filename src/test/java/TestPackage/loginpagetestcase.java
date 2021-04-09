package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.loginpage;
import pageobject.searchingkudos;
import resources.base;


public class loginpagetestcase extends base{
	@BeforeMethod
	public void color() throws IOException, AWTException  {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void color_gold() throws IOException, AWTException  {
		loginpage  l=new loginpage(driver);
		String b1=l.gold().getCssValue("background-color");
		File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
        FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Desktop\\Screenshots\\goldcolor.png"));
		Assert.assertEquals(b1,"rgba(254, 204, 22, 1)");
			
		driver.close();
		
}
	@Test
	public void color_white() throws IOException, AWTException, InterruptedException  {
		
		loginpage  l=new loginpage(driver);
		String b2=l.white().getCssValue("background-color");
		File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Desktop\\Screenshots\\Whitecolor.png"));
		Assert.assertEquals(b2,"rgba(147, 149, 152, 1)");
        driver.close();
		
}
	@Test
	public void color_navy() throws IOException, AWTException  {
		loginpage  l=new loginpage(driver);
		String b3=l.navy().getCssValue("background-color");
		File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Desktop\\Screenshots\\Whitecolor.png"));
		Assert.assertEquals(b3,"rgba(42, 37, 89, 1)");
		
}
		
	
}
