package java_IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {

	public static void main(String[] args) throws IOException {
		
		try
		{
		FileInputStream fis = new FileInputStream("./Java_IO/FIS.txt");
		int i = fis.read();
		System.out.println((char)i);
		
		fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
