import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Navigator;

public class xpath {   

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/newtours/register.php");
driver.findElement(By.name("firstName")).sendKeys("Ravi kumar");
driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Rayati");
driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9010409397");
driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("rayatiravi1997@gmail.com");
driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("hyderabad");
driver.findElement(By.xpath("//input[@name='city']")).sendKeys("hyd");
driver.findElement(By.xpath("//input[@name='state']")).sendKeys("tg");
driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("123456");
driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("ravikumar");

	}

}
