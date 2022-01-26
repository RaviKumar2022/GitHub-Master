package TestngAutomation;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo11111 {

     @BeforeMethod
	public void test1() {
		System.out.println("Test case1");
	}
	
    @AfterMethod
	public void test2() {
		System.out.println("Test case2");
	}
	
  @BeforeClass
	public void test3() {
		System.out.println("Test case3");
	}
     @AfterClass
	public void test4() {
		System.out.println("Test case4");
	}
    @BeforeTest
	public void test5() {
		System.out.println("Test case5");
	}
    @AfterTest
	public void test6() {
		System.out.println("Test case6");
	}
@BeforeSuite
	public void test7() {
		System.out.println("Test case7");
	}
	
   
    @AfterSuite
	public void test8() {
		System.out.println("Test case8");
	}
     
    @Test
	public void test9() {
		System.out.println("Test case9");
	}
}




