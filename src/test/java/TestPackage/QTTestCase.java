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

public class QTTestCase extends base {
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
		//valid data
		//kudos type1
		
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
		sk.entertype1().click();
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.Entercomment().sendKeys("hello");
		sk.Send().click();
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		
      /* //send kudos type2
		sk.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		sk.entertype2().click();
		sk.Entercomment().sendKeys("hey");
		sk.Send().click();
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		//send kudos type3
		sk.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		sk.entertype3().click();
		sk.Entercomment().sendKeys("hey");
		sk.Send().click();
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		
		//send kudos type4
			sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype4().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();
				
			driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				//send kudos type5
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype5().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();	
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				
				//send kudos type6
				
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype6().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();		
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				
				//send kudos type7
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype7().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				
				//send kudos type8
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype8().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();*/
		   //send kudos by entering email
				/*sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				sk.entertype7().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();
				try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
	
			//send kudos by entering email
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("Aishwarya U M");
				sk.entertype5().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();
				try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
			//send kudos by giving invalid name
				
				 //send kudos by entering invalid email
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.m@qualitestgroup.com");
				sk.entertype7().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();
				try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				//send kudos by entering invalid username
				 //send kudos by entering email
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya mtad");
				sk.entertype7().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();
				try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				
				//enter valid email  and leave the comment blank
				 //send kudos by entering email
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype7().click();
				sk.Entercomment().sendKeys("");
				sk.Send().click();
				try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");*/
				
				//kudos search
		
				
			
	}
	
}
