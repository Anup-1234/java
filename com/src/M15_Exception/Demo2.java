package M15_Exception;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int []a= {10,20,30};
		System.out.println("enter index number");
		try {
		System.out.println(a[sc.nextInt()]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("invalid input give valid input");
			System.out.println("Enter once again");
			
		}
		finally {
			try {
				System.out.println(a[sc.nextInt()]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("inavlid input logout");
			}
		} 
        sc.close();
	}

}
