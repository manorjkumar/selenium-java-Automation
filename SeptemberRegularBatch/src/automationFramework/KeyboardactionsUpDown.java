package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardactionsUpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[contains(text(),'Number')]/following::input")).sendKeys("5");
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_UP).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
	}

}
