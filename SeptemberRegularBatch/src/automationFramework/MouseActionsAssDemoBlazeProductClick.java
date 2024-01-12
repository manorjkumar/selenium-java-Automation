package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActionsAssDemoBlazeProductClick {
	WebDriver driver;

		@Test
		public void a_OpenWebSite() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		}
		@Test
		public void b_Selectproduct() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();
		Actions act = new Actions(driver);
		act.doubleClick().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		act.doubleClick().build().perform();
		Thread.sleep(2000);
		Alert alr1 = driver.switchTo().alert();
		String Popuptext = alr1.getText();
		System.out.println(Popuptext);
		Thread.sleep(2000);
		alr1.accept();
		}
		@Test
		public void c_GetProductDetail() {
		int imagesize = driver.findElements(By.tagName("img")).size();
		System.out.println(imagesize);
	    String CssValue = driver.findElement(By.xpath("//a[@id='signin2']/following::img[1]")).getCssValue("font-size");
		System.out.println(CssValue);
		String LoginPageURL = driver.getCurrentUrl();
		System.out.println(LoginPageURL);
		
	}

}
