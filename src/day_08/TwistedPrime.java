package day_08;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class TwistedPrime {

	static private final Logger log = AppLogger.getLogger(TwistedPrime.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {

			log.info("Enter the number.");
			int num = sn.nextInt();

			log.info("Calling isTwistedPrime method.");

			if (isTwistedPrime(num))
				log.info(num + " is the twisted prime.");
			else
				log.info(num + " is not the twisted prime.");

		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}
		log.info("Main thread ended.");
	}

	public static boolean isPrime(int num) {
		log.info("isPrime method.");
		if (num <= 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int reverse(int num) {
		log.info("reverse method.");
		int reverse = 0;

		while (num > 0) {
			reverse = reverse * 10 + (num % 10);

			num /= 10;
		}
		return reverse;
	}

	public static boolean isTwistedPrime(int num) {
		return isPrime(num) && isPrime(reverse(num));
	}
}
