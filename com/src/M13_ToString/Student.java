package M13_ToString;

public class Student {
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	public static void main(String[] args) {
	
	Student s1 = new Student(21, "anup");
	Student s2 = new Student(22, "anu");
	Student s3 = new Student(23, "an");
	
	Student[] p = new Student[3];
	 //Student[] p1= {s1,s2,s3};
	p[0]=s1;
	p[1]=s2;
	p[2]=s3;
	 for(int i=0; i<=p.length-1;i++) {
		 System.out.println(p[i]);
	 }
	 
	} 
}
