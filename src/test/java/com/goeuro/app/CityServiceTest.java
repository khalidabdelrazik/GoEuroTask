package com.goeuro.app;

import java.io.File;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.goeuro.app.service.CityService;

// TODO: Auto-generated Javadoc
/**
 * The Class CityControllerTest.
 */
public class CityServiceTest {
	
	/** The city controller. */
	CityService cityService = new CityService();
	
	private final static String CITY_NAME = "Berlin";
	private final static String API_URL = " http://api.goeuro.com/api/v2/position/suggest/en";
	private final static String WRONG_API_URL = " http://api.goeuro.com/api/v2/position/";
	private final static String OUT_FILE= "Berlin.csv";
	private final static String WRONG_OUT_FILE = "\\ / : * ? \" < > |";

	/**
	 * Instantiates a new city controller test.
	 */
	public CityServiceTest() {
	}

	@Before
	public void init() {
		
	}
	@After
	public void destructor() {
		File file = new File(CITY_NAME + ".csv");
		if(file.exists()) {
			file.delete();
		}
		file = new File(OUT_FILE);
		if(file.exists()) {
			file.delete();
		}
	}
	/**
	 * Test read city name.
	 */
	@Test
	public void testReadCityName() {
		Assert.assertTrue(cityService.exprtCityData(CITY_NAME, null, null));
	}
	
	
	/**
	 * Test read city wrong api url.
	 */
	@Test
	public void testReadCityWrongApiURL() {
		Assert.assertFalse(cityService.exprtCityData(CITY_NAME, WRONG_API_URL, null));
	}
	
	/**
	 * Test read city api url output file.
	 */
	@Test
	public void testReadCityApiURLOutputFile() {
		Assert.assertTrue(cityService.exprtCityData(CITY_NAME, API_URL, OUT_FILE));
	}
	
	/**
	 * Test read city api url output file.
	 */
	@Test
	public void testReadCityApiURLWrongOutputFile() {
		Assert.assertFalse(cityService.exprtCityData(CITY_NAME, API_URL, WRONG_OUT_FILE));
	}
}
