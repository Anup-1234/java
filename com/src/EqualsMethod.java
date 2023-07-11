
public class EqualsMethod {
 int age;
 String name;
 EqualsMethod(int age,String name){
	 this.age=age;
	 this.name=name;
 }
 
 @Override
 public boolean equals(Object obj) {
	 EqualsMethod emp = (EqualsMethod)obj;
	 return this.age==emp.age&&this.name==emp.name;
 }
 
 public static void main(String[] args) {
	 EqualsMethod e1 = new EqualsMethod(19, "anup");
	 EqualsMethod e2 = new EqualsMethod(19, "anup"); 
	 
	 if(e1.equals(e2)) {
		 System.out.println("equals");
	 }else {
		 System.out.println("not equals");
	 }
     }
 
}
