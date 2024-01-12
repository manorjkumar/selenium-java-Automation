package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class petstoreoctoper {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("12345");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("repeatedPassword")).sendKeys("password");
		driver.findElement(By.name("account.firstName")).sendKeys("manoj");
		driver.findElement(By.name("account.lastName")).sendKeys("kumar");
		driver.findElement(By.name("account.email")).sendKeys("manoramu39@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("8610520937");
		driver.findElement(By.name("account.address1")).sendKeys("velacherry");
		driver.findElement(By.name("account.address2")).sendKeys("tambaram");
		driver.findElement(By.name("account.city")).sendKeys("chennai");
		driver.findElement(By.name("account.state")).sendKeys("tamilnadu");
		driver.findElement(By.name("account.zip")).sendKeys("636813");
		driver.findElement(By.name("account.country")).sendKeys("india");
		Select language = new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("english");
		Select product = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		product.selectByVisibleText("DOGS");
		WebElement MyListRadioButton= driver.findElement(By.name("account.listOption"));
		MyListRadioButton.click();
		WebElement MyListBanner= driver.findElement(By.name("account.bannerOption"));
		MyListBanner.click();
		
		
		
		
		
		
		
		

	}

}
