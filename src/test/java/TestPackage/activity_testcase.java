package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.channels.SeekableByteChannel;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.homepage;
import pageobject.sendingkudos;
import pageobject.activitypage;
import resources.base;
public class activity_testcase extends base{
	
	@Test
	public void basePageNavigation2() throws IOException, AWTException  {
		driver=initializeDriver();
		activitypage a=new activitypage(driver);
		driver.get("https://qtrecognition.testqtwiz.com/");
		Assert.assertEquals(driver.getTitle(),"QTRecognition");
		log2.info("successful navigation to activity page");
		a.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		a.Clickpassword().sendKeys("P@ssw0rd");
		a.Clicklogin().click();	
		a.Clickkudosfromme().click();
		a.Clickkudostome().click();
		

}
}
