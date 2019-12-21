import java.util.Arrays;

public class Anagram {

	static void anagram(String str1 , String str2)
	{
	
		str1 = str1.toLowerCase().replaceAll("\\s", "");
		str2 = str2.toLowerCase().replaceAll("\\s", "");
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean status;
		status = Arrays.equals(ch1, ch2);
		
		if(status)
		{
			System.out.println("arrays are anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		anagram("shashank" , "Shan n kSHA");
		
	}

}
