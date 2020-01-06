package arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4};
		int n = num.length;
		int j=n;
		int[] result = new int[n];
		
		for(int i = 0 ; i<n ; i++)
		{
			result[j-1] = num[i];
			j=j-1;
		}
		System.out.println("Reversed Array = ");
		for(int k = 0 ; k<n ; k++)
		{
			System.out.print(" " +result[k]);
		}

	}

}
