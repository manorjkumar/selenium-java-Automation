package automationFramework;

import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowsHamdlingAss {
	WebDriver driver;

	   @Test
	   public void a_OpenWebSite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	   }
	   @Test
	   public void b_ProductSearch() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Forgot?']/preceding::button[1]")).click();
		driver.findElement(By.name("q")).sendKeys("redmi mobile");
		 driver.findElement(By.xpath("//span[contains(text(),'Seller')]/preceding::button[1]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Carbon Black')]")).click();
	   }
	   @Test
	   public void c_HandleWindow() {
		ArrayList <String> Flipkarttab  =new ArrayList(driver.getWindowHandles());
		for(String output:Flipkarttab) {
			System.out.println(output);
		}
		driver.switchTo().window(Flipkarttab.get(1));
		String SecoundTabUrl = driver.getCurrentUrl();
		System.out.println(SecoundTabUrl);
		}
		
				
		
	}

	    


 
