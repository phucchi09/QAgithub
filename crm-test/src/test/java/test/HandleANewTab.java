package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*  						 WINDOW  HANDLE   PIC 9:34 AM FEB 2  2019 
 Test Case: Search "xpath" in Yahoo
a. Go to Yahoo.com,
b. Type "xpath" in the search field,
c. Click on the search icon,
d. click on the link that says, "XPath Tutorial - W3Schools",
e. W3Schools page should open (Validation: if else)
 
 */
public class HandleANewTab 
{
	WebDriver driver;  //make Webdriver Global so that it ca be used by all teh methods 
	 
	 @Before
	 public void learnWindowHandle()
	 {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	        driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    
		    driver.get("https://www.yahoo.com/");   // a. Go to Yahoo.c
		    
	 }
	 
	 @Test
	 public void searchXpathInYahoo() throws InterruptedException
	 {
		 // xpath = //*[@id='header-search-input']    css= input#header-search-input
		 By SEARCH_FIELD_LOCATOR = By.cssSelector("input#header-search-input");   
		 By W3_LINK_LOCATOR = By.linkText("XPath Tutorial - w3schools.com");
		 By SQL_LINK_LOCATOR = By.linkText("SQL");
		 
		 driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("xpath");   // b. Type "xpath" in the search field,
		 		 
		 driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER); // // c. Click on the search icon,   ->hit ENTER button
		 
		 // Explicit Wait use garne ----> becoz it only takes time if needed 
		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(W3_LINK_LOCATOR));
		 		 
		// IQ waht is teh besst way to identify thie element   "XPath Tutorial - W3Schools" --> linkText
		 driver.findElement(W3_LINK_LOCATOR).click();
		 // To erase whatever is on the search bar
		 //System.out.println(driver.getWindowHandles());  // console ma output = [CDwindow-641B8F2DAA7948767C132E2ED73960CF]
		 
		 for(String windowHandle: driver.getWindowHandles())
		    {
			 driver.switchTo().window(windowHandle);
		    }
		
		 driver.findElement(SQL_LINK_LOCATOR).click();
					 
	 }

	  
	 @After
		public void closeEverything()
		{		
		    driver.close();
//			driver.quit();
		}
}
