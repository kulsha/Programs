package String;

public class findingCharactersInAString {

	public static void main(String[] args) 
	{
		String s = "H=7&o2L!a";
		String res="";
		
		for(int i = 0; i <s.length() ; i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
				res=res+s.charAt(i);
		}
	System.out.println(res);

	}

}
