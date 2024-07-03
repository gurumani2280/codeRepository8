package org.pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M4b {
	
	public static void main(String[] args) {
		File myObj = new File(System.getProperty("user.dir") + File.separator + "filename.txt");
		// FileWriter myWriter = new FileWriter("filename.txt");
		FileWriter myWriter = null;
		try {
			myWriter = new FileWriter(myObj);
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing into file.");
			e.printStackTrace();
		} finally {
			try {
				if (myWriter != null) {
					myWriter.close();
				}
			} catch (IOException e) {
				System.out.println("An error occurred while closing the file.");
				e.printStackTrace();
			}
		}
	}

}
