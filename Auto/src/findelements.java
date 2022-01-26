import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.geometry.Side;

public class findelements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	//driver.navigate().to("https:www.google.com");
	//List<WebElement> links = driver.findElements(By.tagName("a"));
		//	System.out.println(links.size());
		
		
		//driver.get("https://www.facebook.com/");
		//List<WebElement> links2=driver.findElements(By.tagName("a"));
		
		//System.out.println(links2.size());
		
		
		driver.get("https://www.flipkart.com/");
		List<WebElement> links3=driver.findElements(By.tagName("a"));
		System.out.println(links3.size());
		
		
		
	}

}
