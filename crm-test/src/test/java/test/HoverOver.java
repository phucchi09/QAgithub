package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver 
{
	
	 WebDriver driver;  //make Webdriver Global so that it ca be used by all teh methods 
	 
	 @Before
	 public void launchBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	        driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.get("https://www.dell.com/en-us?~ck=mn");
	 }
	
	@Test
	
	public void hoverOverTest() throws InterruptedException
	{ 
		
	//String xpath = driver.findElement(By.xpath("");  = WRONG --> cannot put whole xpath inside String 
	/*
	By locator = By.xpath("nfajksdfjk"); //     RIGHT    
	ORRRRRRRRRRR   line 31 and 33 does same work , use one 
    WebElement element = driver.findElement(By.xpath("dfasljflj"));
    */
	
	/*  example of how WebElement manages elements according to variety
	WebElement sugar = driver.findElement(By.xpath("dfasljflj"));
	WebElement submit_button = driver.findElement(By.xpath("dfasljflj"));
	WebElement Flour = driver.findElement(By.xpath("dfasljflj"));
	sugar.click();	
	submit_button.click();
	Flour.click();		
	*/
	
	
//	WebElement element = driver.findElement(By.xpath("dfasljflj"));
//	action.moveToElement(element);
	
	//Element Library
	    WebElement DEALS_MENU_ELEMENT= driver.findElement(By.xpath("//*[@id='l1_4']"));
	
	    Actions action = new Actions(driver); // instiantiate Action Class and pass driver as a paramenter	
	    action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
	
	     Thread.sleep(2000);
	     WebElement WORKSTATION_DEALS_ELEMENT= driver.findElement(By.linkText("Workstation Deals"));
	     WORKSTATION_DEALS_ELEMENT.click();
	     Thread.sleep(2000);	
	}
	
	@Test
	public void hoverOverTes2t() throws InterruptedException
	{  
	  		
	//String xpath = driver.findElement(By.xpath("");  = WRONG --> cannot put whole xpath inside String 
	/*
	By locator = By.xpath("nfajksdfjk"); //     RIGHT    
	ORRRRRRRRRRR   line 31 and 33 does same work , use one 
    WebElement element = driver.findElement(By.xpath("dfasljflj"));
    */
	
	/*  example of how WebElement manages elements according to variety
	WebElement sugar = driver.findElement(By.xpath("dfasljflj"));
	WebElement submit_button = driver.findElement(By.xpath("dfasljflj"));
	WebElement Flour = driver.findElement(By.xpath("dfasljflj"));
	sugar.click();	
	submit_button.click();
	Flour.click();		
	*/
	
	
//	WebElement element = driver.findElement(By.xpath("dfasljflj"));
//	action.moveToElement(element);
	
	//Element Library
	    WebElement DEALS_MENU_ELEMENT= driver.findElement(By.xpath("//*[@id='l1_4']"));
	
	    Actions action = new Actions(driver); // instiantiate Action Class and pass driver as a paramenter	
	    action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
	
	     Thread.sleep(2000);
	     WebElement WORKSTATION_DEALS_ELEMENT= driver.findElement(By.linkText("Workstation Deals"));
	     WORKSTATION_DEALS_ELEMENT.click();
	

	Thread.sleep(2000);	
	}
	
	@After
	public void closeEverything()
	{
		driver.close();
		driver.quit();
	}

}
