package day_03;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class NivenNumber {

	private static final Logger log = AppLogger.getLogger(NivenNumber.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			log.info("Enter the number.");
			int num = sn.nextInt();

			log.info("The user entered number : " + num);

			log.info("Calling isNivenNumber method.");

			if (NivenNumber.isNivenNumber(num))
				log.info(num + " is the Niven/Harshad number.");
			else
				log.info(num + " is not the Niven/Harshad Number.");

		} catch (Exception e) {

		}
	}

	public static boolean isNivenNumber(int num) {
		if(num==0) return false;
		int original = num;

		int sum = 0;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}

		return original % sum == 0;
	}

}
