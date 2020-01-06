package arrays;

public class practice 
{
	
	public static void main(String[] args)
	{
		int[] a = {4,3,5,8,7,1,2};
		int[] b = {4,7,2};			
		
		for(int i = 0; i<a.length ; i++)
		{
			for(int j=0 ;j<b.length ; j++ )
			{
				if(a[i]==b[j])
				{
					System.out.print(" " +a[i]);
				}
			}
		}
		
	}
}
	
		
		