package com.testNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiPleScreenShot {
	public static WebDriver driver;
	
	@Test
	public void a_screenshot() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		getscreenshot();
	}

	private void getscreenshot()throws IOException {
	File scrFile = ((TakeScrennshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile,new File("D:\\selenium\\swaglabregression"+ System.currentTimeMillis()+".png"));

	}
	
	

}
