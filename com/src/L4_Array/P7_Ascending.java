package L4_Array;

public class P7_Ascending {
	public static void ass(int arr[]){
		int temp = 0;
		for(int i=0; i<=arr.length; i++) {
			for(int j=i+1; j<=arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp; 
				}
			}
			System.out.println(arr[i]+",");
		}	
	}
    
	public static void main(String[] args) {
		int arr[] = {1,5,2,9,5,3,8};
		ass(arr);
	}
}
