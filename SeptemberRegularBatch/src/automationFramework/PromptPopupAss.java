package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptPopupAss {
	
	WebDriver driver;
		@Test
		public void a_OpenWebSite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}
		@Test
		public void b_PopUpinPrompt() {
		driver.findElement(By.xpath("//a[contains(text(),' with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]")).click();
		Alert alr = driver.switchTo().alert();
		String Popuptext = alr.getText();
		System.out.println(Popuptext);
		alr.sendKeys("mano");
		alr.accept();
		String FinalResult = driver.findElement(By.id("demo1")).getText();
		System.out.println(FinalResult);
	}

}
