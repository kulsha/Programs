package arrays;

public class frequencyOfAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {100, 200 , 100 , 300 , 100, 200, 100, 500};
		int count;
		
		for(int i = 0 ; i<num.length ; i++ )
		{
			count=1;
			for(int j=i+1 ; j<num.length ; j++)
			{
				if(num[i]==num[j])
				{
					count++ ; 
					num[j] = ' ';
				}
			}
			if(num[i]!=' ')
			{
				System.out.println(num[i]);
				//System.out.println("Number of occurences of " + num[i] + " is " +count);
			}
			
		}
		
	}

}
