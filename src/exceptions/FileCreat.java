package exceptions;

import java.io.File;
import java.io.IOException;

public class FileCreat {
	public static void main(String[] args) {
	File file = new File("D:\\Sample\\msg.txt");
	boolean result;
	try
	{
		result = file.createNewFile();
		if(result) {
			System.out.println("file created "+file.getCanonicalPath());
		}
		else {
			System.out.println("File already exist at location "+file.getCanonicalPath());
		}
	}
	catch(IOException e) {
		e.printStackTrace();
	}
		
		
	}

}
