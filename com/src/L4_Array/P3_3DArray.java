package L4_Array;

import java.util.Scanner;

public class P3_3DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num of school");
		int slc = sc.nextInt();
		System.out.println("enter the num of cls");
		int cls = sc.nextInt();
		System.out.println("enter the num stud");
		int stu = sc.nextInt();
		
		int arr[][][] = new int[slc][cls][stu];
		
		//storing
		for(int i=0; i<slc; i++) {
			System.out.println("inside the school: "+(i+1));
			for(int j=0; j<cls; j++) {
				System.out.println("inside the class: "+(j+1));
				for(int k=0; k<stu; k++) {
					System.out.println("enter the marks student:"+(k+1));
					arr[i][j][k]= sc.nextInt();
				}
			}
		}
		
		//fetching  
		for(int i=0; i<slc; i++) {
			System.out.println("inside the school: "+(i+1));
			for(int j=0; j<cls; j++) {
				System.out.println("inside the class: "+(j+1));
				for(int k=0; k<stu; k++) {
					System.out.println("enter the marks student:"+(k+1)+ " is "+arr[i][j][k]);
				}
			}
		}
	}

}
