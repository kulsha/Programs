package String;

public class OneStringIsRotationOfAnother {

	public static void main(String[] args) {
																			// To check if one string is rotation of another
		String s1 = "ILoveHer";
		String s2 = "LoveHerI";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("s2 is not rotated version of s1");
		}
		else
		{
			String s3=s1+s2;
			System.out.println(s3);
			if(s3.contains(s2))
			{
				System.out.println("s2 is rotated version of s1");
			}
			else
			{
				System.out.println("s2 is not rotated version of s1");
			}
			
		}
		

	}

}
