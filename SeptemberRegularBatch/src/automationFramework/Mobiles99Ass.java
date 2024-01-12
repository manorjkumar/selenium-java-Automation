package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mobiles99Ass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.91mobiles.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("autoSuggestTxtBox")).sendKeys("mobiles");
		Thread.sleep(3000);
		WebElement ser = driver.findElement(By.id("main_auto_search"));
		Actions act = new Actions(driver);
		act.click(ser).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'Apple iPhone 14')])[1]")).click();
		WebElement select = driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]"));
		Actions act2= new Actions(driver);
		act2.moveToElement(select).build().perform();
		Thread.sleep(3000);
		
		
		
	}

}