package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckClass {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.demoblaze.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.findElement(By.id("login2")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("loginusername")).sendKeys("manojkumar");
			Thread.sleep(4000);
			Actions act = new Actions(driver);
			act.sendKeys(Keys.TAB,"manojkumarramumanojkumar").build().perform();
			//driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}

}
