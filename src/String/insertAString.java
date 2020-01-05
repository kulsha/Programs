package String;

public class insertAString {

	public static void main(String[] args) {
		
		
		String s = "Geeks for Geeks";
		String result= "";
		
		char[] ch = s.toCharArray();
		for(int i = 0 ; i<=ch.length-1 ; i++)
		{
			if(ch[i]==' ')
			{
				ch[i]='-';
				result+= ch[i];
			}else
			{
				result+= ch[i];
			}
			
		}
		System.out.println(result);
		

	}

}
