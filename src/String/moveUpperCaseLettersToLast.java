package String;

public class moveUpperCaseLettersToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I Love mY Country ";
		String lower = "";
		String upper = "";
		char[] ch = s.toCharArray();
			
		for(int i = 0 ; i<s.length()-1; i++)
		{
			if(ch[i]>= 'A' && ch[i]<='Z')
				upper+=ch[i];
			else
				lower+=ch[i];
		}
		System.out.println(lower+upper);
	}
	

}
