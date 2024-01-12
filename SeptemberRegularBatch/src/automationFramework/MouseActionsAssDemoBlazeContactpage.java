package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActionsAssDemoBlazeContactpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("recipient-email")).sendKeys("manoramu39@gmail.com");
		driver.findElement(By.id("recipient-name")).sendKeys("mano");
		driver.findElement(By.id("message-text")).sendKeys("hay..mano");;
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		Thread.sleep(2000);
		Alert alr = driver.switchTo().alert();
	    String Popuptext = alr.getText();
		System.out.println(Popuptext);
		Thread.sleep(2000);
		alr.accept();
	}

}
