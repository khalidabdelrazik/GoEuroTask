package com.goeuro.app.service;

import java.io.IOException;

import com.goeuro.app.constants.Constants;
import com.goeuro.app.models.Country;
import com.goeuro.app.utils.CsvFileWriter;
import com.goeuro.app.utils.URLReaderUtil;
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
			cityName = Constants.DEFAULT_CITY_NAME;
		}
		if (apiUrl == null) {
			apiUrl = Constants.DEFAULT_REST_API_URL;
		}
		if (outputFileName == null) {
			outputFileName = String.format(Constants.DEFAULT_OUTPUT_FILE_FORMAT, cityName);
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
