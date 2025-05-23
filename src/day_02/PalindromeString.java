package day_02;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class PalindromeString {

	private final static Logger log = AppLogger.getLogger(PalindromeString.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			while(true) {
			log.info("Enter a string to check palindrome (or type 'EXIT' to quit):");
			String str = sn.nextLine().trim();
			
			if(str.equalsIgnoreCase("ExIT")) {
				log.info("User requested to exit.");
				break;
			}
			
			if(str.isEmpty()) {
				log.warning("Empty input provided. Please enter a valid string.");
				continue;
			}
			
			log.info("String : " + str);
			
			log.info("Calling checkPalindrome method.");
			
			if(PalindromeString.checkPalindrome(str))
				log.info("Yes string is palindrome.");
			else log.info("String is not palindrome.");
			}
		}catch(Exception e) {
			log.severe(e.getMessage());
		}
		log.info("Main thread ended.");
	}

	public static boolean checkPalindrome(String str) {
		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	}
}
