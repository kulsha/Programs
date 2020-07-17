package String;

public class swapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "shashank";
		String s2 = "kulkarni";
		
		s1=s1+s2;
		System.out.println(s1);
		
		s2=s1.substring(0,s1.length()-s2.length());
		System.out.println("String s2 = " +s2);
		
		s1=s1.substring(s2.length());
		System.out.println("String s1 = "+s1);
		
		

		
		
		
/*		
		String a="Shashank";
		String b="Kulkarni";
		System.out.println("Before Swap a = "+ a + " And B = " +b);
		a=a+" "+b;
		
		String[] s=a.split(" ");
		System.out.println("After swap a = "+s[1] + " And B= "+ s[0]);
*/
	}

}
