package M13_ToString;

public class Employe {
	
	int age ;
	String name;
	
	public Employe(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		return name+" "+age;
	}

	
	public static void main(String[] args) {
		Employe e1 = new Employe(19,"anup");
		System.out.println(e1);
		System.out.println(e1.toString());
		

	}

	
}
