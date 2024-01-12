package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interview {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\\\\\selenium\\\\\\\\software\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(3000);
		
	}

}
