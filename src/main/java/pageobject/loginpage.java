package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	public WebDriver driver;
	By username=By.xpath("/html/body/div[2]/form/input[1]");
	By password=By.xpath("/html/body/div[2]/form/input[2]");
	By login=By.xpath("/html/body/div[2]/form/button");
	By bgold=By.xpath("/html/body/div[1]");
	By bwhite=By.xpath("/html/body/div[2]");
	By bnavy=By.xpath("/html/body/div[2]/form/button");
	
	public loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement Clickusername()
	{
		return driver.findElement(username);
	}
	public WebElement Clickpassword()
	{
		return driver.findElement(password);
	}
	public WebElement Clicklogin()
	{
		return driver.findElement(login);
	}
	public WebElement gold()
	{
		return driver.findElement(bgold);
	}
	public WebElement white()
	{
		return driver.findElement(bwhite);
	}
	public WebElement navy()
	{
		return driver.findElement(bnavy);
	}

}
