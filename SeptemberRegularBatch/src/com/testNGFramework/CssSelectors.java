package com.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
	WebDriver driver;

	   @Test
	   public void a_PageLoad() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.manage().window().maximize();
	   }
		@Test
		public void b_locator() {
			//driver.findElement(By.id("signin_button")).click();
			driver.findElement(By.cssSelector(".signin btn btn-info")).click();
			//driver.findElement(By.id("user_login")).sendKeys("username");
			driver.findElement(By.cssSelector("user_login")).sendKeys("username");
			//driver.findElement(By.id("user_password")).sendKeys("password");
			driver.findElement(By.cssSelector("#user_password")).sendKeys("password");
			//driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
			//driver.findElement(By.linkText("Forgot your password ?")).click();
			driver.findElement(By.partialLinkText("Forgot")).click();
		}
		
	}


