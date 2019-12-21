package String;

public class wordCountInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int word=1;
	      String str="My favourite football club is Barcelona";
	      System.out.println(str.length());
	      for(int i=0;i<str.length();i++)
	      {
	         if(str.charAt(i)==' ')
	            word++;
	      }
	   
	      System.out.println("Number of words in the string is "+word);
	      System.out.println("Number of spaces in the string is "+(word-1));
		
		
	}

}
