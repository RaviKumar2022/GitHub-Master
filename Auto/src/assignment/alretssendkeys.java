package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alretssendkeys {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	      driver.get("https://demoqa.com/alerts");
	      
	     // driver.findElement(By.id("confirmButton")).click();
	      
	      //Alert alerts = driver.switchTo().alert();
	      //alerts.accept();
		
	   WebElement promt = driver.findElement(By.id("promtButton"));
	   promt.click();
	   
	    Thread.sleep(3000);
	    
	    Alert alerts3 = driver.switchTo().alert();
	    
	    alerts3.sendKeys("1234567");
	    
	    alerts3.accept();
	    
	    
	      
	}

}
