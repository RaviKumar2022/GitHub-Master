package TestngAutomation;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class samplw0000 {
   
	
	  public void launchbrowser() {
		  System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			//Maximize the browser
			driver.manage().window().maximize();

	  }
	  
	  
	
		
	
}
