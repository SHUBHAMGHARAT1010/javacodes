package day_03;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class ConvertString {

	static private final Logger log = AppLogger.getLogger(ConvertString.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			log.info("Enter the string.");

			String str = sn.nextLine().trim();

			log.info("original User String :" + str);

			log.info("calling convertString method.");
			log.info("Updated String : " + ConvertString.convertString(str));

		} catch (Exception e) {
			log.severe(e.getMessage());
		}
		log.info("Main thread ended.");

	}

	public static String convertString(String str) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				sb.append(Character.toLowerCase(ch));

			} else if (ch >= 'a' && ch <= 'z') {
				sb.append(Character.toUpperCase(ch));
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();

	}

}
