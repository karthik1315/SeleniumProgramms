package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tshirts extends Testcase1{
	@BeforeClass(groups= {"smoke","regression","sanity"})
	public void clickontshirtstab() {
		Actions actions=new Actions(driver);
		//actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
	}
	
	@Test(priority=6,groups="regression")
	public void clickonfadedtshirt() throws InterruptedException {
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")).click();
		driver.navigate().back();
	
	}

}
