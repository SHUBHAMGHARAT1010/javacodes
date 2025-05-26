package day_05;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import logger.AppLogger;

public class RemoveDuplicateFromString {

	private final static Logger log = AppLogger.getLogger(RemoveDuplicateFromString.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			while (true) {
				log.info("Enter the string (or Exit for to stop.)");

				String str = sn.nextLine().trim();

				if (str.equalsIgnoreCase("Exit")) {
					log.info("User wants to stop.");
					break;
				}
				if (str.isEmpty()) {
					log.warning("The string should not be null.");
					continue;
				}

				log.info("The original string : " + str);

				log.info("calling removeDuplicate method.");

				log.info("The modified string : " + RemoveDuplicateFromString.removeDuplicate(str));
			}
		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static String removeDuplicate(String str) {

		Set<Character> set = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (set.add(c)) {
				sb.append(c);
			}
		}
		return sb.toString();

	}
}
