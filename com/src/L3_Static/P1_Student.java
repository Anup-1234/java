package L3_Static;

public class P1_Student {
	static int age = 25;
	static void study() {
		System.out.println("student studing");
	}
	
	public static void main(String[] args) {
		System.out.println(P1_Student.age);
		P1_Student.study();
	}

}
