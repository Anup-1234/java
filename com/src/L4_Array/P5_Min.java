package L4_Array;

public class P5_Min {
	public static void minNum(int arr[]) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		int []arr = {22,33,77,11,44,34,10,22,33};
		minNum(arr);
	}

}
