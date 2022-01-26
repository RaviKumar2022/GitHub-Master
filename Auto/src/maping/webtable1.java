package maping;

import java.sql.Driver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Inheritance.webdriverdemo1;

public class webtable1 extends webdriverdemo1 {

	
	public static void main(String[] args) {
	    
		
		webtable1 ss = new webtable1();
		
		
		ss.launchchromeBrowser();
		
		ss.navigateToURL("https://demo.guru99.com/test/web-table-element.php");
		
		System.out.println( ss.getURL());
		
		System.out.println(ss.printTittle());
		
	ss.getdata();
	
		
	}

	
	    public void getdata() {
	    	
	    	LinkedHashMap<String, String>  all =  new LinkedHashMap<String, String>();
	    	
	    	
	    	List<WebElement> companynames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
	    	
	    	List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//td[1]/a"));
	    	
	    				for (int i=0; i<companynames.size(); i++) {
	    					
	    					all.put(companynames.get(i).getText(), CurrentPrice.get(i).getText());
	    					
	    				}
	    	System.out.println(all);
				
	    }
}
