package String;

public class mostRepeatedCharInAString {
											// Most repeated character  
	public static void main(String[] args)
	{
		String s = "shashank"; // "ababbc";
		char[] c = s.toCharArray();
		int count;
		int maxCount=0;
		char k= ' ';
		
		for(int i = 0 ; i<c.length -1 ; i++)
		{
			count=0;
			for(int j=i+1 ; j<c.length ; j++)
			{
				if(c[i]==c[j])
					count++;
			}
			if(count>maxCount)
			{
				maxCount=count;
				k = c[i];
			}
		}
		System.out.print(k);

	}

}
