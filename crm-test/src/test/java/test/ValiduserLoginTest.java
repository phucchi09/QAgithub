package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValiduserLoginTest
{
	@Test
 public void va() throws InterruptedException
 {
//Set Property for ChromeDriver  --- ChromeDriver controls      Chrome BROWSER
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();  // driver  gets all the prower of ChromeDriver 

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //    //Implicit Wai    10 seconds wait for everything going to wait java if it needed
driver.get("http://techfios.com/test/billing/?ng=login/");
driver.findElement(By.xpath("//*[@type='text']")).sendKeys("junudhungana@gmail.com");
Thread.sleep(2000);
//driver.findElement(By.xpath("//input[contains(@placeholder,'assword')]")).sendKeys("aachikha");

driver.findElement(By.xpath("//input[contains(@placeholder,'assword') and contains(@class, 'form-c')]")).sendKeys("aachikha");
//driver.findElement(By.xpath("//*[contains(@placeholder,'assword') and contains(@class, 'form-c')]")).sendKeys("aachikha");
//driver.findElement(By.xpath("//*[text()='Log In']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//button[@name='login']")).click();
//  driver.findElement(By.xpath("//*[contains(text(), 'og In')]")).click()
Thread.sleep(2000);


//Dashboard display validation 
String dasbboardTitleXpath = "//div[@id='page-wrapper']//descendant::h2[contains(text(),'Dashboard')]";
////No.1 WAY  ... Explicit wait     eg webdriver = type = woman , junu= driver 

Thread.sleep(3000);
WebDriverWait wait= new WebDriverWait(driver,10);  // wait ---> has power of WebDriver and driver ==

//if Locator wala option ma (BY......) garne 
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(dasbboardTitleXpath)));

// if WebElement wala option 6 vane use  ---> wait.until(ExpectedConditions.visibilityOfAllElements(elements)
//wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(arg0));

//Everything to use EXPLICIT WAIT 	 can be done in 1 line pic 12:01

String expectedTitle = "Dashboard- Techfios Test Application -Billing";
String actualTitle = driver.getTitle();  // actualTitle ma title of erbsite dave hun6 

if(expectedTitle.equalsIgnoreCase(actualTitle))
  {
	System.out.println("Test Pass ");
	
  }
else
{
	System.out.println("Dashboard page did not display");
}


driver.close();
driver.quit();
}

}
