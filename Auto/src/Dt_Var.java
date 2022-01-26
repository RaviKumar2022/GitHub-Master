
public class Dt_Var {
int b=20;
static int empid = 101;
int a=10;
 public void m1() {
System.out.println("M1 executed");
System.out.println("Local variables"+ a);
	}
public void m2() {
	System.out.println("M2 executed");
	System.out.println("instance variable"+b);
	System.out.println("static variable"+ empid);
	}
public void m3() {
	System.out.println("M3 executed");
	System.out.println("instance variable"+ b);
	System.out.println("static variable"+ empid);
	}

public void st()  {
	System.out.println("static method executed");
}
public static void main(String args) {
	System.out.println("Main method executed");
	Dt_Var m = new Dt_Var();
	m.m1();
	m.m3();
	m.m2();
	Dt_Var();	
}
private static void Dt_Var() {
	// TODO Auto-generated method stub
	
}	
}
