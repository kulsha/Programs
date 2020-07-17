package arrays;

public class MergeTwoSortedArrays {

	
	static void mergeArrays(int[] num1 , int[] num2 , int n1 , int n2 , int[] num3)
	{
		int i=0 , j=0 , k=0;
		
		while(i<n1 && j<n2)
		{
			if(num1[i]<num2[j])
			{
				num3[k++]=num1[i++];
			}else
			{
				num3[k++]=num2[j++];
			}
		}
		while(i<n1)
			num3[k++]=num1[i++];
		while(j<n2)
			num3[k++]=num2[j++];
	}
    public static void main(String[] args) {     

        int[] num1 = {1,3,5,7};
        int[] num2 = {2,4,6};
        		
        int n1=num1.length;
        int n2=num2.length;
        		
        int[] num3 = new int[n1+n2];
    	
        mergeArrays(num1 , num2 , n1 , n2 , num3);
        
    	for(int k=0 ; k<n1 ; k++)
    	{
    		System.out.print(" " +num3[k]);
    	}
    	System.out.println();
    	for(int k=n1 ; k<n1+n2 ; k++)
    	{
    		System.out.print(" " +num3[k]);
    	}
    }
	
	
	
}
