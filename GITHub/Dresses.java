package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dresses extends Testcase2 {
	@BeforeClass(groups= {"smoke","regression","sanity"})
	public void clickondressestab() {
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
	}
	
	@Test(priority=3,groups="regression")
	public void clickonsummerdresses() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
		driver.navigate().back();
	
	}
	
	@Test(priority=4,groups="sanity")
	public void clickoneveningdresses() throws InterruptedException {
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.navigate().back();
	
	}
	@Test(priority=5,groups="smoke")
	public void clickoncasualdresses() throws InterruptedException {
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")).click();
		driver.navigate().back();
	
	}
}
