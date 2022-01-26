package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gurunewacc {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("http://demo.guru99.com/v4/manager/addcustomerpage.php");
		
		driver.findElement(By.xpath("//a[text()='New Customer']")).click();
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("maheshbabu");
		driver.findElement(By.xpath("//input[@value=\"m\"]")).click();
		driver.findElement(By.id("dob")).sendKeys("01021990");
		driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("hyd");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("TS");
		driver.findElement(By.xpath("//input[@name=\"pinno\"] ")).sendKeys("500007");
		driver.findElement(By.xpath("//input[@name=\"telephoneno\"]")).sendKeys("1234567890");
		driver.findElement(By.className("emailid")).sendKeys("mahesh@gamil.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("0987654321");
		
		
		
	}

}
