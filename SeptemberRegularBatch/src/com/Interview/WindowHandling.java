package com.Interview;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/drive/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Try Drive for work')])[3]")).click();
		ArrayList <String> GmailTabs = new ArrayList(driver.getWindowHandles());
		for(String output:GmailTabs) {
			System.out.println(output);
		}
		driver.switchTo().window(GmailTabs.get(1));
		Thread.sleep(2000);
		String SecondTabUrl = driver.getCurrentUrl();
		System.out.println(SecondTabUrl);
		//ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
		//System.out.println(driver.getCurrentUrl());
		//driver.switchTo().window(tab.get(1));
		//System.out.println(driver.getCurrentUrl());
		
	}

}
