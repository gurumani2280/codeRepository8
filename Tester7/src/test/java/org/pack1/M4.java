package org.pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M4 {
	
	public static void main(String[] args) {
		try {
			File myObj = new File(System.getProperty("user.dir") + File.separator + "filename.txt");
			//FileWriter myWriter = new FileWriter("filename.txt");
			FileWriter myWriter = new FileWriter(myObj);
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.write("second line!!!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
