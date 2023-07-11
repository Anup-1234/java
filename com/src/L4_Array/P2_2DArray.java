package L4_Array;

import java.util.Scanner;

public class P2_2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of class");
		int cls = sc.nextInt();
		System.out.println("Eneter the number of Student");
		int stu =sc.nextInt();
		
		int [][]arr = new int[cls][stu];
		
		//storing
		for(int i=0; i<cls; i++) {
			System.out.println("Inside the clss: "+(i+1));
			for(int j=0; j<stu; j++) {
			  System.out.println("Enetr the marks of student :"+(j+1));
			arr[i][j]=sc.nextInt();
			}
		}
		
		//fetching
		for(int i=0; i<cls; i++) {
			System.out.println("Inside the clss: "+(i+1));
			for(int j=0; j<stu; j++) {
			  System.out.println("Student :"+(j+1) +" marks is "+ arr[i][j]);
		
			}
		}
		
	}

}
