package arrays;

public class moveZeroesToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num = {1,0,50,6,0,75,0,100,0,90};
		int j = 0;
		
		for(int i=0 ; i<=num.length-1 ; i++)
		{
			if(num[i]!=0)
			{
				num[j++]=num[i];
			}
		}
		
		while(j<num.length)
		{
			num[j++]=0;
		}
		
		for(int k = 0 ; k<j ; k++)
		{
			System.out.print(num[k] +" ");
		}
	}

}
