package automationFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonWeb {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","D:\\selenium\\software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		WebElement Signin =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(Signin).build().perform();
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("8525028583");
		Thread.sleep(2000);
		WebElement Countinue = driver.findElement(By.id("continue"));
		Actions enter = new Actions(driver);
		enter.sendKeys(Keys.ENTER).build().perform();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi ");
		driver.findElement(By.id("nav-search-submit-button"));
		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Cloud Lavender')]")).click();
		String PageUrl = driver.getCurrentUrl();
		System.out.println(PageUrl);
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
		String text= driver.findElement(By.xpath("//span[contains(text(),'Cloud Lavender')]")).getText();
		System.out.println(text);
		String attribute = driver.findElement(By.xpath("//span[contains(text(),'Cloud Lavender')]")).getAttribute("Cloud Lavender");
		System.out.println(attribute);
	    String tagname = driver.findElement(By.xpath("//span[contains(text(),'Cloud Lavender')]")).getTagName();
		System.out.println(tagname);
	    String size = driver.findElement(By.xpath("//span[contains(text(),'Cloud Lavender')]")).getCssValue("Cloud Lavender");
        System.out.println(size);
       
		
	}
}
