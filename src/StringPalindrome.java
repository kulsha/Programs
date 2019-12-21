
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		String rev = "";
		
		char ch[] = str.toCharArray();
		for(int i=ch.length-1 ; i>=0 ; i--)
		{
			rev = rev + ch[i];
		}
		System.out.println("The reverse of the string is  " +rev);
		
		if(str.equals(rev))	
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
