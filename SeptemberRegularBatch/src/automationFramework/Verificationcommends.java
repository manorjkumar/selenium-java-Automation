package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verificationcommends {
	WebDriver driver;

		@Test
		public void a_PageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		}
		@Test
		public void b_radiobutton() {
			WebElement Education = driver.findElement(By.id("radio-button-1"));
			Education.click();
			System.out.println(Education.isEnabled());
		}
		@Test
		public void c_checkbox() {
			WebElement gender =driver.findElement(By.id("checkbox-3"));
			gender.click();
			System.out.println(gender.isSelected());
		}
		@Test
		public void d_text() {
			System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Complete')]")).isDisplayed());
	}

}
