package TestPackage;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageobject.homepage;
import pageobject.intmodulefirst;
import pageobject.otherreq;
import pageobject.sendingkudos;
import resources.base;


public class otherreqtestcase extends base{
	@Test
	public void basePageNavigation2() throws IOException, AWTException, InterruptedException  {
		driver=initializeDriver();

		driver.get("https://qtrecognition.testqtwiz.com/");
		
		Robot r=new Robot();
		homepage hd=new homepage(driver);
		otherreq ot=new otherreq(driver);
		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();
		String cnt=driver.findElement(By.xpath("//*[@id=\"todayCount\"]")).getText();
		
		String ncnt=cnt.substring(0, 3);
		System.out.println(cnt);
		System.out.println(ncnt);
		ot.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		ot.enteremail().sendKeys("Lavanya Channabasavachari");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		ot.entertype1().click();
		ot.Entercomment().sendKeys("laavii");
		ot.Send().click();
		Thread.sleep(5000); 
		String acnt=driver.findElement(By.xpath("//*[@id=\"todayCount\"]")).getText();
		String nacnt=acnt.substring(0, 3);
		System.out.println(acnt);
		
		System.out.println(nacnt);
		if(ncnt.equals(nacnt))
		{	
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		
  }
	@Test
	public void kudosfrommmme() throws IOException, AWTException, InterruptedException  {
		driver=initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		Robot r=new Robot();
		homepage hd=new homepage(driver);
		otherreq ot=new otherreq(driver);
		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();
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
	
	//kudos to me
	
	@Test
	public void kudostoommme() throws IOException, AWTException, InterruptedException  {
		driver=initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		homepage hd=new homepage(driver);
		Robot r=new Robot();
		otherreq ot=new otherreq(driver);
		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");;
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();
		ot.clickkudostomee().click();
		String ktm=ot.kudostome().getText();
		System.out.println(ktm);
		Assert.assertEquals(ktm, "Aishwarya Matada");
		//Assert.assertTrue(ktm.contains("Aishwarya Matada received an appreciation"));
		if(ktm.contains("Aishwarya Matada received an appreciation"))
		{
			log2.info("Pass:the List of names displayed after clicking kudos to me button");
		}
		else
		{
			log2.error("Fail:the List of names did not displayed after clicking kudos to me button");
		}
		
	   
	}	
	@Test
	public void kudotomyself() throws IOException, AWTException, InterruptedException  {
		driver=initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		Robot r=new Robot();
		homepage hd=new homepage(driver);
		otherreq ot=new otherreq(driver);
		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();
		ot.sendkudos().click();
		ot.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		ot.entertype1().click();
		ot.Entercomment().sendKeys("laavii");
		ot.Send().click();
		Thread.sleep(5000); 
		ot.clickkudosfromme().click();
		Thread.sleep(5000); 
		String fname1=ot.firstn().getText();
		System.out.println(fname1);
		String lname1=ot.lastn().getText();
		System.out.println(lname1);
		Assert.assertEquals(fname1, lname1);
		if(fname1.equals(lname1))
		{
			File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Desktop\\Screenshots\\kudostoyourself.png"));
			System.out.println("match");
			log2.error("You cannot send kudos to yourself");		
		}
		else
			log2.info("You can send");				
	}
	
}
