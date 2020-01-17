package arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 // acsending order 112 , 50 , 98 , 45 , 85
		      
		   int num[] = {37 , 25 , 30 , 65 , 5 , 50 , 14};
		   int temp;
		   for(int i = 0 ; i<num.length ; i++)
		   {
			   for(int j=i+1 ; j<num.length ; j++ )
			   {
				   if(num[i]>num[j])
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
		   System.out.println();
		   System.out.println(" Second Largest number is " +num[1]);
		   System.out.println(" Third Largest number is " +num[2]);
	   }
		
		
	}


