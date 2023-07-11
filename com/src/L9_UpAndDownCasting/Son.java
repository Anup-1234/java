package L9_UpAndDownCasting;

public class Son extends Father {
	
	double height = 5.6;
	@Override
	void drive() {
		System.out.println("son cannot drive");
	}

}
