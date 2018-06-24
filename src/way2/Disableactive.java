package way2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disableactive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement e=driver.findElement(By.id("lst-ib"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('disabled',true);",e);
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].removeAttribute('disabled');",e);
		Thread.sleep(10000);
		
		
	
		
		
		
		driver.close();
		
		
		Thread.sleep(5000);
		
		
	}

}
