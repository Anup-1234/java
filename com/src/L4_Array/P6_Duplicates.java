package L4_Array;

public class P6_Duplicates {
	
	public static void dup(int arr[]) {
		int n=arr.length,count=0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					for(int k=j;k<n;k++) {
						arr[j]=arr[j+1];
					}
					j--;
					n--;
                 System.out.println(arr[i]+",");
				}
			}
		}
		
			
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,2,3,4,5,5,6,6,7,7,7,8,9,7};
		dup(arr);
	}

}
