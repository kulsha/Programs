package String;

public class StringPermutation {

	public static void main(String[] args) {
		String s = "shashank";
		int len = s.length();
		String[] permutation = new String[len*(len+1)/2];
		int temp=0;
		
		for(int i=0 ; i<len ; i++)
		{
			for(int j=i ; j<len ; j++)
			{
				permutation[temp] = s.substring(i, j+1);
				temp++;
			}
		}

		System.out.println(permutation.length);
		for(int k=0 ; k<permutation.length ; k++)
		{
			System.out.println(permutation[k]);
		}
		
	}

}
