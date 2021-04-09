package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class activitypage {
	
	public WebDriver driver;
	By username=By.xpath("/html/body/div[2]/form/input[1]");
	By password=By.xpath("/html/body/div[2]/form/input[2]");
	By login=By.xpath("/html/body/div[2]/form/button");
	By kudosfromme=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/h5/a/span");
	By kudostome=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[4]/div/h5/a/span");
	

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
	

	public activitypage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement Clickkudosfromme() {
		// TODO Auto-generated method stub
		return driver.findElement(kudosfromme);
	}
	public WebElement Clickkudostome() {
		// TODO Auto-generated method stub
		return driver.findElement(kudostome);
	}


}
