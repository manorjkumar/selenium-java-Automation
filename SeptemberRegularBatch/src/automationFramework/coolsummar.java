package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class coolsummar {
	WebDriver driver;

		@Test
		public void a_OpenWebSite() {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours");
		driver.manage().window().maximize();
		}
		@Test
		public void b_UserInfo() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.name("firstName")).sendKeys("mano");
		Thread.sleep(3000);
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		driver.findElement(By.name("phone")).sendKeys("9943310173");
		driver.findElement(By.name("userName")).sendKeys("manoramu39@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("velachery");
		driver.findElement(By.name("city")).sendKeys("TAMBARAM");
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		driver.findElement(By.name("postalCode")).sendKeys("636813");
		Thread.sleep(4000);
		//WebElement scroll = driver.findElement(By.xpath("//option[contains(text(),'INDIA')]"));
		//scroll.click();
		//WebElement country = driver.findElement(By.xpath("(//option[contains(text(),'INDIA')])[2]"));
		//country.click();
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("ALGERIA");
		driver.findElement(By.name("email")).sendKeys("manoramu36");
		driver.findElement(By.name("password")).sendKeys("636813");
		driver.findElement(By.name("confirmPassword")).sendKeys("636813");
		driver.findElement(By.name("submit")).click();
		
	}

}
