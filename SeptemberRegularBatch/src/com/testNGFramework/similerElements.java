package com.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class similerElements {
	WebDriver driver;

		@Test
		public void a_DhanushBio() {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Dhanush");
		driver.manage().window().maximize();
		}
		@Test
		public void b_Actions() {
		 int LinkCounts = driver.findElements(By.tagName("a")).size();
		System.out.println(LinkCounts);
		 int images = driver.findElements(By.tagName("img")).size();
		 System.out.println(images);
		
	}

}
