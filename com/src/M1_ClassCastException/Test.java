package M1_ClassCastException;

public class Test {

	public static void main(String[] args) {
		Father f = new Daughter();
		
		if(f instanceof Son) {
			System.out.println("Downcast of son");
			Son s = (Son)f;
			System.out.println(s.x+" "+s.y);
		}else if(f instanceof Daughter) {
			System.out.println("Downcast to Daughter");
			Daughter d = (Daughter)f;
			System.out.println(d.x+" "+d.z);
		}
		

	}

}
