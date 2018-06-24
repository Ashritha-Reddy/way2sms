package way2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\testing1\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
	   // driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		Thread.sleep(5000);
	    
	    List<WebElement> l=driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
	    System.out.println(l.size());
	    
	    
	    
	    
	    
	    
	    
	    
	    		
	    
	}

}
