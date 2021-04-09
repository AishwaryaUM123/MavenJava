package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.homepage;
import pageobject.sendingkudos;
import pageobject.activitypage;
import resources.base;

public class qttestcase2 extends base {
	/*@Test

	public void basePageNavigation() throws IOException  {
		driver=initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		homepage hd=new homepage(driver);

		hd.Clickusername().sendKeys("aishu");
		hd.Clickpassword().sendKeys("hsgb");
		hd.Clicklogin().click();		
		driver.close();
	}
	
	@Test
	public void basePageNavigation1() throws IOException  {
		driver=initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		homepage hd=new homepage(driver);

		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();	
		driver.close();
	}*/
	@Test
	public void basePageNavigation2() throws IOException, AWTException  {
		driver=initializeDriver();
		activitypage a=new activitypage(driver);
		driver.get("https://qtrecognition.testqtwiz.com/");
		/*Assert.assertEquals(driver.getTitle(),"QTRecognition");
		System.out.println("tested");
		a.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		a.Clickpassword().sendKeys("P@ssw0rd");
		a.Clicklogin().click();	
		a.Clickkudosfromme().click();
		a.Clickkudostome().click();*/
		
		//sending kudos
		
		sendingkudos sk=new sendingkudos(driver);
		sk.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		sk.Clickpassword().sendKeys("P@ssw0rd");
		sk.Clicklogin().click();

		sk.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		sk.entertype2().click();
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.Entercomment().sendKeys("hello");
		sk.Send().click();
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		driver.navigate().back();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		sk.Clickpassword().sendKeys("P@ssw0rd");
		sk.Clicklogin().click();
		sk.sendkudos().click();

        

			
	}
	
}

