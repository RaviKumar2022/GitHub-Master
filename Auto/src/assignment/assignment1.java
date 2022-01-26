package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\\\softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		driver.navigate().refresh();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("admin123");
		
        driver.findElement(By.className("button")).click();
		
	WebElement leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
	
		
		leave.click();
		WebElement OrangeHRM =driver.findElement(By.xpath("//a[text()='Manali Kulkarni']"));
		OrangeHRM.click();
		
		driver.findElement(By.id("btnSave")).click();
		
		
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		 WebElement firstname=driver.findElement(By.id("personal_txtEmpFirstName"));
		 firstname.sendKeys("qwerty");
		 
		 driver.findElement(By.id("personal_txtEmpLastName")).clear();
		 WebElement lastname=driver.findElement(By.id("personal_txtEmpLastName"));
		 lastname.sendKeys("asdfg");
		 
			driver.findElement(By.xpath("//input[@value='0248']")).clear();
        WebElement emplid=driver.findElement(By.xpath("//input[@value='0248']"));
		emplid.sendKeys("abcd123");
		
		WebElement status=driver.findElement(By.id("personal_cmbMarital"));
		
		org.openqa.selenium.support.ui.Select obj = new org.openqa.selenium.support.ui.Select(status);
		obj.selectByVisibleText("Single");
	}

}
