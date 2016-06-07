package com.goeuro.com.goeuro.controller;

import java.io.IOException;

import com.goeuro.com.goeuro.constants.Constants;
import com.goeuro.com.goeuro.models.Country;
import com.goeuro.com.goeuro.utils.CsvFileWriter;
import com.goeuro.com.goeuro.utils.URLReaderUtil;
import com.google.gson.Gson;

// TODO: Auto-generated Javadoc
/**
 * The Class CityService.
 */
public class CityService {

	/** The gson. */
	Gson gson = new Gson();

	/**
	 * Exprt city data.
	 *
	 * @param cityName the city name
	 * @param apiUrl the api url
	 * @param outputFileName the output file name
	 * @return true, if successful
	 */
	public boolean exprtCityData(String cityName, String apiUrl,
			String outputFileName) {
		if (cityName == null) {
			cityName = Constants.CITY_NAME;
		}
		if (apiUrl == null) {
			apiUrl = Constants.REST_API_URL;
		}
		if (outputFileName == null) {
			outputFileName = Constants.OUTPUT_FILE;
		}
		String cityData  = "";
		try {
			cityData = URLReaderUtil.readUrl(apiUrl + "/" + cityName);
		} catch (IOException e) {
			
		} 
		Country[] countries = gson.fromJson(cityData, Country[].class);
		CsvFileWriter.writeCsvFile(outputFileName, countries);
		return true;
	}
}
