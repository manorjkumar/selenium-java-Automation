package automationFramework;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement DoubleClick = driver.findElement(By.xpath("//button[contains(text(),' See Alert')]"));
		Actions act = new Actions(driver);
		act.doubleClick(DoubleClick).build().perform();
		Thread.sleep(1000);
		Alert alr = driver.switchTo().alert();
		String PopupText = alr.getText();
		System.out.println(PopupText);
		alr.accept();
		int imagesize = driver.findElements(By.tagName("img")).size();
		System.out.println(imagesize);
		driver.findElement(By.xpath("//a[@id='signin2']/following::img[1]")).getCssValue("font-size");
		
		 
		
	}

}
