
public class CountDigits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1100;
		
		System.out.println(isCount(n));
	}
	
	public static int isCount(int n) {
		
		int count = 0;
		
		if(n < 10) {
			
			return 1; 
		}
		
		else {
			
			count = isCount(n/10);
			count++;
			
		}
		return count;
	}

}
