package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmPopupAss {
	WebDriver driver;

		@Test
		public void a_OpenWebSite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		}
		@Test
		public void b_getURL() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]")).click();
		Thread.sleep(2000);
		Alert alr = driver.switchTo().alert();
		String Popuptext = alr.getText();
		System.out.println(Popuptext);
		Thread.sleep(2000);
		alr.dismiss();
		String FinalResult = driver.findElement(By.id("demo")).getText();
		System.out.println(FinalResult);
	}

}
