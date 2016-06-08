package com.goeuro.app.utils;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;

import com.goeuro.app.logger.LoggerManager;
import com.goeuro.app.service.CityService;

/**
 * @author ashraf
 * Copied this class from https://examples.javacodegeeks.com/core-java/writeread-csv-files-in-java-example/
 * 
 */
public class CsvFileWriter {
	private static final Logger LOGGER = LoggerManager.getInstant()
			.getLogger(CsvFileWriter.class);;
	private static final String NEW_LINE_SEPARATOR = "\n";
	
		//CSV file header
	private static final String FILE_HEADER = "_id,name,type,latitude,longitude";

	public static boolean writeCsvFile(String fileName, Object[] objects) {
		
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

			
			
			LOGGER.info("CSV file " + fileName + " was created successfully !!!");
			
		} catch (FileNotFoundException e) {
			LOGGER.error("Error in CsvFileWriter !!!");
			return false;
		} catch (IOException e) {
			LOGGER.error("Error in CsvFileWriter !!!");
			return false;
		} finally {
			
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				LOGGER.error("Error while flushing/closing fileWriter !!!");
				return false;
			}
			
		}
		return true;
	}
}