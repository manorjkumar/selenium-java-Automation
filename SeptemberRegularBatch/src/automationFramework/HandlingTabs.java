package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/drive/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Drive')])[3]")).click();
		Thread.sleep(2000);
		ArrayList <String> GmailTabs = new ArrayList(driver.getWindowHandles());
		for(String output:GmailTabs) {
			System.out.println(output);
		}
		driver.switchTo().window(GmailTabs.get(1));
		String SecondTabUrl = driver.getCurrentUrl();
		System.out.println(SecondTabUrl);
		}

}
