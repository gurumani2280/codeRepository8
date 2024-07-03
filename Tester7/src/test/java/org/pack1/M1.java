package org.pack1;

import java.io.File;
import java.io.IOException;

public class M1 {

	public static void main(String[] args) throws IOException {
		File file = new File("myFile.txt");
		System.out.println(file.exists());
		if(file.exists()) {
			System.out.println("file myfile.txt already exit, so not creating again");
		} else {
			System.out.println(file.getName() + " file does not exit");
			System.out.println(file.createNewFile());
			System.out.println(file.getName() + " file created ");
		}
		System.out.println(file.exists());


	}

}
