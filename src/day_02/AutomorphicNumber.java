package day_02;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class AutomorphicNumber {

	private final static Logger log = AppLogger.getLogger(AutomorphicNumber.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {

			while (true) {
				log.info("Enter the user choice want to check then enter number if no enter EXIT.");
				String str = sn.nextLine();
				if(str.equalsIgnoreCase("EXIT")) break;

				log.info("Use input : " + str);
				log.info("Calling getRaise method.");

				int count = AutomorphicNumber.getRaise(str);
				log.info("The raise of the given number : " + count);

				log.info("Calling square method.");

				int square = AutomorphicNumber.square(str);
				log.info("Square of the " + str + " is : " + square);

				log.info("Calling checkAutomorphic method.");
				if (AutomorphicNumber.checkAutomorphic(str, square, count))
					log.info(str + " is automorphic number.");
				else
					log.info(str + " is not the automorphic number.");
			}

		} catch (Exception e) {
			log.severe(e.getMessage());
		}
		log.info("main thread ended.");


	}

	public static boolean checkAutomorphic(String str, int square, int count) {

		int num = Integer.parseInt(str);
		int digit = square % count;
		return digit == num;
	}

	public static int square(String str) {
		int num = Integer.parseInt(str);
		return num * num;

	}

	public static int getRaise(String str) {
		return (int) Math.pow(10, str.length());
	}
}
