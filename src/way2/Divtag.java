package way2;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Divtag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui selection dropdown'])[1]"));
		
		Actions a=new Actions(driver);
		Thread.sleep(5000);
		a.click(e).build().perform();
		Thread.sleep(5000);
		
		a.sendKeys("F").build().perform();
		
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);

		
	
		
		
		
		
		
		
		
	}

}
