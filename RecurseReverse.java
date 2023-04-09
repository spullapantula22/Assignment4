
public class RecurseReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12345;
		
		reverse(n);
		
		
	}
	
	public static void reverse(int n) {
		
		int rev = 0;
		
		if(n < 10) {
			
			System.out.println(n);
			return;
		}
		
		
		else {
			
			System.out.println(n%10);
			
			reverse(n/10);
		}
		
	}

}
