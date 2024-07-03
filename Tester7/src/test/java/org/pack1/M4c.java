package org.pack1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M4c {
	
	public static void main(String[] args) {
		try {
			File myObj = new File(System.getProperty("user.dir") + File.separator + "filename.txt");
			FileWriter myWriter = new FileWriter(myObj, true);
			BufferedWriter bWritter = new BufferedWriter(myWriter);
			bWritter.write("Files in Java might be tricky, but it is fun enough!");
			bWritter.newLine();
			bWritter.write("second line!!!");
			bWritter.close();
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
