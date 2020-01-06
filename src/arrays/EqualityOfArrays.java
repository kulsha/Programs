package arrays;

public class EqualityOfArrays {

	public static void main(String[] args) {
		
		int[] num1= {1,2,3,4};
		int[] num2 = {1,2,3,4};
		
		boolean equal = true;
		
		if(num1.length==num2.length)
		{
			for(int i = 0 ; i<num1.length ; i++ )
			{
				if(num1[i]!=num2[i])
				{
					equal = false;
				}
			}
		}
		else
		{
			equal = false;
		}
		
		if(equal)
		{
			System.out.println("The two Arrays are equal");
		}else
		{
			System.out.println("The two Arrays are not equal");
		}

	}

}
