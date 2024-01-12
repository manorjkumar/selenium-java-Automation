package com.testNGFramework;

import java.awt.peer.SystemTrayPeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetMethods {
	WebDriver driver;

		@Test
		public void a_OpenZeroApp() {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		}
		@Test
		public void b_GetTitle() {
		//System.out.println(driver.getTitle());
		String pageTitle =driver.getTitle();
		System.out.println(pageTitle);
		driver.findElement(By.id("signin_button")).click();
		String LoginPageURL = driver.getCurrentUrl();
		System.out.println(LoginPageURL);
		String LoginpageHeader = driver.findElement(By.xpath("//h3[contains(text(),'Log ')]")).getText();
		System.out.println(LoginpageHeader);
		String forgetpage = driver.findElement(By.xpath("//a[contains(text(),'Forgot ')]")).getText();
		System.out.println(forgetpage);
		 String signInbuttonTagname = driver.findElement(By.name("submit")).getTagName();
		 System.out.println(signInbuttonTagname);
		String Attributevalue =  driver.findElement(By.name("submit")).getAttribute("type");
		System.out.println(Attributevalue);
		String Cssvalue = driver.findElement(By.name("submit")).getCssValue("font-size");
		System.out.println(Cssvalue);
		}
		
		
		
	
	}


