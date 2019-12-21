package arrays;

public class commonElementsBet2Arrays {

	public static void main(String[] args) 
	{
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {6,2,8,9,10,3,1};
		
	
		for(int i = 0 ; i<num1.length ; i++)
		{
			for(int j = 0 ; j<num2.length ; j++)
			if(num1[i]==num2[j])
			{
				System.out.print(" "+num1[i]);
			}
		}
		
	}

}
