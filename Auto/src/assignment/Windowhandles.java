package assignment;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/");
	// Addressing the locator to perform mouse over function
	WebElement selenium = driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
	//syntax for mouse over function
	Actions action = new Actions(driver);
		
		action.moveToElement(selenium).build().perform();
		 Thread.sleep(3000);
	
		 WebElement windowHandles  = driver.findElement(By.xpath("//a[text()='Window Handles']"));
		
		 windowHandles.click();
		 
	 driver.findElement(By.id("name")).sendKeys("Text1");
	 
	 String ParentWindowHandle = driver.getWindowHandle();
	 System.out.println("ParentWindowHandle -" + ParentWindowHandle+driver.getTitle());
	 
	 driver.findElement(By.id("newWindowBtn")).click();
		java.util.Set<String> WindowHandles	= driver.getWindowHandles();
		
		for (String windowHandle : WindowHandles) {
			if (!windowHandle.equals(ParentWindowHandle)) {
			
			driver.switchTo().window(windowHandle);
			driver.manage().window().maximize();
			
			 driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("abvc");
			Thread.sleep(3000); 
			driver.close();
			}
			
			System.out.println(windowHandle + driver.getTitle());
		}
		driver.switchTo().window(ParentWindowHandle);
		
	
	}

}
