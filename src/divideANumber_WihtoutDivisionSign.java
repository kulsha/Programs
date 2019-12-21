
public class divideANumber_WihtoutDivisionSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int num1 = 10 , num2 =3 ;
		   int quotient = 0 ;
		   
		   while(num1>=num2)
		   {
			   num1 = num1 - num2;
			   quotient++;
		   }
		   
		   System.out.println("quotient is " +quotient);
		   System.out.println("remainder is " +num1);
		
	}

}
