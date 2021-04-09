package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class otherreq {
	public WebDriver driver;
	By username=By.xpath("/html/body/div[2]/form/input[1]");
	By password=By.xpath("/html/body/div[2]/form/input[2]");
	By login=By.xpath("/html/body/div[2]/form/button");
	//By count=By.xpath("//*[@id=\"todayCount\"]");
	//String displayedCount = driver.findElement(By.xpath("//*[@id=\"todayCount\"]")).getText();
	//String displayedCountAfter = driver.findElement(By.xpath("//*[@id=\"todayCount\"]")).getText();
	By con=By.xpath("//*[@id=\"email_address\"]");  
	By email=By.xpath("//*[@id=\"email_address\"]");
	By sendk1=By.xpath("//*[@id=\"trophy_list\"]/div[1]/div/div");
	By comm=By.xpath("//*[@id=\"comment\"]");
	By send=By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/a");
	By sendbutton=By.xpath("//*[@id=\"myModal\"]/div/div/div/button[2]");
	By active=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div/h5/a/span");
	By kfme=By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5");
	By clickkfromme=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[3]/div/h5/a/span");
	By clickktome=By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[4]/div/h5/a/span");
	By ktme=By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5");
	By myself=By.xpath("//*[@id=\"email_address\"]");
	By fi=By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5/b[1]");
	By la=By.xpath("//*[@id=\"shoutout_to_me\"]/div[1]/div/h5/b[2]");
	public otherreq(WebDriver driver) {
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
	/*public String checkcount()
	{
		return displayedCount;
	}*/
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
	
	public WebElement Entercomment()
	{
		return driver.findElement(comm);
	}
	public WebElement Send()
	{
		return driver.findElement(sendbutton);
	}
	
	public WebElement clickkudosfromme()
	{
		return driver.findElement(clickkfromme);
	}
	
	public WebElement kfromme()
	{
		return driver.findElement(kfme);
	} 
	public WebElement clickkudostomee()
	{
		return driver.findElement(clickktome);
	} 
	public WebElement kudostome()
	{
		return driver.findElement(ktme);
	}
	public WebElement ktomyself()
	{
		return driver.findElement(myself);
	}
	public WebElement firstn()
	{
		return driver.findElement(fi);
	}
	public WebElement lastn()
	{
		return driver.findElement(la);
	}
		

}
