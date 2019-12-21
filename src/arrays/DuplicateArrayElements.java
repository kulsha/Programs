package arrays;

public class DuplicateArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strArray[] = {"shashank" , "abcd" , "qwert" , "asdasfc" , "shashank" , "asd" , "asdf" , "singh" };
		String temp;
		
		for(int i = 0 ; i <strArray.length-1 ; i++)
		{
			for(int j=i+1 ; j<strArray.length ; j++)
			{
				if(strArray[i].equals(strArray[j]))
				{
					System.out.println("The duplicate Array element is " +strArray[j]);
					
				}
			}
		}
		
		
		
		
	}

}
