package String;

public class swapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Shashank";
		String b="Kulkarni";
		System.out.println("Before Swap a = "+ a + " And B = " +b);
		a=a+" "+b;
		
		String[] s=a.split(" ");
		System.out.println("After swap a = "+s[1] + " And B= "+ s[0]);
	}

}
