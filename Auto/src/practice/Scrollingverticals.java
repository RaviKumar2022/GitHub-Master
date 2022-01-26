package practice;

import javax.swing.Action;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class Scrollingverticals {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
       driver.get("https://www.flipkart.com/");	
       
     driver.manage().window().maximize();
     Thread.sleep(600);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,7000)");		
     Thread.sleep(3000);
//     	js.executeScript("windows.ScrollBy(0,-5000)");
//     	Thread.sleep(2000);
     
     
     Actions obj = new Actions(driver);
     obj.sendKeys(Keys.PAGE_UP).build().perform();
 	Thread.sleep(2000);
 	
		driver.quit();
		
		
	}

}
