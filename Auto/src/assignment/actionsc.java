package assignment;

import java.sql.Driver;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class actionsc {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.browserstack.com/");
      //Thread.sleep(2000);
      
WebElement developer=driver.findElement(By.xpath("//span[text()='Developers ']"));
      
     Actions action = new Actions(driver);
     action.moveToElement(developer).build().perform();
      
    	Thread.sleep(3000);
    	
    	WebElement support = driver.findElement(By.xpath("//a[text()='Support']"));
    	
    	support.click();
	}

}
