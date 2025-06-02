package day_09;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class StrongNumber {

	private final static Logger log = AppLogger.getLogger(StrongNumber.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			log.info("Enter the number.");
			int num = sn.nextInt();
			log.info("The original number : " + num);

			log.info("Calling checkStrongNumber method.");
			if (checkStrongNumber(num))
				log.info(num + " is the strong number.");
			else
				log.info(num + " is not the strong number.");

		} catch (Exception e) {
			log.severe("Exception occured : " + e.getMessage());
			e.printStackTrace();
		}

		log.info("Main thread ended.");
	}

	public static boolean checkStrongNumber(int num) {

		int originalNumber = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;

			sum += factorial(digit);

			num /= 10;
		}

		return sum == originalNumber;
	}

	public static  int factorial(int num) {

		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}
