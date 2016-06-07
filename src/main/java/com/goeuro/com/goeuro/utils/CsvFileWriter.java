package com.goeuro.com.goeuro.utils;


import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ashraf
 * Copied this class from https://examples.javacodegeeks.com/core-java/writeread-csv-files-in-java-example/
 * 
 */
public class CsvFileWriter {
	
	private static final String NEW_LINE_SEPARATOR = "\n";
	
		//CSV file header
	private static final String FILE_HEADER = "_id,name,type,latitude,longitude";

	public static void writeCsvFile(String fileName, Object[] objects) {
		
		FileWriter fileWriter = null;
				
		try {
			fileWriter = new FileWriter(fileName);

			//Write the CSV file header
			fileWriter.append(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);
			
			//Write a new student object list to the CSV file
			for (Object object: objects) {
				fileWriter.append(object.toString());
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			
			
			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
			}
			
		}
	}
}