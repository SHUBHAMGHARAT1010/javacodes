package day_01;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class ReverseString {

	private final static Logger log = AppLogger.getLogger(ReverseString.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			log.info("Enter the string value.");

			String str = sn.nextLine().trim();
			log.info("original string : " + str);
			log.info("Calling reverseString method.");

			String reverseString = ReverseString.reverseString(str);

			log.info("Reversed the String : " + reverseString);

		}
		log.info("Main thread ended.");

	}

	public static String reverseString(String str) {

		if (str == null || str.isEmpty())
			return str;

		StringBuilder sb = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();

//		 return new StringBuilder(str).reverse().toString();
	}
}
