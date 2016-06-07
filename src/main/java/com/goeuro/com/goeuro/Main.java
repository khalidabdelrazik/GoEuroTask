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
		if (args.length == 1) {
			Country[] staff = gson
					.fromJson(
							ReadingUrlUtil
									.readUrl("http://api.goeuro.com/api/v2/position/suggest/en/"
											+ args[0]), Country[].class);
			System.out.println(staff.length);
		} else if (args.length > 1) {
			if ("-u".equals(args[0])) {
				Country[] staff = gson.fromJson(
						ReadingUrlUtil.readUrl(args[1]), Country[].class);
				System.out.println(staff.length);
			}
			if ("-o".equals(args[0])) {
				Country[] staff = gson.fromJson(
						ReadingUrlUtil.readUrl(args[1]), Country[].class);
				System.out.println(staff.length);
			} else if (args.length > 2) {
				if ("-u".equals(args[0])) {
					Country[] staff = gson.fromJson(
							ReadingUrlUtil.readUrl(args[1]), Country[].class);
					System.out.println(staff.length);
				}
				if ("-o".equals(args[0])) {
					Country[] staff = gson.fromJson(
							ReadingUrlUtil.readUrl(args[1]), Country[].class);
					System.out.println(staff.length);
				}
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
