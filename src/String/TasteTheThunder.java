package String;

public class TasteTheThunder {

	public static void main(String[] args) {
																// reverse the word from the given string if it contains 't' only once	or thrice
																// if it has twice then do not reverse it
		String s = "taste the thunder";
		String[] split = s.split(" ");
		int count;
		
		for(int i=0 ; i<split.length; i++)
		{
			count=0;
			for(int j=0 ; j<split[i].length()-1 ; j++)
			{
				if(split[i].charAt(j)=='t')
				{
					count++;
				}
			
			}
			if(count==1 || count==3)
			{
				StringBuffer sb = new StringBuffer(split[i]);
				System.out.println(sb.reverse());
			}
		}

		
		

	}

}
