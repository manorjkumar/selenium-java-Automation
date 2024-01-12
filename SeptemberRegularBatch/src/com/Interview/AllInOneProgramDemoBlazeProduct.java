package com.Interview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AllInOneProgramDemoBlazeProduct {
	WebDriver driver;

	public void a_OpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
		@Test
		public void b_enterdetails() throws InterruptedException {
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("loginusername")).sendKeys("manojkumar");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB,"password").build().perform();
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(3000);
		}
		@Test
		public void c_printmethod() throws InterruptedException {
		Alert alr = driver.switchTo().alert();
		String Popuptext = alr.getText();
		System.out.println(Popuptext);
		Thread.sleep(4000);
		alr.accept();
		System.out.println("------------------------------------------------------------------------------------------------");
		//Above code's for login page
		}
		@Test
		public void d_userdetails() throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("recipient-email")).sendKeys("manoramu39@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("mano");
		driver.findElement(By.id("message-text")).sendKeys("hay..mano");;
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		Thread.sleep(3000);
		Alert alr1 = driver.switchTo().alert();
	    String Popuptext1 = alr1.getText();
		System.out.println(Popuptext1);
		Thread.sleep(2000);
		alr1.accept();
		System.out.println("---------------------------------------------------------------------------------------------------");
		//Above code's for Contact Page
		}
		@Test
		public void e_Okproduct() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
		Actions act1 = new Actions(driver);
		act1.doubleClick().build().perform();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		act1.doubleClick().build().perform();
		Thread.sleep(3000);
		Alert alr11 = driver.switchTo().alert();
		String Popuptext11 = alr11.getText();
		System.out.println(Popuptext11);
		Thread.sleep(3000);
		alr11.accept();
		}
		@Test
		public void f_finalmethod() {
		int imagesize = driver.findElements(By.tagName("img")).size();
		System.out.println(imagesize);
	    String CssValue = driver.findElement(By.xpath("//a[@id='signin2']/following::img[1]")).getCssValue("font-size");
		System.out.println(CssValue);
		String LoginPageURL = driver.getCurrentUrl();
		System.out.println(LoginPageURL);
		System.out.println("SCRIPT ECECUTED SUCESSFULY");
		driver.close();
	}

}
