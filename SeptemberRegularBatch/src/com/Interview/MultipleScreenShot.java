package com.Interview;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleScreenShot {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.saucedemo.com/");
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.findElement(By.id("user-name")).sendKeys("standard_user");
		   Actions act = new Actions(driver);
		   act.sendKeys(Keys.TAB).build().perform();
		   driver.findElement(By.id("password")).sendKeys("secret_sauce");
		   driver.findElement(By.id("login-button")).click();
		   getscreenshot();
	}

	private static void getscreenshot() {
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File("D:\\selenium\\swaglabregression"+System.currentTimeMillis()+".png"));
	}

}
