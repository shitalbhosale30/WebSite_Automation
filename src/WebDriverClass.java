import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClass {
	public static WebDriver driver;
	public void baseDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHITAL G BHOSALE\\Downloads\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vts.com/");
		
	}

}
