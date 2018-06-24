package way2;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	//WebElement e=driver.findElement(By.id("lst-ib"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		js.executeScript("document.getElementById('lst-ib').style.border='2px dotted blue';");
		Thread.sleep(5000);
		
	//	js.executeScript("document.getElementById('lst-ib').click();");
		
		Thread.sleep(5000);
		js.executeScript("document.getElementById('lst-ib').value='MODI';");
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
