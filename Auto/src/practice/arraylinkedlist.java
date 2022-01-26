package practice;

import java.util.LinkedList;
import java.util.List;

public class arraylinkedlist {

	public static void main(String[] args) {
		
	  List<String> obj  = new LinkedList<String>();
	  
	  obj.add("aaa");
		obj.add("bbb");
		obj.add("ccc");
		obj.add("ddd");
		System.out.println(obj);
      
		   obj.add(3, "yyyy");
		   
		   System.out.println(obj);
		   
		 obj.remove(3)	;
		 System.out.println(obj);
		
	}

}
