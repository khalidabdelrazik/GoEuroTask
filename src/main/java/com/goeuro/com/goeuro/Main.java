package com.goeuro.com.goeuro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.goeuro.com.goeuro.models.AlternativeNames;
import com.goeuro.com.goeuro.models.Country;
import com.goeuro.com.goeuro.models.GeoPosition;
import com.goeuro.com.goeuro.models.Names;
import com.goeuro.com.goeuro.utils.ReadingUrlUtil;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) throws JsonSyntaxException,
			IOException {
		Gson gson = new Gson();
		Country[] staff = gson.fromJson(ReadingUrlUtil.readUrl("http://api.goeuro.com/api/v2/position/suggest/en/lannion"),
				Country[].class);
		System.out.println(staff.length);

	}
}
