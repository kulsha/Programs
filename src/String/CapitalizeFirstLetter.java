package String;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		
		String s = "my name is shashank";
		String capitalized = "";
		String[] split = s.split(" ");
		
		for(String w :split)
		{
			String first = w.substring(0, 1);
			String afterFurst = w.substring(1);
			capitalized+= first.toUpperCase() + afterFurst+" ";
					
		}
				System.out.println(capitalized);
		

	}

}