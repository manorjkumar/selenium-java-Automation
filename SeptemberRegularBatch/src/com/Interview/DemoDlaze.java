package com.Interview;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoDlaze {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'s6')]")).click();
		Thread.sleep(2000);
		String proName = driver.findElement(By.xpath("//h2[contains(text(),'s6')]")).getText();
		System.out.println(proName);
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Thread.sleep(2000);
		Alert alr = driver.switchTo().alert();
		String PopUPText = alr.getText();
		System.out.println(PopUPText);
		alr.accept();
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sign-username")).sendKeys("manoj");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.id("sign-password")).sendKeys("manoj");
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("//button[contains(text(),'Sign up')]"));
		 Actions key = new Actions(driver);
		 key.doubleClick().build().perform();
		driver.get("https://www.amazon.in/");
		 Thread.sleep(3000);
		 WebElement Select  = driver.findElement(By.id("twotabsearchtextbox"));
		// Actions act1 = new Actions(driver);
		// act1.sendKeys(Keys.ENTER).build().perform();		 
		Select.sendKeys("redmi");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Actions act1 = new Actions(driver);
		//act1.moveToElement(key1).build().perform();
		Thread.sleep(2000);
		 WebElement Option = driver.findElement(By.xpath("(//span[contains(text(),'Get It by Tomorrow')]/preceding::i[1])[1]"));
		 Option.click();
		 Thread.sleep(2000);
		 WebElement mobile = driver.findElement(By.xpath("//span[text()='Samsung']/preceding::i[1]"));
		 mobile.click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("low-price")).sendKeys("20000");
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.TAB).build().perform();	
		driver.findElement(By.id("high-price")).sendKeys("50000");
		Actions act2 = new Actions(driver);
		act2.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		WebElement go = driver.findElement(By.id("a-autoid-1-announce"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(go).build().perform();
		act3.doubleClick();
		System.out.println("--------------scripy okey!!!-----------------");
		
		
		
			
	}

}
