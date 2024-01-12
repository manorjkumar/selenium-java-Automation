package com.Interview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopus {
	WebDriver driver;
		@Test
	    public void a_Pageopen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    }
		@Test
		public void b_AlertPopUp() {
		driver.findElement(By.xpath("//button[contains(text(),' alert box')]")).click();
		Alert alr = driver.switchTo().alert();
		String Popuptext = alr.getText();
		System.out.println(Popuptext);
		alr.accept();
		System.out.println("------------------------Alert Popus Handled-----------------------");
		}
		@Test
		public void c_ConfirmPopUp() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'& Cancel ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click();
		Alert alr1 = driver.switchTo().alert();
		String Popmsg = alr1.getText();
		System.out.println(Popmsg);
		alr1.dismiss();
		String conpopupms= driver.findElement(By.xpath("//p[contains(text(),' Cancel')]")).getText();
		System.out.println(conpopupms);
		System.out.println("-------------------------Confirm PopUp Handled------------------------");
		}
		@Test
		public void d_PromptPopUp() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate the')]")).click();
		Alert alr2 =driver.switchTo().alert();
		String Promptmsg = alr2.getText();
		System.out.println("Promptmsg");
		Thread.sleep(2000);
		alr2.sendKeys("hii mano!!!");
		alr2.dismiss();
		System.out.println("------------------------Prompt PopUps Handled---------------------------");
		}
		@Test
		public void e_GetPageDetails() {
		String CurrURL = driver.getCurrentUrl();
		System.out.println(CurrURL);
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
		
		
	}

}
