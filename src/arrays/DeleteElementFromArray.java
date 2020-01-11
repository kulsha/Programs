package arrays;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7};
		int index = 2;
		int j=0;
		
		for(int i=0 ; i<num.length ; i++)
		{
			if(index==i)
			{
				continue;
			}else
			{
				num[j++]=num[i];
			}
		}
		for(int k =0 ; k<j ; k++)
		{
			System.out.print(" " +num[k]);
		}
		

	}

}
