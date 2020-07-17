package java_IO;

import java.io.FileOutputStream;

public class FOS {

	public static void main(String[] args) {

		try
		{
			FileOutputStream fos = new FileOutputStream("./Java_IO/FOS.txt");
			fos.write(65);
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
