
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		
		System.out.println(sumArray(arr, arr.length));

	}
	
	public static int sumArray(int arr[], int n) {
		
		int sum = 0;
		
		if(n== 0) return 0;
		
		else {
			
			return arr[n-1] + sumArray(arr, n-1);
			
		}
		
	}

}
