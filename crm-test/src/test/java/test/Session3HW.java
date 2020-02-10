package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session3HW 
{
	
	@Test
	 public void validUsersTransferMoney() throws InterruptedException
	 {
	//Set Property for ChromeDriver  
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();  // driver  gets all the power of ChromeDriver 

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit Wait    waits for 10 seconds for everything if needed
	// 1: Open Browser and go to site http://techfios.com/test/billing/?ng=admin/
	driver.get("http://techfios.com/test/billing/?ng=admin/");
	
	// 2. Enter username: techfiosdemo@gmail.com
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
	Thread.sleep(2000);
	
	// 3. Enter password: abc123
	driver.findElement(By.xpath("//input[contains(@placeholder,'assword')]")).sendKeys("abc123");
	Thread.sleep(2000);
	
	//4. Click login button
	driver.findElement(By.xpath("//*[contains(text(), 'Sign in')]")).click();
	Thread.sleep(2000);

	// 5. Click on Transactions in the Side Navigation
	driver.findElement(By.linkText("Transactions")).click();	
	Thread.sleep(2000);
	
	// 6. Click on transfer
	driver.findElement(By.linkText("Transfer")).click();	
	Thread.sleep(2000);

	// 7. Fill in the New Transfer Form
    Select fromAccountType = new Select(driver.findElement(By.xpath("//*[@id='faccount']")));
	fromAccountType.selectByValue("housedownpayment");
	Thread.sleep(3000);
	
	Select toAccountType = new Select(driver.findElement(By.name("taccount")));
	toAccountType.selectByValue("rsetlur");
	Thread.sleep(3000);
	

	//Find the date time picker control
    WebElement dateBox = driver.findElement(By.xpath("//form//*[@id='date']")); 
    dateBox.clear();

    //Fill date as mm/dd/yyyy as  -->2020-01-01
    dateBox.sendKeys("2020-01-01");
  
    Thread.sleep(3000);
    
    dateBox.sendKeys(Keys.TAB);
    
    driver.findElement(By.xpath("//input[@id='description']")).sendKeys("Ju trying to describer her transaction.");
    
  
    driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("2323");
    
    dateBox.sendKeys(Keys.TAB);
    
  
    //driver.findElement(By.xpath("//*[@type='search']")).sendKeys("2323");
    
    
    ////*[@id="tform"]/div[6]/div/span/span[1]/span/ul    //////////    //*[@title='hgfcvhjbjk']
    //Select selTags = new Select(driver.findElement(By.xpath("//*[@id='tform']/div[6]/div/span/span[1]/span/ul")));
    //selTags.selectByValue("hgfcvhjbjk");
	Thread.sleep(3000);
   

	 driver.findElement(By.xpath("//*[@id='submit']")).click();

	driver.close();
	driver.quit();
	}


}
