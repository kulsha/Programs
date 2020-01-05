package String;

public class wordCountInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int word=1;
	      String s="My favourite football club is Barcelona";
	      char[] ch = s.toCharArray();
	      System.out.println(s.length());
	      
	      for(int i=0;i<s.length();i++)
	      {
	         if(ch[i]==' ')
	            word++;
	      }
	   
	      System.out.println("Number of words in the string is "+word);
	      System.out.println("Number of spaces in the string is "+(word-1));
		
		
	}

}
