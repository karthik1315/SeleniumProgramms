package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class women extends Testcase1 {
	
	@BeforeClass(groups= {"smoke","regression","sanity"})
	public void clickonwomentab() {
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"))).build().perform();
	}
		
		@Test(priority=1,groups="regression")
	public void clickontshirts() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
		driver.navigate().back();
	
	}
	
	@Test(priority=2,groups="sanity")
	public void clickoneveningdresses() throws InterruptedException {
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"))).build().perform();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]/a")).click();
		driver.navigate().back();
	
	}
	
}
