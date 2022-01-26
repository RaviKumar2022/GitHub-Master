import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiBrowser {

	public static void main(String[] args) {

		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://web.whatsapp.com");
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\softwares\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			
		}
		
		
	}

}
