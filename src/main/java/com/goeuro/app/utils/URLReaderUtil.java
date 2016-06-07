/*
 * 
 */
package com.goeuro.app.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

// TODO: Auto-generated Javadoc
/**
 * The Class URLReaderUtil.
 */
public class URLReaderUtil {
	
	/**
	 * Read url.
	 *
	 * @param urlString the url string
	 * @return the string
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static String readUrl(String urlString) throws IOException {
		BufferedReader reader = null;
		try {
			URL url = new URL(urlString);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			while ((read = reader.read(chars)) != -1)
				buffer.append(chars, 0, read);

			return buffer.toString();
		} finally {
			if (reader != null)
				reader.close();
		}
	}
}
