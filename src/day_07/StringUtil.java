package day_07;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class StringUtil {

	private static final Logger log = AppLogger.getLogger(StringUtil.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {

			while (true) {
				log.info("Enter the String (or Exit to stop.)");
				log.info("Enter the first string.");

				String str1 = sn.nextLine().trim();

				log.info("The first string : " + str1);
				log.info("Enter the second string.");

				String str2 = sn.nextLine().trim();
				if (str1.equalsIgnoreCase("Exit") || str2.equalsIgnoreCase("Exit")) {
					log.info("User wants to stop.");
					break;
				}

				log.info("The second string : " + str2);

				log.info("Calling equalsIgnoreCase method.");

				if (StringUtil.equalsIgnoreCase(str1, str2))
					log.info("Yes both are equals.");
				else
					log.info("Both are not equals.");
			}
		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}
		log.info("Main thread ended.");
	}

	public static boolean equalsIgnoreCase(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return str1 == str2; // both null return true ; one null return false;
		}

		if (str1.length() != str2.length()) {
			return false; // if the length is different return false;
		}

		for (int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);

			log.info("Calling toLowerCase method to convert the character into lowercase.");
			if (toLowerCase(ch1) != toLowerCase(ch2)) {
				return false;
			}
		}
		return true;

	}

	private static char toLowerCase(char ch) {
		if (ch >= 'A' && ch <= 'Z') {
			return (char) (ch + 32);
		}
		return ch;
	}
}
