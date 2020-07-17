package String;

public class ConvertOneStringToAnother {

	 static boolean isVowel(char c)
	{		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		return true;
		
		return false;
	}
	
	 static boolean checkPossibility( String s1 , String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1 != l2)
		{
			return false;
		}
		
		for(int i=0 ; i<l1 ; i++)
		{
			if(isVowel(s1.charAt(i))  && isVowel(s2.charAt(i)))
				continue;
			
			else if(!(isVowel(s1.charAt(i)))  && !(isVowel(s2.charAt(i))))
				continue;
			
			else
				return false;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		String s1 = "apptio";
		String s2 = "ezpgau";
		
		if(checkPossibility(s1,s2)==true)
			System.out.println("yes");
		else
			System.out.println("No");
	}

}
