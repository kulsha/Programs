package arrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.gargoylesoftware.htmlunit.javascript.host.performance.PerformanceMeasure;

public class practice 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		
		int num[] = {1,2,3,4,5,6,7};
		int j=num.length;
		int result[] = new int[num.length];
		
		for(int i=0 ; i<num.length ; i++)
		{
			result[j-1]=num[i];
			j=j-1;
		}
	
		for(int k=0 ; k<num.length ; k++)
			System.out.print(" "+result[k]);
		
	}
}
	
			
		