package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.homepage;
import pageobject.intmodulefirst;
import pageobject.sendingkudos;
import resources.base;

import pageobject.intmodulefirst;

public class Integrationmod3testcase extends base{
	@Test
	public void kudostorecent() throws IOException, AWTException, InterruptedException  {
		driver=initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		intmodulefirst in=new intmodulefirst(driver);
		homepage hd=new homepage(driver);
		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();
		in.recentcon1().click();
		Thread.sleep(5000);
		in.entertype1().click();
		in.Entercomment().sendKeys("Thanks");
		in.Send().click();
		driver.close();
		
}
}
