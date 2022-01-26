import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test
  public void launchmethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();

		//Navigate to URL
		driver.get("http://www.facebook.com");

  }
	
	
//	public static void main(String[] args) {
//		
//		demo1 obj = new demo1();
//		
//		obj.launchmethod();
//		
//
//}

}
