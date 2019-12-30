package String;

public class reversalOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "My name is Shashank";
		String reverse = "";
		String[] split = s.split(" ");
		
		char[] ch = s.toCharArray();
		String word = "";
		String rev = "";
		
		for(int i = split.length -1 ; i>=0 ; i--)
		{
			reverse += (split[i]+ " ");
		}
		System.out.println(reverse);
		
		for(int j=ch.length -1 ; j>=0 ; j--)
		{
			word+= ch[j] + "";
		}
		System.out.println(word);
		
		String[] s1=word.split(" ");
		for(int k = s1.length-1 ; k>=0 ; k--)
		{
			rev+= s1[k] + " ";
		}
		System.out.println(rev);
	}
}
