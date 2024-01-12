package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class yourstore {
	WebDriver driver;

	    @Test
	    public void a_OpenSite() {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
	    }
	    @Test
	    public void b_UserInfo() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("manoj");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("manoramu39@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("telephone")).sendKeys("9943310173");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("636813");
		Thread.sleep(3000);
		driver.findElement(By.name("confirm")).sendKeys("636813");
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.name("newsletter"));
		radio.click();
		Thread.sleep(3000);
		WebElement box = driver.findElement(By.name("agree"));
		box.click();
		driver.findElement(By.xpath("//b[contains(text(),'Privacy Policy')]/following::input[2]")).click();
		
		
		
		
		
	}

}
