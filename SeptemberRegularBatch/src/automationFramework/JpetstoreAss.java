package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JpetstoreAss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("mano30");
		driver.findElement(By.name("password")).sendKeys("manoramu@39");
		driver.findElement(By.name("repeatedPassword")).sendKeys("manoramu@39");
		Thread.sleep(1000);
		driver.findElement(By.name("account.firstName")).sendKeys("manoj");
		Thread.sleep(1000);
		driver.findElement(By.name("account.lastName")).sendKeys("kumar");
		Thread.sleep(1000);
		driver.findElement(By.name("account.email")).sendKeys("manoramu39@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("account.phone")).sendKeys("8525028583");
		Thread.sleep(1000);
		driver.findElement(By.name("account.address1")).sendKeys("dharmapurri");
		Thread.sleep(1000);
		driver.findElement(By.name("account.address2")).sendKeys("chennai");
		Thread.sleep(1000);
		driver.findElement(By.name("account.city")).sendKeys("tambaram");
		Thread.sleep(1000);
		driver.findElement(By.name("account.state")).sendKeys("Tamilnadu");
		Thread.sleep(1000);
		driver.findElement(By.name("account.zip")).sendKeys("636813");
		Thread.sleep(1000);
		driver.findElement(By.name("account.country")).sendKeys("India");
		Thread.sleep(1000);
		Select Language = new Select(driver.findElement(By.name("account.languagePreference")));
		Language.selectByVisibleText("english");
		Select Favorites = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		Favorites .selectByVisibleText("DOGS");
		WebElement MyList = driver.findElement(By.name("account.listOption"));
		MyList.click();
		Thread.sleep(2000);
		WebElement MyBanner = driver.findElement(By.name("account.bannerOption"));
		MyBanner.click();
		driver.findElement(By.name("newAccount")).click();
		System.out.println("all good");
		
	
		
	}

}
