package L9_UpAndDownCasting;

public class Test {

	public static void main(String[] args) {
		//Upcasting
		Father f = new Son();
		System.out.println(f.age=55);
		f.drive();
		//f.height; error cannot access son variable
		
		//Downcasting
		Son s = (Son)f; 
		s.drive();
		System.out.println(s.height);
		System.out.println(s.name);
		
		
		
	}

}
