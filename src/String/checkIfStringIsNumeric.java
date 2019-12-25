package String;

public class checkIfStringIsNumeric 
{
	public static void main(String[] args)
	{
		String string = "-12A4.15";
        boolean numeric = true;
        numeric = string.matches("-?\\d+(\\.\\d+)?");
       
        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
						
//        -? allows zero or more - for negative numbers in the string.
//        		\\d+ checks the string must have atleast 1 or more numbers (\\d).
//        		(\\.\\d+)? allows zero or more of the given pattern (\\.\\d+) in which
//        		\\. checks if the string contains . (decimal points) or not
//        		If yes, it should be followed by at least one or more number \\d+.
//			
	}
}
