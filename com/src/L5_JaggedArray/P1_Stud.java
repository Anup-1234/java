package L5_JaggedArray;

import java.util.Scanner;

/* class  stud
 * 0        3
 * 1        4
 * 2        5
 * */

public class P1_Stud {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the count of class");
		int cls = sc.nextInt();
		int [][]arr = new int[cls][];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter the count of student in class: "+(i+1));
			arr[i]=new int[sc.nextInt()];
		}
		
		for(int i=0;i<arr.length; i++) {
			System.out.println("inside the class: "+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("enter the marks of student number: "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length; i++) {
			System.out.println("inside the class: "+(i+1));
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("enter the marks of student number: "+(j+1)+" is "+(arr[i][j]));
			}
		}
	}

}
