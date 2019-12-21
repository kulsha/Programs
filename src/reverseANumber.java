
public class reverseANumber {

	public static void main(String[] args) {
		
		int n = 23415;
		int result=0, remainder;
		
		while(n>0)
		{
			remainder = n%10;
			result = result*10 + remainder;
			n=n/10;
		}
		System.out.println("Reverse of the number equals " +result);
		
		
	}

}
