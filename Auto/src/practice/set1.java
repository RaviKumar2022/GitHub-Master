package practice;

import java.util.HashSet;

public class set1 {

	public static void main(String[] args) {
        
		  HashSet<Integer> obj = new HashSet<Integer>();
		  
		  obj.add(100);
		  obj.add(200);
		  obj.add(300);
		  obj.add(400);
		  obj.add(500);
		  obj.add(600);
		  obj.add(100);
		  obj.add(200);
		
		System.out.println(obj);
		 
	}

}
