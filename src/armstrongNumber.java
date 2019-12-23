
public class armstrongNumber {

	public static void main(String[] args)
	{
		
		int remainder , result=0 , number=153;
		int origNo=number;
		
		while(origNo!=0)
		{
			remainder=origNo%10;
			result+= remainder*remainder*remainder;
			origNo=origNo/10;
		}
		
		if(result==number)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");
		
	}

}
