package arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 // Descending order
		   
		   
		   int num[] = {11 , 25 , 30 , 65 , 5 , 50 , 14};
		   int temp;
		   for(int i = 0 ; i<num.length ; i++)
		   {
			   for(int j=i+1 ; j<num.length ; j++ )
			   {
				   if(num[i]<num[j])
				   {
					   temp = num[i];
					   num[i]=num[j];
					   num[j]=temp;
				   
				   }
				   
			   }
		  
		   }  
		   for(int k:num)
		   {
			   System.out.print(" "+k+" ");
		   } 
		   
	   
	   }
		
		
	}


