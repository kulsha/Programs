package arrays;

public class leftShiftArray {

	public static void main(String[] args) 
	{
		int[] num = {1,2,3,4,5};
		int first = num[0];
		int i ; 
		
		for(i = 0 ; i<num.length-1 ; i++)
		{
			num[i] = num[i+1];
			//System.out.print(num[i]);
		}
		
		num[i]=first;
		for(int j = 0 ; j<num.length ; j++)
		{
		System.out.print(" " +num[j]);
		}
	}

}
