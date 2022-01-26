package assignment;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionrightclick {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.findElement(By.linkText("LOGIN")).click();
		
		//Actions action = new Actions(driver);
//action.contextClick(text).build().perform();		
		
	}

}
