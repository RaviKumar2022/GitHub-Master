package Abstract;

public class laptops2 extends laptops {


	void apple() {
		
		System.out.println("very exepencive");
		
	}


	void sony() {

		System.out.println("baned");
		
	}
       
	public static void main(String[] args) {
	 
		laptops2 i = new laptops2 ();
		
		i.hp();
		i.lenova();
		i.dell();
		i.apple();
		i.sony();
		
	}
	

}
