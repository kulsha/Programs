package arrays;

public class RightShiftArray {

	public static void main(String[] args) {
		
		int[] num= {10,2,34,7};
		int last=num[3];
		int i ;
		
		for(i=num.length-1 ; i>0 ; i--)
		{
			num[i]=num[i-1];
		}
		num[i]=last;
		
		for(int j=0;j<num.length;j++)
		{
			System.out.print(" "+num[j]+" ");
		}
		

	}

}
