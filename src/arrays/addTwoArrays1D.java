package arrays;

public class addTwoArrays1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {4,5,6,7};
		int[] b = {1,2,3};
		int[] sum = new int[a.length];
		
		for(int i = 0 ; i<=a.length-1 ; i++)
		{
			sum[i]=0;
		if(b.length > i)
		{
			sum[i] = a[i]+b[i];
			System.out.print(" " +sum[i]); 
			
		}
		else
		{
			sum[i] = a[i] + 0;
			System.out.print(" " + sum[i]);
		}
		
		
		}
	}

}
