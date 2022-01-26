import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		
System.setProperty(" webdriver.gecko.driver " , "D:\\softwares\\geckodriver-v0.30.0-win64\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();

//Maximize the browser
driver.manage().window().maximize();

//Navigate to URL
driver.get("http://www.facebook.com");

	}

}
