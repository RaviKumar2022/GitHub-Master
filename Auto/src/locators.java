import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://www.flipkart.com");
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("1234576890");
         driver.findElement(By.className("_2IX_2- _2LYh3d VJZDxU")).sendKeys("1234567890");		
          driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("abcdefghijk");
          driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
          driver.findElement(By.name("")).sendKeys(args);
	}

}
