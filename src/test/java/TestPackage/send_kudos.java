package TestPackage;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.homepage;
import pageobject.sendingkudos;
import resources.base;

public class send_kudos extends base{
	@Test
	public void basePageNavigation2() throws IOException, AWTException  {
		driver=initializeDriver();

		driver.get("https://qtrecognition.testqtwiz.com/");
		Robot r=new Robot();
		sendingkudos sk=new sendingkudos(driver);
		sk.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		sk.Clickpassword().sendKeys("P@ssw0rd");
		sk.Clicklogin().click();

		sk.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		sk.entertype1().click();
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.Entercomment().sendKeys("hello");
		sk.Send().click();
		try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		
      //send kudos type2
		sk.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		sk.entertype2().click();
		sk.Entercomment().sendKeys("hjhdfhdhg");
		sk.Send().click();
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		//send kudos type3
		sk.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		sk.enteremail().sendKeys("Shreedevi Patil ");
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		sk.entertype3().click();
		sk.Entercomment().sendKeys("good");
		sk.Send().click();
		driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
		
		//send kudos type4
			sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("Lavanya Channabasavachari");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype4().click();
				sk.Entercomment().sendKeys("well");
				sk.Send().click();
				
				
			driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				//send kudos type5
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("lavanya.channabasavachari@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype5().click();
				sk.Entercomment().sendKeys("better");
				sk.Send().click();	
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				
				//send kudos type6
				
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("shreedevi.patil@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype6().click();
				sk.Entercomment().sendKeys("very good");
				sk.Send().click();		
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				
				//send kudos type7
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype7().click();
				sk.Entercomment().sendKeys("hello");
				sk.Send().click();
				driver.navigate().to("https://qtrecognition.testqtwiz.com/Activity.php");
				
				//send kudos type8
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype8().click();
				sk.Entercomment().sendKeys("great");
				sk.Send().click();
				driver.close();
		   //send kudos by entering email
	}				
				@Test
				public void enteringvalidmail() throws IOException, AWTException  {
					driver=initializeDriver();

				driver.get("https://qtrecognition.testqtwiz.com/");
				Robot r=new Robot();
				sendingkudos sk=new sendingkudos(driver);
				sk.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
				sk.Clickpassword().sendKeys("P@ssw0rd");
				sk.Clicklogin().click();
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				sk.entertype7().click();
				sk.Entercomment().sendKeys("mgr");
				sk.Send().click();
				driver.close();	
	}
			//send kudos by entering valid name		
				@Test
				public void validname() throws IOException, AWTException  {
					driver=initializeDriver();

				driver.get("https://qtrecognition.testqtwiz.com/");
				Robot r=new Robot();
				sendingkudos sk=new sendingkudos(driver);
				sk.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
				sk.Clickpassword().sendKeys("P@ssw0rd");
				sk.Clicklogin().click();
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("Aishwarya U M");
				sk.entertype5().click();
				sk.Entercomment().sendKeys("hey");
				sk.Send().click();
				driver.close();
			//send kudos by giving invalid name
	}		
				 //send kudos by entering invalid email
				@Test
				public void kudostoinvalidemail() throws IOException, AWTException  {
					driver=initializeDriver();

					driver.get("https://qtrecognition.testqtwiz.com/");
					Robot r=new Robot();
					sendingkudos sk=new sendingkudos(driver);
					sk.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
					sk.Clickpassword().sendKeys("P@ssw0rd");
					sk.Clicklogin().click();

					sk.sendkudos().click();
				sk.sendkudos().click();
				//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				sk.enteremail().sendKeys("aishwarya.m@qualitestgroup.com");
				sk.entertype7().click();
				sk.Entercomment().sendKeys("kkgf");
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
				sk.Entercomment().sendKeys("gffddf");
				sk.Send().click();
				try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
				if(sk.confirm().equalsIgnoreCase("email sent successfully"))
					System.out.println("successs");
				driver.close();
	             }	
				

				@Test
				public void selectmultiplekudos() throws IOException, AWTException  {
					driver=initializeDriver();

				driver.get("https://qtrecognition.testqtwiz.com/");
				Robot r=new Robot();
				sendingkudos sk=new sendingkudos(driver);
				sk.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");				
				sk.Clickpassword().sendKeys("P@ssw0rd");
				sk.Clicklogin().click();
				sk.sendkudos().click();
				sk.enteremail().sendKeys("aishwarya.matada@qualitestgroup.com");
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyPress(KeyEvent.VK_ENTER);
				sk.entertype1().click();
				sk.entertype2().click();
				sk.entertype3().click();
				sk.entertype4().click();
				sk.entertype5().click();
				sk.entertype6().click();
				sk.entertype7().click();
				sk.entertype8().click();
				sk.Entercomment().sendKeys("gffddf");
				sk.Send().click();
				File rc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(rc, new File("C:\\Users\\Qualitest\\Desktop\\Screenshots\\multiplektype.png"));
				driver.close();
				/*try {Thread.sleep(10000);}catch(Exception E) {E.printStackTrace();}
				if(sk.confirm().equalsIgnoreCase("email sent successfully"))
					System.out.println("successs");	
					*/
				}
	
}

