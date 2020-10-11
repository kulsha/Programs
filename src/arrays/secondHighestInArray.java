package arrays;

public class secondHighestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = {112 , 50 , 98 , 45 , 85};
		int highest = 0;
		int second_highest = 0;
		
		for(int n : numbers)
		{
			if(highest < n)
			{
				second_highest = highest;
				highest = n ; 
			} 
			else if(second_highest < n)
			{
				second_highest = n;
			}
		}
		
		System.out.println("First max number " +highest);
		System.out.println("Second highest " +second_highest);
	}

}
