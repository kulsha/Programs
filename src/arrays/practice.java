package arrays;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class practice 
{

	public static void main(String[] args)
	{
		
		String s1 = "Iamagoodboy";
		String s2 = "goodboyaaI";
		String s3 = "";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not rotated");
		}
		else
		{
			s3=s1+s2;
			System.out.println(s3);
			if(s3.contains(s2))
			{
				System.out.println("rotated");
				
			}else
			{
				System.out.println("not rotated");
			}
		}
		
	}
}
	
			
		