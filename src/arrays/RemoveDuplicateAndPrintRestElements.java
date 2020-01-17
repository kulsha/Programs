package arrays;

import java.util.Arrays;

public class RemoveDuplicateAndPrintRestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,1,2,3,6,8,6,4,5,7,4,3};
		int len = arr.length;
		Arrays.sort(arr); //{1,2,2,3,3,4,4,5,6,6,7,8 }
		int j=0;
		
		for(int i = 0 ; i<len-1 ; i++)
		{
				if(arr[i] != arr[i+1])
				{
					arr[j++] = arr[i];
					
				}	
		}
		arr[j++] = arr[len-1];
	
		for(int k = 0 ; k<j ; k++)
		{
			System.out.print(arr[k] + " ");
		}
		
	}	
	}


