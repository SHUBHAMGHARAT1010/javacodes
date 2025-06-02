package day_09;

import java.util.logging.Logger;

import logger.AppLogger;

public class RemoveWhiteSpaces {

	final private static Logger log = AppLogger.getLogger(RemoveWhiteSpaces.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		String str = "My name is shubham gharat.";
		log.info("Original string : " + str);
		String modify=str.replaceAll("\\s", "");

		log.info("The modified string : " + modify);

		log.info("Main thread ended.");

	}
}
