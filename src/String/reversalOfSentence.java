package String;

public class reversalOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I love coding very much";
		String result = "";
		String[] split = s.split(" ");
		
		for(int i = split.length -1 ; i>=0 ; i--)
		{
			result = result + (split[i]+ " ");
		}
		System.out.println(result.trim());
	}

}
