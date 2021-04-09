package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sendingkudos {

	public WebDriver driver;
	By username=By.xpath("/html/body/div[2]/form/input[1]");
	By password=By.xpath("/html/body/div[2]/form/input[2]");
	By login=By.xpath("/html/body/div[2]/form/button");
	By sendk1=By.xpath("//*[@id=\"trophy_list\"]/div[1]/div/div");
	By sendk2=By.xpath("//*[@id=\"trophy_list\"]/div[2]/div/div");
	By sendk3=By.xpath("//*[@id=\"trophy_list\"]/div[3]/div/div");
	By sendk4=By.xpath("//*[@id=\"trophy_list\"]/div[4]/div/div");
	By sendk5=By.xpath("//*[@id=\"trophy_list\"]/div[5]/div/div");
	By sendk6=By.xpath("//*[@id=\"trophy_list\"]/div[6]/div/div");
	By sendk7=By.xpath("//*[@id=\"trophy_list\"]/div[7]/div/div");
	By sendk8=By.xpath("//*[@id=\"trophy_list\"]/div[8]/div/div");
	By email=By.xpath("//*[@id=\"email_address\"]");
	By comm=By.xpath("//*[@id=\"comment\"]");
	By send=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/a");
	By sendbutton=By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
	By conf=By.xpath("/html/body");
	
	
	public sendingkudos(WebDriver driver) {
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
	public WebElement sendkudos()
	{
		return driver.findElement(send);
	}
	
	public WebElement entertype1()
	{
		return driver.findElement(sendk1);
	}
	public WebElement entertype2()
	{
		return driver.findElement(sendk2);
	}
	public WebElement entertype3()
	{
		return driver.findElement(sendk3);
	}
	public WebElement entertype4()
	{
		return driver.findElement(sendk4);
	}
	public WebElement entertype5()
	{
		return driver.findElement(sendk5);
	}
	public WebElement entertype6()
	{
		return driver.findElement(sendk6);
	}
	public WebElement entertype7()
	{
		return driver.findElement(sendk7);
	}
	public WebElement entertype8()
	{
		return driver.findElement(sendk8);
	}
	
	public WebElement enteremail()
	{
		return driver.findElement(email);
	}
	
	public WebElement Entercomment()
	{
		return driver.findElement(comm);
	}
	public WebElement Send()
	{
		return driver.findElement(sendbutton);
	}
	public String confirm()
	{
		return driver.findElement(conf).getText();
	}
	
	
	
	
}
