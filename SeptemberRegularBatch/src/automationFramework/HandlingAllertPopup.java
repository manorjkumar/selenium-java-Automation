package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAllertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.id("alertButton")).click();
		Alert alr = driver.switchTo().alert();
		String Popuptext = alr.getText();
		System.out.println(Popuptext);
		Thread.sleep(2000);
		alr.accept();
		
		
	}

}
