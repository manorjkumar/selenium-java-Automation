package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroWebAppSecurity {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/index.html");
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.name("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='submit']")).click();	}

}
