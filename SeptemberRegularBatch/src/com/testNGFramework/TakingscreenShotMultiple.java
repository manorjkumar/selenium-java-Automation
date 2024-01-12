package com.testNGFramework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingscreenShotMultiple {

	private static final int OutputType = 0;
	private static final int FILE = 0;
	private static final int X = 0;
	public static WebDriver driver;

	@Test
	public void a_OpenWebSite() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(10000);
	getscreenshot();
	}

	private void getscreenshot() {
		// TODO Auto-generated method stub
		
		
		
	}

}
