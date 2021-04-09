package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.homepage;
import pageobject.otherreq;
import pageobject.searchingkudos;
import resources.base;


public class kudos_search extends base{
	@BeforeClass
	public void basePageNavigat() throws IOException, AWTException {
		driver=initializeDriver();		
		driver.get("https://qtrecognition.testqtwiz.com/");	
	}
	@BeforeMethod
	public void basePageNa() throws IOException, AWTException  {
		searchingkudos  ks=new searchingkudos(driver);
		homepage hd=new homepage(driver);
		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();
	}
	
	@Test
	public void basePageNavigation2() throws IOException, AWTException  {
		Robot r=new Robot();
		searchingkudos  ks=new searchingkudos(driver);
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		//valid name
		ks.searchkudos().click();
		ks.searchentry().sendKeys("Lavanya Channabasavachari");;
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		ks.searchclick().click();
	}	
		
		@Test
		//valid email
		public void searchkbyvname() throws IOException, AWTException  {
		searchingkudos  ks=new searchingkudos(driver);
		Robot r=new Robot();
		ks.searchkudos().click();
		ks.searchentry().sendKeys("aishwarya.matada@qualitestgroup.com");
		ks.searchclick().click();
		log2.info("Enter email");
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}	
		ks.searchkudos().click();
		ks.searchentry().sendKeys("aishwarya.matada@qualitestgroup.com");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		ks.searchclick().click();
		}	
			
		//invalid email
		@Test
		public void searchkbyinvalidname() throws IOException, AWTException, InterruptedException  {
			searchingkudos  ks=new searchingkudos(driver);
			Robot r=new Robot();
		ks.searchkudos().click();
		ks.searchentry().sendKeys("aishwarya@qualitestgroup.com");;
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		ks.searchclick().click();
		File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Desktop\\Screenshots\\invalid_email.png"));
		log2.info("invalid email");
		}
		//valid name without selecting from the dropdown
		@Test
		public void searchbyvalidname() throws IOException, AWTException  {
			searchingkudos  ks=new searchingkudos(driver);
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		ks.searchkudos().click();
		ks.searchentry().sendKeys("Aishwarya Matada");
		ks.searchclick().click();
		log2.info("valid email but need to enter email from the dropdown");
		
		}
		
		//invalid name
		@Test
		public void searchbyinvalidname() throws IOException, AWTException  {
			searchingkudos  ks=new searchingkudos(driver);
			Robot r=new Robot();	
		ks.searchkudos().click();
		ks.searchentry().sendKeys("rukmini");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		ks.searchclick().click();
		log2.info("invalid name");
		
		//kudos to me and from me
		//ks.Clickkudosfromme().click();
		//ks.Clickkudostome().click();
		
	}
		@Test
		public void kudosfrommme() throws IOException, AWTException, InterruptedException  {
			otherreq ot=new otherreq(driver);
			ot.clickkudosfromme().click();
			Thread.sleep(4000);
			String kfm=ot.kfromme().getText();
			System.out.println(kfm);
			Assert.assertTrue(kfm.contains("Aishwarya"));
			Thread.sleep(2000);
			
			if(kfm.contains("Aishwarya"))
			{
				log2.info("Pass:the List of names displayed after clicking kudos from me");
			}
			else
			{
				log2.error("Fail:the List of names did not displayed after clicking kudos from me");
			}
		}	
		
		

		@Test
		public void kudostoommme() throws IOException, AWTException, InterruptedException  {
			driver=initializeDriver();
			driver.get("https://qtrecognition.testqtwiz.com/");
			homepage hd=new homepage(driver);
			otherreq ot=new otherreq(driver);
			hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");;
			hd.Clickpassword().sendKeys("P@ssw0rd");
			hd.Clicklogin().click();
			ot.clickkudostomee().click();
			String ktm=ot.kudostome().getText();
			//System.out.println(ktm);
			Assert.assertEquals(ktm, "Aishwarya Matada");
			Assert.assertTrue(ktm.contains("Aishwarya Matada received an appreciation"));
			if(ktm.contains("Aishwarya Matada received an appreciation"))
			{
				log2.info("Pass:the List of names displayed after clicking kudos to me button");
			}
			else
			{
				log2.error("Fail:the List of names did not displayed after clicking kudos to me button");
			}
			   
		}
	@AfterClass
		public void closebrowser() throws IOException, AWTException {
			driver.close();	
		}
}
