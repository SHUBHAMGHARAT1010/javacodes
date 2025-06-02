package day_07;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class SpyNumber {

	private static final Logger log = AppLogger.getLogger(SpyNumber.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {

			log.info("Enter the number.");

			int num = sn.nextInt();

			if (num < 0) {
				log.warning("Number should not negative.");
				return;
			}

			log.info("Calling checkSpy method.");

			if (SpyNumber.checkSpy(num)) {
				log.info(num + " is the spy number.");
			} else {
				log.info(num + " is not the spy number.");
			}

		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}

		log.info("Main thread ended.");
		return;
	}

	public static boolean checkSpy(int num) {
		if (num == 0)
			return true;
		int originalNum = num;
		int product = 1;
		int sum = 0;

		while (num > 0) {
			int digit=num%10;
			product *=digit;
			sum += digit;
			num /= 10;

		}
		log.info("The product of " + originalNum + " is : " + product);
		log.info("The sum of " + originalNum + " is : " + sum);
		return sum == product;

	}
}
