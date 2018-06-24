package way2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		
		
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		Thread.sleep(5000);
		
		
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		
		
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//*[@class='wrench icon'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();",e);
		
		
		
		
	//	js.executeScript("alert('gfyghijlxfh');");
		
		
		
		
		
		
		

	}

}
