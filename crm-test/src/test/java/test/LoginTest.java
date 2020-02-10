package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginTest
{
	@Test
 public void handleCssElements() throws InterruptedException
 {
//Set Property for ChromeDriver  --- ChromeDriver controls      Chrome BROWSER
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
WebDriver driver = new ChromeDriver();  // driver  gets all the prower of ChromeDriver 

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //    //Implicit Wai    10 seconds wait for everything going to wait java if it needed
driver.get("https://www.objectspy.com/register/signup.php");

//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("junudhungana@gmail.com");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aachikha");
//Thread.sleep(2000);

//driver.findElement(By.xpath("//button[text()='Log In']")).click();
///driver.findElement(By.xpath("//*[text()='Log In']")).click();

//Register | ObjectSpy

String expectedTitle = "facebook";
String actualTitle = driver.getTitle();  // actualTitle ma title of erbsite dave hun6 

//if(expectedTitle.equalsIgnoreCase(actualTitle))
//  {
//	System.out.println("Test Pass ");
//	
//  }
//else
//{
//	System.out.println("Dashboard page did not display");
//	throw new RuntimeException("TEst Failed !");
//}

//Another way

//class.method--> starts with lowercase and upeer case and has ()
Assert.assertEquals("Dashboard page did not display", expectedTitle, actualTitle);

Thread.sleep(2000);



driver.close();
driver.quit();
}

}
