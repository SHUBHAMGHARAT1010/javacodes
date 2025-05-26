package day_04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;


import logger.AppLogger;

public class NonRepeatingCharacter {

	private static final Logger log = AppLogger.getLogger(NonRepeatingCharacter.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			while (true) {
				log.info("Enter the user input (or enter exit to stop.)");

				String str = sn.nextLine().trim();

				if (str.equalsIgnoreCase("Exit")) {
					log.info("User wants to stop.");
					break;
				}

				if (str.isEmpty()) {
					log.warning("Enter the valid input string should not null.");
					continue;
				}
				
				log.info("Calling checkRepeatingElement method.");
				
				Character ch=NonRepeatingCharacter.checkRepeatingElement(str);
				
				if(ch == null) {
					log.info("No repeating character found.");
				}else log.info(ch + " is the first non repeating character.");
				

			}
		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}
	}
	public static Character checkRepeatingElement(String str) {

		Map<Character, Integer> map = new LinkedHashMap<>();

		
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				return entry.getKey();

			}
		}
		
		return null;
	}

}
