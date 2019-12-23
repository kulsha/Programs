
public class primeNumber {

	public static void main(String[] args) 
	{
			
		int i=2 , num=33;
		boolean flag = false;
		
		while(i<=num/2)
		{
			if(num % i ==0)
			{
				flag = true;
				break;
			}
			++i;
		}
		if(!flag)
		{
			System.out.println("Is a prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}

	}

}
