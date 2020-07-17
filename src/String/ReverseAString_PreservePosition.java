package String;

public class ReverseAString_PreservePosition {

	public static void main(String[] args) {
		
		String s = "My name is shashank";
		char[] ch = s.toCharArray();
		char[] result = new char[ch.length];
		
		for(int i=0 ; i<ch.length ; i++)
		{
			if(ch[i]==' ')
			{
				result[i]=' ';
			}
		}
		
		int j=result.length-1;
		
		for(int i=0 ; i<ch.length ; i++)
		{
			if(ch[i]!=' ')
			{
				if(result[j]== ' ')
				{
					j--;
				}
				result[j]=ch[i];
				j--;
			}
			
		}

		for(int k=0 ; k<result.length ; k++)
		{
			System.out.print(" "+result[k]);
		}
		
	}

}
