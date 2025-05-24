package day_03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class OccurrencesOfString {

	private static final Logger log = AppLogger.getLogger(OccurrencesOfString.class);

	public static void main(String[] args) {

		log.info("Main thread started.");
		try (Scanner sn = new Scanner(System.in)) {
			while (true) {
				log.info("Enter the String(or EXIT to stop.)");
				String str = sn.nextLine().trim();

				if (str.equalsIgnoreCase("EXIT")) {
					log.info("User want to stop.");
					break;
				}

				if (str.isEmpty()) {
					log.warning("Invalid String entered. Please enter the valid string");
					continue;
				}

				log.info("Calling checkOccurrence methohd.");

				Map<Character, Integer> map = OccurrencesOfString.checkOccurrence(str);

				log.info("Inerating map to get the occurrence of the character in string.");
				Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();

				while (it.hasNext()) {
					Map.Entry<Character, Integer> entry = it.next();
					log.info(entry.getKey() + " : " + entry.getValue());
				}
			}
		} catch (Exception e) {
			log.severe("Exception occured : " + e.getMessage());
			e.printStackTrace();
		}
		log.info("Main thread ended.");

	}

	public static Map<Character, Integer> checkOccurrence(String str) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		return map;
	}
}
