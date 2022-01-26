package assignment;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      //driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	      
	      //WebElement source =driver.findElement(By.id("column-a"));
	      
	      //WebElement destination =driver.findElement(By.id("column-b"));
	      //Actions actions = new Actions(driver);
	      
	      //Thread.sleep(3000);
	      //actions.dragAndDrop(source, destination).build().perform();
	      
	      
	      driver.get("https://demoqa.com/droppable/");
	      
	      WebElement source2  =driver.findElement(By.id("draggable")); 
	      
	      WebElement destination2 =driver.findElement(By.id("droppable"));
		
	      Actions actions1 = new Actions(driver);
	      Thread.sleep(3000);
	      
	      actions1.dragAndDrop(source2, destination2).build().perform();
		
		
		
		
	}

}
