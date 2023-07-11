package M16_CustomException;

import java.util.Scanner;

public class LoginFRom {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter id");
		String id = sc.nextLine();
		System.out.println("Enter password");
		int pass = sc.nextInt();
		if(id.equals("admin")) {
			if(pass == 123) {
				System.out.println("login successful");
			}	
		}
		else
			{
				try {
			InvalidPasswordException obj =new InvalidPasswordException();
			throw obj;
//			throw new InvalidPasswordException ();
				}
				catch(InvalidPasswordException e) {
					System.out.println("invalid user id or password");
				}
		}
		sc.close();
	}	
}
