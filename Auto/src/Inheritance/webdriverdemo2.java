package Inheritance;

public class webdriverdemo2 extends webdriverdemo1 {

	public static void main(String[] args) {
     
	webdriverdemo2 ss = new webdriverdemo2();
	
	 ss.launchchromeBrowser();
	 ss.navigateToURL("http://www.google.com");
	 System.out.println(ss.printTittle());
	 System.out.println(ss.getURL());
		System.out.println("---------------");
	
		ss.launchchromeBrowser();
		 ss.navigateToURL("http://www.facebook.com");
		 System.out.println(ss.printTittle());
		 System.out.println(ss.getURL());
		 System.out.println("---------------");
		 
			ss.launchchromeBrowser();
			 ss.navigateToURL("http://www.amazon.com");
			 System.out.println(ss.printTittle());
			 System.out.println(ss.getURL());
			 System.out.println("---------------");
			 
		 
	} 

}
