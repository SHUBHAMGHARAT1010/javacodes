package day06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class RunLengthEncoding {

	private static final Logger log = AppLogger.getLogger(RunLengthEncoding.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			while (true) {
				log.info("Enter string value.");
				String str = sn.nextLine().trim();
				if (str.equalsIgnoreCase("Exit")) {
					log.info("User wants to stop.");
					break;
				}
				if (str.isEmpty()) {
					log.warning("String should not be null.");
					continue;
				}

				log.info("The original string : " + str);

				log.info("Calling encodeString method.");
				String encodeString = RunLengthEncoding.encodeString(str);

				log.info("The encoded string : " + encodeString);

				log.info("Calling encode method.");
				String encode = RunLengthEncoding.encode(str);
				log.info("The encode string : " + encode);
			}
		} catch (Exception e) {
			log.severe("Exception Occured :" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static String encodeString(String str) {
		Map<Character, Integer> map = new LinkedHashMap<>();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(entry.getValue()).append(entry.getKey());
		}

		return sb.toString();
	}

	public static String encode(String str) {

		int count = 1;
		StringBuilder sb = new StringBuilder();
		char currentCharacter = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == currentCharacter) {
				count++;
			} else {
				sb.append(count).append(currentCharacter);
				currentCharacter = str.charAt(i);
				count = 1;
			}
		}

		sb.append(count).append(currentCharacter);

		return sb.toString();
	}
}
