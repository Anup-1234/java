package M11_ClassCastingException;

public class Reception extends Hotel{
	Hotel booking (int choice) {
		if(choice == 1) {
			System.out.println("Please wait for Ac room ");
			return new AcRoom();
		}
		else if(choice == 2) {
			System.out.println("Please wait for Non-Ac room");
			return new NonAcRoom();
			
		}else {
			return null;
		}
	}

}
