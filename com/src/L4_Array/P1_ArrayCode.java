package L4_Array;

import java.util.Scanner;

public class P1_ArrayCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of Student");
		int n = sc.nextInt();
		int []arr =new int[n];
		
		//Storing the data
		for(int i=0; i<=n-1; i++) {
			System.out.println("Enter the marks of Student number:"+(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println("----marks added------");
		
		//fetching the marks
		for(int i=0; i<=n-1; i++) {
			System.out.println("Marks of Student number "+(i+1)+" is: "+arr[i]);
		}
	}

}
