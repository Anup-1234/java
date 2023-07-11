package L2_Pattern;

import java.util.Scanner;

public class P5_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int count = 1;
	        for(int i=1; i<=n;i++) {
	        	count = i;
	        	for(int j=1;j<=n;j++) {
	        	System.out.print(count+" ");
	        	count = count+n;
	        	}
	        	System.out.println();
	        }
	}


}
