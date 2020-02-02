package String;

public class VowelConsonentCount_Identification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "shashank";
		String s = str.toLowerCase();
		char[] c = s.toCharArray();
		int vowel =0 , consonant = 0;
		
		for (char k : c)
		{
			if(k=='a' || k=='e' || k=='i' || k=='o' ||k=='u')
			{
				System.out.println(k + " is a vowel ");
				vowel++;
			}
			else
			{
				System.out.println(k + " is a consonant ");
				consonant++;
			}
		}
		System.out.println("The no of Vowels in the String are " +vowel);
		System.out.println("The no of Consonants in the String are " +consonant);
		
		String S1 = "shaSHAnK";
		int Ucount=0 ; 
				
		for(int i = 0 ; i<S1.length(); i++)
		{
			if(S1.charAt(i) >= 'A' && S1.charAt(i)<='Z')
			{
				System.out.print(S1.charAt(i) + " ");
				Ucount++;
				
			}
		}
		System.out.println("The no of UpperCase letters are " +Ucount);
	}

}
