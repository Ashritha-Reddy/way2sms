package way2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvisibleElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
	    driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	    
	    List<WebElement> l=driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
	    		
	    
	    
	 //   List<WebElement> l=driver.findElement(By.xpath(*()))
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	
		
		

	}

}
