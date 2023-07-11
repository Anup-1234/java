package L1_ConditionStatments;

import java.util.Scanner;

public class Person {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<18 && age>0) {
			System.out.println("minor");
		}
		else if(age>18 && age<130) {
			System.out.println("major");
		}
		else  {
			System.out.println("invalid");
		}
	}
     
}
