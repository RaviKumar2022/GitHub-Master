package maping;

public class LinkedHashMap {

	public static void main(String[] args) {
  
		
		//linked Hashmap mentain the insertion
		 
		java.util.LinkedHashMap<String, Integer> PhoneBook = new java.util.LinkedHashMap<String, Integer>();
		
		
		PhoneBook.put("Ravi", 1234);
		PhoneBook.put("srinu", 5678);
		PhoneBook.put("chinna", 9010);
		PhoneBook.put("bala", 6300);
		PhoneBook.put("Raj", 7380);
		
		System.out.println(PhoneBook);
		
		
		
		
	}

}
