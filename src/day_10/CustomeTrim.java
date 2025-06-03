package day_10;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class CustomeTrim {

	private static final Logger log = AppLogger.getLogger(CustomeTrim.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {

			log.info("Enter the string.");

			String str = sn.nextLine();

			log.info("The original String : " + str);

			log.info("Calling customerTrim method.");

			log.info("Trimed string : " + customerTrim(str));

		} catch (Exception e) {
			log.info("Exception Occured :" + e.getMessage());
			e.printStackTrace();
		}

		log.info("Main thread ended.");
	}

	public static String customerTrim(String str) {
		if (str == null || str.isEmpty())
			return str;

		int start = 0, end = str.length() - 1;

		while (start <= end && str.charAt(start) == ' ') {
			start++;
		}

		while (end >= start && str.charAt(end) == ' ') {
			end--;
		}

		return str.substring(start, end + 1);
	}
}
