import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCasesOpenWebsite extends WebDriverClass {
	  @Test(priority=1)
	  public void openWebsite() 
	  {
		baseDriver();
		driver.manage().deleteAllCookies();
	  } 
	  @Test(priority=2)
	  public void signUp() throws InterruptedException  
	  {
		  openWebsite();
		  driver.findElement(By.id("Nav Demo Request")).click(); 
		  driver.findElement(By.id("FirstName")).sendKeys("Shital");
		  Thread.sleep(1000);
		  driver.findElement(By.id("LastName")).sendKeys("Bhosale");
		  Thread.sleep(1000);
		  driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
		  Thread.sleep(1000);
		  driver.findElement(By.className("mktoButton")).click(); 
	  }
		
	}
