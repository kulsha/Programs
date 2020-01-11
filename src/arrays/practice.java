package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practice 
{
	
	public static void main(String[] args)
	{
		String s1= "aaaaabbbbbbbcccdddddeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
		int count;
		
		for(int i=0 ; i<s1.length() ; i++)
		{
			count=1;
			while(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1))
			{
				count++;
				i++;
			}
			System.out.print(s1.charAt(i));
			System.out.print(count);
		}
		
		
	}
}
	
		
		