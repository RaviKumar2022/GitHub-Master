package practice;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class guru1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("http://demo.guru99.com/v4/index.php");
		driver.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys("mngr375914");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("EpEgYva");
		
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click(); // login button
		
		
			

		
		
		
		
		
		
	}

}
