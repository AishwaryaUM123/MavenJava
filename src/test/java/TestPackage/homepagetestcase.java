package TestPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import pageobject.homepage;
import resources.base;

public class homepagetestcase extends base {
		@Test(dataProvider="getData")
		public void basePageNavigation1(String username,String password) throws IOException, InterruptedException  {
			driver=initializeDriver();
			driver.get("https://qtrecognition.testqtwiz.com/");
			homepage hd=new homepage(driver);

			hd.Clickusername().sendKeys(username);
			hd.Clickpassword().sendKeys(password);
			hd.Clicklogin().click();
		   // driver.close();
			Assert.assertEquals(driver.getCurrentUrl(),"https://qtrecognition.testqtwiz.com/Activity.php");
			log2.info("valid credentials");		
		}
		
	@DataProvider
	public Object[][] getData() throws Exception{
		Object[][] data=new Object[6][2];
		//valid email and invalid password
		data[0][0]="aishwarya.matada@qualitestgroup.com";
		data[0][1]="aishuuu";
		
		//Invalid email valid password
		data[1][0]="aishwarya.mata@qualitestgroup.com";
		data[1][1]="aishuu12";
		
		//blank email 
		data[2][0]=" ";
		data[2][1]="aishuu12";
		
		//Blank password
		data[2][0]="aishwarya.matadata@qualitestgroup.com";
		data[2][1]="";
		
		//Invalid mail invalid password
		data[3][0]="aishwarya.mata@qualitestgroup.com";
		data[3][1]="aishuu12";
		
		//valid mail valid password
		data[4][0]="aishwarya.matada@qualitestgroup.com";
		data[4][1]="P@ssw0rd";
		
		//valid mail valid password
		data[5][0]="aishwarya.matada@qualitestgroup.com";
		data[5][1]="p@ssw0rd";
				
		return data;
	}
		
}
