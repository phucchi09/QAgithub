package test;


import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousElements
{
	@Test
	
	public void exploreVariousElements() throws InterruptedException
	{
	    // Set Chrome driver as your Default Driver
	   // Set Property for ChromeDriver  --- ChromeDriver controls      Chrome BROWSER
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   
	   
	 //Instantiate ChromeDriver Object         =   "equal sign" is assigning  
	//  class     object     
	   WebDriver driver = new ChromeDriver();  // driver  gets all the prower of ChromeDriver 
	   
	   //Implicit Wait  --going to wait java if it needs to wait for 10 seconds if not needed and if it 
	   //find elements before specified time then it will work and go to another line of code
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //10 seconds wait for everything going to wait java if it needed
	   
	   //website stores data and don't clean up --- so when we delete cookies some site works 
	   //DELETE cookies and history
	   driver.manage().deleteAllCookies();
	   
	   //maximize the window
	   driver.manage().window().maximize();
	 
	   
	   // go to a site
	   driver.get("http://objectspy.space/");
	   
	   //slows down java for 3 seconds 
	   Thread.sleep(3000);
	   
	   //click on Radio Button Female
	   driver.findElement(By.id("sex-1")).click();
	   Thread.sleep(3000);
	   
	   //type something in fiels	   
	   driver.findElement(By.name("firstname")).sendKeys("Junu");
	   Thread.sleep(3000);
	   
	   // clink on Link Test
	   //driver.findElement(By.linkText("Link Test : New Page")).click();
	  // Thread.sleep(3000);
	   
	   // click on partial Link 
	   driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();
	   Thread.sleep(3000);
	   
	   ///class name 
	   //driver.findElement(By.className())
	   
	   
	   
	  
	   driver.close();  // close the driver
	   driver.quit();   // shut down the Driver  ... if this quit is not done its gonna eat up the bandwidth
	   
	
	}
}
