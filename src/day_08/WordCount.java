package day_08;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class WordCount {

	private static final Logger log = AppLogger.getLogger(WordCount.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {

			log.info("Enter the string.");

			String str = sn.nextLine().trim();

			log.info("The original string : " + str);

			String[] count = str.trim().split("\\s+");
			log.info("Count string : "+Arrays.toString(count));
			log.info("The count of the words : " + count.length);

			log.info("Main thread ended.");

		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}
	}
}
