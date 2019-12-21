package String;

public class whiteSpacesRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = " My name is Shashank      ";
		String str = s.replaceAll("\\s", "");
		
		System.out.println(str);
		
		
	}

}
