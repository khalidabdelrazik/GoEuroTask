package com.goeuro.app.service;

import java.io.IOException;

import org.slf4j.Logger;

import com.goeuro.app.constants.Constants;
import com.goeuro.app.logger.LoggerManager;
import com.goeuro.app.models.Country;
import com.goeuro.app.utils.CsvFileWriter;
import com.goeuro.app.utils.URLReaderUtil;
import com.google.gson.Gson;

// TODO: Auto-generated Javadoc
/**
 * The Class CityService.
 */
public class CityService {

	private static final Logger LOGGER = LoggerManager.getInstant().getLogger(
			CityService.class);;
	/** The gson. */
	Gson gson = new Gson();

	/**
	 * Exprt city data.
	 *
	 * @param cityName
	 *            the city name
	 * @param apiUrl
	 *            the api url
	 * @param outputFileName
	 *            the output file name
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
			outputFileName = String.format(
					Constants.DEFAULT_OUTPUT_FILE_FORMAT, cityName);
		}
		LOGGER.info("Exporting " + cityName + " Data from " + apiUrl
				+ " output file " + outputFileName);

		String cityData = "";
		try {
			cityData = URLReaderUtil.readUrl(apiUrl + "/" + cityName);
		} catch (IOException e) {
			LOGGER.error("Error with reading Data from " + apiUrl);
			return false;
		}
		if (cityData != null) {
			Country[] countries = gson.fromJson(cityData, Country[].class);
			if (countries != null) {
				if (!CsvFileWriter.writeCsvFile(outputFileName, countries))
					return false;
			} else {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}
}
