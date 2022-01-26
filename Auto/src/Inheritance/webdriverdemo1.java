package Inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo1 {
	public WebDriver driver;
	
	public void launchchromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		 driver = new ChromeDriver();
	
		 driver.manage().window().maximize();
		
	}
	 
	public void navigateToURL(String URL) {
		driver.get(URL);
	}

	public String printTittle() {
		return driver.getTitle();
		
	}
	
	public String getURL() {
		return driver.getCurrentUrl();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
