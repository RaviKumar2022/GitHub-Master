package practice;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		
    ArrayList<String> obj = new  ArrayList<String>();
		
    
    obj.add("aaa");
	obj.add("bbb");
	obj.add("ccc");
	obj.add("ddd");
	
	System.out.println(obj);
	
	obj.add(2, "zzz");
	System.out.println(obj);
	
	obj.remove(2);  //To remove index or something
	System.out.println(obj); 
	
		
	}

}
