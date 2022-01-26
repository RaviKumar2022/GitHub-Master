package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinks {
	public WebDriver driver;

	public void launchromebrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	driver.manage().window().maximize();	
		
	}
	public void navigateToURL(String URL) {
		driver.navigate().to(URL);
	}

      public String printTittle() {
    	 return driver.getTitle();
    	  
      }

public void tagname() {
	  driver.findElements(By.tagName("a"));
}

}

