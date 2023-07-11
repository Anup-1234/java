package L6_Inheritance;

public class P1_Test {
	public static void main(String[] args) {
		P1_Son s = new P1_Son(18);
		System.out.println("name: "+s.name);
		System.out.println("age of father is: "+s .age);
		s.drive();
	}

}
