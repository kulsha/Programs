package String;

public class CharacterOccurencesInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
											// Program to count character occurrences and remove the duplicate chars
		
		String s = "shashank";
		char ch[] = s.toCharArray();
		int count ; 
		for(int i=0 ; i<=s.length()-1 ; i++)
		{
			count=1;
			for(int j = i+1 ; j<s.length() ; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j] = ' ';
				}
			}
		
			if(ch[i]!= ' ')
			{
				//System.out.print(" "+ch[i]);
			System.out.println("Number of occurences of character " +ch[i]+" is " +count);
			
			}
		
		}
	}

}
