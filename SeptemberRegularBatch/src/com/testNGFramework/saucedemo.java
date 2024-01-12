package com.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class saucedemo {
	WebDriver driver;

		@Test
		public void a_seucedemo() {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		}
		@Test
		public void b_loginpage() throws InterruptedException{
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		}
		}
	


