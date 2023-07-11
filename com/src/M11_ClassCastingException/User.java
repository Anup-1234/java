package M11_ClassCastingException;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Reception r = new Reception();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the choice");
				
		Hotel h = r.booking(s.nextInt());
		
		if(h instanceof AcRoom) {
			System.out.println("Ac Room Booked");
		}
		else if(h instanceof NonAcRoom) {
			System.out.println("Non-Ac Room Booked");
		}else {
			System.out.println("invalid input");
		}
		
	}

}
