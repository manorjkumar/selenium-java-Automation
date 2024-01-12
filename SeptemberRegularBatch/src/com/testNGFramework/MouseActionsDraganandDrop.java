package com.testNGFramework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsDraganandDrop {
	WebDriver driver;

		@Test
		public void a_openapplication() {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		}
		@Test
		public void b_drag_drop() throws InterruptedException, IOExcaption {
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement Element1 = driver.findElement(By.id("draggable"));
		WebElement Element2 = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(Element1, Element2).build().perform(	
		getscreenshoy();
		}
		private void getscreenshoy() throws IOExcaption{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\selenium\swaglabregression"+System.currentTimeMillis()+".png"));
		
		
		}

}
