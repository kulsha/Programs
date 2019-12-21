
public class Factorial {

	static void factorial(int number)
	{
		int fact=1;
		for(int i = 1 ; i<=number ; i++)
		{
			fact = fact * i;
		}
		System.out.println("The factorial of " + number + " is " + fact);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		factorial(6);
		factorial(7);
		factorial(5);
		
		
	}

}
