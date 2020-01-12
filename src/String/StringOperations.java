package String;

public class StringOperations {

	public static void main(String[] args) {
		
		//Immutable String
		String s = "shashank";
		String k =	s.concat("kulkarni");
		System.out.println(k);
		
		// String comparison
		String s1 = "shashank";
		String s2 = "SHASHANK";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		//Lexicographically strings
		String s3 = "shashank";
		String s4 = "shashank";
		String s5 = "shashanq";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		
		
		//Substrings
		String s6 = "shashankkulkarni";
		System.out.println(s6.substring(8));
		System.out.println(s6.substring(4,12));
		
		//replace
		String s7 = "shashank";
		System.out.println(s7.replace("s" , "n"));
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append('c');
		System.out.println(sb);
		sb.replace(1, 2, "sara");
		System.out.println(sb);
	}

}
