package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		
		//Tittle
		String title = driver.getTitle();
		System.out.println("the title of the page is: "+ title);
		
		
		//current url
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		String url=driver.getCurrentUrl();
		System.out.println("the current url :"+ url);
		
		//close
		driver.close();
		
		
	}

}
