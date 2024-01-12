package com.testNGFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionRightClick {
	WebDriver driver;

		@Test
		public void  a_OpenWebSiteguru99() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		}
		@Test
		public void b_MouseActions() {
		driver.manage().window().maximize();
		WebElement RightClick = driver.findElement(By.xpath("//span[contains(text(),'right ')]"));
		Actions act = new Actions(driver);
		act.contextClick(RightClick).build().perform();
		}
		@Test
		public void c_PopUpHandled() {
		driver.findElement(By.xpath("//span[text()='Cut']")).click();
		Alert alr = driver.switchTo().alert();
		String PopupText = alr.getText();
		System.out.println(PopupText);
		alr.accept();
		
		
		}

}
