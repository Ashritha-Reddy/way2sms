package way2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.xpath("//*[@id='lst-ib']"));
		String x=e1.getAttribute("title");
		
		
		
		System.out.println(x);
			
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		

	}

}
