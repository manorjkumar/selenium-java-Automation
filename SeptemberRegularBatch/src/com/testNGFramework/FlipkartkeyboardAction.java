package com.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartkeyboardAction {
	WebDriver driver;

		@Test
		public void a_flipkart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
		@Test
		public void b_ProductSelection() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		driver.findElement(By.name("q")).sendKeys("redmi mobile");
		driver.findElement(By.xpath("//span[contains(text(),'Seller')]/preceding::button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Dark Night')]")).click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
	}

}
