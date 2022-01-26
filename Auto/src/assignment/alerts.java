package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {

		
		 System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://demoqa.com/alerts");
	      
	     // driver.findElement(By.id("alertButton")).click();
	      
	      //Thread.sleep(3000);
	      
	     //Alert alerts = driver.switchTo().alert();
	     //alerts.accept();
	     
	     //Thread.sleep(3000);
	     
       driver.findElement(By.id("timerAlertButton")).click();
Thread.sleep(7000);

	Alert alerts2 = driver.switchTo().alert();
	
	Thread.sleep(7000);
	
	alerts2.accept();
	
	
	}

}
