package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class intmodulefirst  {
	public WebDriver driver;
	By send=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/a");
	By sendk1=By.xpath("//*[@id=\"trophy_list\"]/div[1]/div/div");
	By sendk2=By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div");
	By comm=By.xpath("//*[@id=\"comment\"]");	
	By email=By.xpath("//*[@id=\"email_address\"]");
	By sendk7=By.xpath("//*[@id=\"trophy_list\"]/div[7]/div/div");
	By sendbutton=By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
	By recent1=By.xpath("//*[@id=\"contact_list\"]/div[1]/div/h5/small/a/i");
	By recent2=By.xpath("//*[@id=\"contact_list\"]/div[2]/div/h5/small/a/i");
	By recent3=By.xpath("//*[@id=\"contact_list\"]/div[3]/div/h5/small/a");
	
	public intmodulefirst(WebDriver driver) {
	     this.driver=driver;
	}
	
	public WebElement sendkudos()
	{
		return driver.findElement(send);
	}
	public WebElement enteremail()
	{
		return driver.findElement(email);
	}
	public WebElement entertype1()
	{
		return driver.findElement(sendk1);
	}
	public WebElement entertype2()
	{
		return driver.findElement(sendk2);
	}
	public WebElement entertype7()
	{
		return driver.findElement(sendk7);
	}
	public WebElement Entercomment()
	{
		return driver.findElement(comm);
	}
	public WebElement Send()
	{
		return driver.findElement(sendbutton);
	}
	
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
