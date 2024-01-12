package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravels {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.name("first_name")).sendKeys("jonam");
		driver.findElement(By.xpath("//input[@name='first_name']/following::input[1]")).sendKeys("ramuk");
		driver.findElement(By.xpath("//input[@name='first_name']/following::input[2]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@name='first_name']/following-sibling::input[3]")).sendKeys("abc@gmail.com");
		WebElement captchaBox = driver.findElement(By.xpath("//button[@id='demo']/preceding::div[2][1]"));
		captchaBox.click();
		System.out.println(captchaBox.isDisplayed());
		Thread.sleep(12000);
		driver.findElement(By.id("demo")).click();
		Thread.sleep(5000);
		driver.getTitle();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		Thread.sleep(2000);
		ArrayList<String> tabs =  new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getCurrentUrl());
		
	
	}

}
