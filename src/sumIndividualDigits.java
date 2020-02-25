import java.util.Scanner;

public class sumIndividualDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		
		int rem =0 , sum=0;
		
		while(n!=0)
		{
			rem = n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("Sum = "+sum);
		
		
	}

}
