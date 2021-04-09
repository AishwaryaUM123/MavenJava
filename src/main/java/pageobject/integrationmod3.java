package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class integrationmod3 {
	public WebDriver driver;
	By recent1=By.xpath("//*[@id=\"contact_list\"]/div[1]/div/h5/small/a/i");
	By recent2=By.xpath("//*[@id=\"contact_list\"]/div[2]/div/h5/small/a/i");
	By recent3=By.xpath("//*[@id=\"contact_list\"]/div[3]/div/h5/small/a");
	public WebElement recentcon1()
	{
		return driver.findElement(recent1);
	}
	public WebElement recentcon2()
	{
		return driver.findElement(recent2);
	}
	public WebElement recentcon3()
	{
		return driver.findElement(recent3);
	}

}
