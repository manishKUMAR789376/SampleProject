package exceptions;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;


public class FileAccessing {
	public static void main(String[] args) {
		String fileName="D:\\Sample\\msg.txt";
		try {
			
			Path file=Paths.get(fileName);
			BasicFileAttributes attr=Files.readAttributes(file, BasicFileAttributes.class);
			System.out.println("create Time :"+attr.creationTime());
			System.out.println("last Access time :"+attr.lastAccessTime());
			System.out.println("last modification :"+ attr.lastModifiedTime());
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
