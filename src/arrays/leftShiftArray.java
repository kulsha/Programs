package arrays;

public class leftShiftArray {

	public static void main(String[] args) 
	{
		int[] num = {1,2,3,4,5,6,7};
		int n=4;
		int temp;
		
		for(int i=0 ; i<n ; i++)
		{
			temp=num[0];
			for(int j=0 ; j<num.length-1 ; j++)
			{
				num[j]=num[j+1];
			}
			num[num.length-1]=temp;
		}
		
		for(int k=0 ; k<num.length ; k++)
		{
			System.out.print(" "+num[k]);
		}
		
	}

}
