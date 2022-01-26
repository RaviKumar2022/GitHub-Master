package maping;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class treemaping {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> obj = new TreeMap<String, Integer>();
		
		obj.put("Ravi", 1212);
		obj.put("Chandra", 1313);
		obj.put("seena", 00011);
		
		
		System.out.println(obj);
		
		System.out.println(obj.get("Ravi"));  //to print specific value
		
		Set<String> Keys = obj.keySet();   // to print only keys a)
		
		for (String keys : Keys) {   // b) we have to use foreachloop

		System.out.println(keys);
		}

		
 Set< Map.Entry<String, Integer>> allkeys = obj.entrySet();
             for (Entry<String, Integer> entry : allkeys) {
            	 System.out.println(allkeys);
	
}
		
		
		

	}

}
