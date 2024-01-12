package com.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifreams {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nunzioweb.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("oddcouple");
		String tittle = driver.findElement(By.xpath("//div[starts-with(text(),'A television show')]")).getText();
		System.out.println(tittle);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),' Pick')]")).click();
	}

}
