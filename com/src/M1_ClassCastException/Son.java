package M1_ClassCastException;

public class Son extends Father {
	int y = 33;
	@Override
	void swim() {
		System.out.println("son cannot swim");
	}

}
