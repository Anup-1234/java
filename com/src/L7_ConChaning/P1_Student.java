package L7_ConChaning;

public class P1_Student {
	
	P1_Student(int age){
		this("Tom");
		
		System.out.println("age is: "+age);
	}
	
	P1_Student(double height){
		this(28);
		System.out.println("Height is: "+height);
	}
	
	P1_Student(String name){
		System.out.println("Name is :"+name);
	}
	
	
	P1_Student(boolean fly){
		this(5.9);
		System.out.println("Can Fly :"+fly);
	}
	
	public static void main(String[] args) {
		P1_Student s = new P1_Student(false);
	}
  
}
