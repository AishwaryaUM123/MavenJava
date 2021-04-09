package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchingkudos {
	public WebDriver driver;
	By username=By.xpath("/html/body/div[2]/form/input[1]");
	By password=By.xpath("/html/body/div[2]/form/input[2]");
	By login=By.xpath("/html/body/div[2]/form/button");
	By search=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[5]/div/h5/a/span");
	By sea=By.xpath("//*[@id=\"s_e_add\"]");
	By searchbtn=By.xpath("//*[@id=\"search_panel\"]/button");
	By kudosfromme=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/h5/a/span");
	By kudostome=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[4]/div/h5/a/span");
	By kfme=By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5");
	By ktme=By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5");
	
	
	public searchingkudos(WebDriver driver) {
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
	public WebElement searchkudos()
	{
		return driver.findElement(search);
	}
	public WebElement searchentry()
	{
		return driver.findElement(sea);
	}
	public WebElement searchclick()
	{
		return driver.findElement(searchbtn);
	}
	public WebElement Clickkudosfromme() {
		
		return driver.findElement(kudosfromme);
	}
	public WebElement Clickkudostome() {
		return driver.findElement(kudostome);
	}
	public WebElement kfromme()
	{
		return driver.findElement(kfme);
	} 
	 
	public WebElement kudostome()
	{
		return driver.findElement(ktme);
	}
	

}
