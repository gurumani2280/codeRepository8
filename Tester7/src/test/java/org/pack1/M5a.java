package org.pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class M5a {
	
	public static void main(String[] args) {
		try {
			File file = new File(System.getProperty("user.dir") + File.separator + "filename.txt");
			FileReader fReader= new FileReader(file);
			long bytes = file.length();
			char[] chars = new char[(int)bytes];
			fReader.read(chars);
			String fileContent=new String(chars);
			System.out.println(fileContent);
			fReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
