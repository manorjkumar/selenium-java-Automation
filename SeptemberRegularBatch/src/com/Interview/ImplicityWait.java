package com.Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicityWait {

	public static void main(String[] args) {
	             System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
	             WebDriver driver = new ChromeDriver();
	             driver.get("https://www.amazon.in/");
	             driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	             driver.manage().window().maximize();
	             System.out.println("-------script okey!!!-------");
	             driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi");
	            
	             
	             
	}

}
