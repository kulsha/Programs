	package arrays;

public class DuplicateArrayElementsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int num[] = {10 , 100 , 20 , 25 , 25 , 10 , 65 , 20};
	
	for(int i =0 ; i<num.length ; i++)
	{
		for(int j = i+1 ; j<num.length ; j++)
		{
			if(num[i]==num[j])
			{
				System.out.println("Duplicate numbers are " +num[j]);
			}
		}
	}
		
	
		
		
	}

}
