package automationFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustTryWhattsapp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium\\\\software\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first-name")).sendKeys("manoj");
		Thread.sleep(1500);
		driver.findElement(By.id("last-name")).sendKeys("kumar");
		driver.findElement(By.id("postal-code")).sendKeys("636813");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("finish")).click();
		String Tnankyoumessage = driver.findElement(By.xpath("//h2[contains(text(),'ORDER')]")).getText();
		System.out.println(Tnankyoumessage);
		String Orderconformmsg = driver.findElement(By.xpath("//div[starts-with(text(),'Your order')]")).getText();
		System.out.println(Orderconformmsg);
		String Cssvalue = driver.findElement(By.name("back-to-products")).getCssValue("font-size");
		System.out.println(Cssvalue);
		int imagesize = driver.findElements(By.tagName("img")).size();
		System.out.println(imagesize);
		String compleatepageurl = driver.getCurrentUrl();
		System.out.println(compleatepageurl);
		String tagname = driver.findElement(By.xpath("//button[@id='back-to-products']/preceding::img")).getTagName();
		System.out.println(tagname);
		String attribut = driver.findElement(By.xpath("//button[@id='back-to-products']/preceding::img")).getAttribute("alt");
		System.out.println(attribut);
		 String cssvalue = driver.findElement(By.xpath("//button[@id='back-to-products']/preceding::img")).getCssValue("font-size");
		System.out.println(cssvalue);
		String colorcode = driver.findElement(By.xpath("//button[@id='back-to-products']/preceding::img")).getCssValue("color");
		System.out.println(colorcode);

	}

}
