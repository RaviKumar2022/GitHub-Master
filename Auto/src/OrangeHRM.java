import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.events.Event.ID;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Selection;

public class OrangeHRM {
	@Test
	public void OrangeHRM() {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		System.out.println("title is "+driver.getTitle());
		System.out.println("url is "+driver.getCurrentUrl());
//		driver.navigate().refresh();
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		
//		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
//		password.sendKeys("admin123");
//		
//        driver.findElement(By.className("button")).click();
//		
//	WebElement leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
//	
//		
//		leave.click();
//		WebElement OrangeHRM =driver.findElement(By.xpath("//a[text()='Manali Kulkarni']"));
//		OrangeHRM.click();
//		
//		driver.findElement(By.id("btnSave")).click();
//		
//		
//		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
//		 WebElement firstname=driver.findElement(By.id("personal_txtEmpFirstName"));
//		 firstname.sendKeys("qwerty");
//		 
//		 driver.findElement(By.id("personal_txtEmpLastName")).clear();
//		 WebElement lastname=driver.findElement(By.id("personal_txtEmpLastName"));
//		 lastname.sendKeys("asdfg");
//		 
//			driver.findElement(By.xpath("//input[@value='0248']")).clear();
//        WebElement emplid=driver.findElement(By.xpath("//input[@value='0248']"));
//		emplid.sendKeys("abcd123");
//	 ///marital status	
//		WebElement status=driver.findElement(By.id("personal_cmbMarital"));
//       org.openqa.selenium.support.ui.Select obj = new org.openqa.selenium.support.ui.Select(status);
//       obj.selectByVisibleText("Single");
//       
//       ///nationality
//       
//       WebElement Nationality=driver.findElement(By.id("personal_cmbNation"));
//       org.openqa.selenium.support.ui.Select obj1 = new org.openqa.selenium.support.ui.Select(Nationality);
//       obj1.selectByVisibleText("Indian");
//       
//       driver.findElement(By.xpath("//input[@value='Save']")).click();

	}

//	public static void main(String[] args) {
//			}

}
