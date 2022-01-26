package practice;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args) {
		
		
		Set<Integer> obj = new LinkedHashSet<Integer>();   //// linkedhashset maintain insetation order in console
		
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(9000);
		obj.add(7600);
		
		System.out.println(obj);
		
        
	}

}
