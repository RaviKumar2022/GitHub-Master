package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frames2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
	
		WebElement Text1 = driver.findElement(By.id("name"));
		Text1.sendKeys("Text1");
		
		driver.switchTo().frame("frm1");	
		
		WebElement frame1 = driver.findElement(By.id("course"));

		Select java = new Select(frame1);
		java.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent(); // for getting out of the frame1
		
		driver.findElement(By.id("name")).clear();
		
		// again we are going to main content to Replace the Text1 to Text2
		
	WebElement Text2 = driver.findElement(By.id("name"));
		Text2.sendKeys("Text2");
		
		driver.switchTo().frame("frm2");
		
		WebElement frame2firtstname  = driver.findElement(By.id("firstName"));
		frame2firtstname .sendKeys("RavI");
		
		WebElement frame2lastname = driver.findElement(By.id("lastName"));
		frame2lastname.sendKeys("kumar");
		
		driver.switchTo().defaultContent();  // for getting out of the frame2
		
		driver.findElement(By.id("name")).clear(); // clearing text 
		
		// again we are going to replace Text2 to Text3
		
		
		WebElement Text3 = driver.findElement(By.id("name"));
		Text2.sendKeys("Text3");
		
		driver.switchTo().frame("frm3");
		
		WebElement frame3 = driver.findElement(By.id("name"));		
		
		frame3.sendKeys("qaz");
		
	}

}
