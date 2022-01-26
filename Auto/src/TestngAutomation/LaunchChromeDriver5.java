package TestngAutomation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChromeDriver5 {

	@Test
public void launchBrowser() {
	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();

		//Navigate to URL
		driver.get("http://www.facebook.com");
		System.out.println("title is "+driver.getTitle());
		System.out.println("url is "+driver.getCurrentUrl());
		
		driver.close();
		



	}

}
