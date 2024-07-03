package org.pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class M5b {
	
	public static void main(String[] args) {
		try {
			File file = new File(System.getProperty("user.dir") + File.separator + "filename.txt");
			FileReader fReader= new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String line;
			while ((line = bReader.readLine() )!= null) {
				
				System.out.println(line);
			}
			fReader.close();
			bReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
