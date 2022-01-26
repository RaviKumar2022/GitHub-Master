import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Navigator;

public class textconcept {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://www.facebook.com");
driver.navigate().refresh();

driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

	}

}
