
public class noOfSquaresInAGrid_noOfSquaresinChessBoard {

	static void countSquares(int n)
	{					// 'n' is the no of grid - for ex 3x3 or 2x2
		int squares=0 ;
		
		for(int i = 1 ; i<=n ; i++)
		{
			squares += Math.pow(i, 2);
		}
		System.out.println("No of Squares = "+squares);
	}
	
	
	public static void main(String[] args)
	{
			countSquares(3);
	}

}
