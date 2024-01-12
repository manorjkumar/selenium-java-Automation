package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.findElement(By.id("first-name")).sendKeys("manoj");
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("job-title")).sendKeys("automation");
		//driver.findElement(By.id("radio-button-2")).click();
		WebElement CollegeRadioButton=driver.findElement(By.id("radio-button-2"));
		CollegeRadioButton.click();
		//driver.findElement(By.id("checkbox-3")).click();
		WebElement gender = driver.findElement(By.id("checkbox-3"));
		gender.click();
		WebElement drop = driver.findElement(By.id("select-menu"));
		drop.sendKeys("0-1");
		//Select experience = new Select(driver.findElement(By.id("select-menu")));
		//experience.selectByVisibleText("0-1");
		driver.findElement(By.id("datepicker")).sendKeys("07/02/1999");
		driver.findElement(By.xpath("//a[text()='Submit']")).click();	
		
		
		
		
		
				
		
		
				
				}

}
