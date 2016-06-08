/*
 * 
 */
package com.goeuro.app;

import java.io.IOException;

import org.slf4j.Logger;

import com.goeuro.app.logger.LoggerManager;
import com.goeuro.app.service.CityService;
import com.google.gson.JsonSyntaxException;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class Main {
	private static final Logger LOGGER = LoggerManager.getInstant().getLogger(
			Main.class);;
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws JsonSyntaxException the json syntax exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws JsonSyntaxException,
			IOException {
		String cityName = null;
		String apiUrl = null;
		String outputFileName = null;
		CityService cityController = new CityService();
		if (args.length > 0) {
			if (args.length == 1) {
				cityName = args[0];
			} else if (args.length > 1) {
				for (int i = 0; i < args.length; i++) {
					String arg = args[i];
					if ("-o".equals(arg) && i + 1 < args.length) {
						outputFileName = args[++i];
					} else if ("-u".equals(arg) && i + 1 < args.length) {
						apiUrl = args[++i];
					} else {
						cityName = arg;
					}
				}

			}
			if(cityController.exprtCityData(cityName, apiUrl, outputFileName)) {
				LOGGER.info("Exporting " + cityName + " Data from " + apiUrl
						+ " output file " + outputFileName + " done successfully");

			} else {
				LOGGER.info("Exporting " + cityName + " Data from " + apiUrl
						+ " output file " + outputFileName + " failed");
			}
		} else {
			System.out
					.println("--help for help\n"
							+ "CITYNAME add city name \n"
							+ "-u Optional to add a new url to REST api with city name\n"
							+ "-o Optional output file");
		}

	}
}
 	