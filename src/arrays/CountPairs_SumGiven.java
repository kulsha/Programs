package arrays;

public class CountPairs_SumGiven {

	public static void main(String[] args) {
		
    	int[] num = {4,10,5,7,2,3,9,6,0,8};
         int sum=12;
         int count=0;
         
         for(int i=0 ; i<num.length ; i++)
         {
        	 for(int j=i+1 ; j<num.length ; j++)
        	 {
        		 if(num[i]+num[j]==sum)
        		 {
        			 count++;
        			  System.out.println("The pair is "+num[i]+" "+num[j]);
        		 }
        	 }
        	
         }
         System.out.println("Count of pairs is " +count);
		

	}

}
