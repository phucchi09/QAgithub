package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElements
{
	@Test
 public void handleCssElements() throws InterruptedException
 {

//Set Property for ChromeDriver  --- ChromeDriver controls      Chrome BROWSER
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");


//Instantiate ChromeDriver Object         =   "equal sign" is assigning  
//  class     object     
WebDriver driver = new ChromeDriver();  // driver  gets all the prower of ChromeDriver 

//Implicit Wait  --if it sees element before 10 seconds than it wont wait for 10 seconds but it it don't see the elements 
//it is going to look for the element for the MAXIMUM of 10 seconds
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //10 seconds wait for everything going to wait java if it needed

// go to a site
driver.get("http://objectspy.space/");

driver.findElement(By.cssSelector("input#sex-0")).click();
Thread.sleep(3000);

//driver.findElement(By.cssSelector("input[value='Female']")).click();  // tag[attribute='value']    inside "" double quotation  no 2. 
//ANOTHER WAY

driver.findElement(By.cssSelector("label.radio[for='sex-1']")).click();   //      // tag.class[attribute='value']    inside "" double quotation  no 1. 


//driver.findElement(By.xpath("//*[@id='content']/form/div[1]).click();

Thread.sleep(3000);

driver.close();
driver.quit();
}

}
