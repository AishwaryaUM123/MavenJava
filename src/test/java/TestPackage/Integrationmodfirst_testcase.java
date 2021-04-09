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
public class Integrationmodfirst_testcase  extends base {
	@Test
	public void basePageNavigation2() throws IOException, AWTException  {
		driver=initializeDriver();

		driver.get("https://qtrecognition.testqtwiz.com/");
		Robot r=new Robot();
		intmodulefirst in=new intmodulefirst(driver);
		homepage hd=new homepage(driver);
		hd.Clickusername().sendKeys("aishwarya.matada@qualitestgroup.com");
		hd.Clickpassword().sendKeys("P@ssw0rd");
		hd.Clicklogin().click();
		in.sendkudos().click();
		//try {Thread.sleep(5000);}catch(Exception E) {E.printStackTrace();}
		in.enteremail().sendKeys("Krishna ");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		in.entertype7().click();
		in.Entercomment().sendKeys("Thanks for giving me a quick solution.");
		in.Send().click();
		driver.close();
}
}
