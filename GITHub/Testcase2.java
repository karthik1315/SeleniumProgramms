package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Testcase2 {
	String browsername="Chrome";
	public static WebDriver driver;
@BeforeTest(groups= {"smoke","regression","sanity"})
//@Parameters({"browsername","appurl"})
public void initialize()
{
		if(browsername.equalsIgnoreCase("chrome")) {
	    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("Firefox")) 
		{
		    System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.get("appurl");
				driver.get("http://automationpractice.com//");
	}
	


	
public static void click(By value){
	driver.findElement(value).click();
}
public static void sendkeys(By value, String text) { 
	driver.findElement(value).sendKeys(text);
}
protected static void  dropdown(By value,String text)
{
	Select dropdown=new Select(driver.findElement(value));
	dropdown.selectByVisibleText(text);
}
@AfterTest(groups= {"smoke","regression","sanity"})
public void closeapp(){
	driver.close();
	
	
} 

}
