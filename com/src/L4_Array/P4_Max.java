package L4_Array;

public class P4_Max {
	
	
	public static void maxNum(int arr[]) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max =arr[i];
			}
		}
		System.out.println("maximun number in arr is: "+max);
	}
	
	public static void main(String[] args) {
		int []arr = {10,20,90,50,33};
		maxNum(arr);
	}

}
