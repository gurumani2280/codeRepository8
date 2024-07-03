package org.pack1;

import java.io.File;
import java.io.IOException;

public class M2 {

	public static void main(String[] args) throws IOException {
		File file = new File("myFile.txt");
		System.out.println(file.exists());
		if (file.exists()) {
			System.out.println("is a File " + file.isFile());
			System.out.println("File name: " + file.getName());
			System.out.println("Absolute path: " + file.getAbsolutePath());
			System.out.println("Writeable: " + file.canWrite());
			System.out.println("Readable " + file.canRead());
			
			System.out.println("File size in bytes " + file.length());
			file.delete();
		} else {
			System.out.println(file.getName() + " file does not exit");
		}
		System.out.println(file.exists());

	}

}
