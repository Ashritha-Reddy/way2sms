package way2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Way2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:/testing1/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com");
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.manage().window().maximize();
		//do login
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("9963731221");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("G7472P");  
	    	driver.findElement(By.xpath("//*[@value='Login']")).click();
		  driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
          w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));
         w.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobile")));
          driver.findElement(By.name("mobile")).sendKeys("8008373746");
        driver.findElement(By.id("message")).sendKeys("gud mng :-) ");
        driver.findElement(By.name("Send")).click();
        
     driver.switchTo().defaultContent();
    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")));
        if(driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).isDisplayed())
        {
        	
        	//Actions a=new Actions(driver);
        	//WebElement e=driver.findElement(By.xpath("//*[text()='Install Chrome Plugin']"));
        	//a.click(e).build().perform();       	
        	driver.findElement(By.xpath("(//*[text()='Install Chrome Plugin'])[1]")).click();
        	
        	Thread.sleep(5000);
        	Robot r=new Robot();
        	for(int i=1;i<=2;i++)
        	{
        		r.keyPress(KeyEvent.VK_TAB);
        		r.keyRelease(KeyEvent.VK_TAB);
        		Thread.sleep(6000);
        	}	
        		r.keyPress(KeyEvent.VK_ENTER);
        		r.keyRelease(KeyEvent.VK_ENTER);
        		Thread.sleep(5000);
        		
        		driver.switchTo().frame("frame");
        		try
        		{
        			if(driver.findElement(By.xpath("//*[@class='ssms consuki ']/following-sibling::span")).isDisplayed())
        			{
        				System.out.println("message sent successfully");
        					
        			}
        		}
        		catch(Exception e)
        		
        		{
        			System.out.println("message was not sent");
        			
        		}
        		
        		// do logout
        		driver.switchTo().defaultContent();
        		driver.findElement(By.xpath(("//*[@class='out louti']"))).click();
        		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        		
        		driver.close();
        	
        	}
        		
        	
        }
        
        
     
        
        
        
        

	}


