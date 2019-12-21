
public class distanceBetTwoCartesianPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1 = 2 , x2 =3 , y1=4 , y2=5 ;
		double distance ; 
		distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		System.out.println("The distance between two points is " +distance);
		
	}

}
