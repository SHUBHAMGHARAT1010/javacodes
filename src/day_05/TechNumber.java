package day_05;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class TechNumber {

	private static final Logger log = AppLogger.getLogger(TechNumber.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {
			while (true) {
				log.info("Enter the number(Or Exit to stop.)");
				String str = sn.nextLine().trim();
				if (str.equalsIgnoreCase("EXIT")) {
					log.info("User wants to stop.");
					break;
				}

				if (str.isEmpty()) {
					log.warning("String should not be null.");
					continue;
				}
				log.info("Calling checkTechNumber method. ");

				if (TechNumber.checkTechNumber(str)) {
					log.info(str + " is the tech number.");
				} else
					log.info(str + " is not the tech number.");
			}
		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static boolean checkTechNumber(String num) {
		int length =num.length();
		int square = 0;
		if (length%2 != 0) 
			return false;
			

		try {
			int number = Integer.valueOf(num);
			log.info("The int number : " + number);

			int count = (int) Math.pow(10,length/2 ) ;

			log.info("The count of the given number : " + count);
			int num1 = number % count;
			log.info("The righ half : " + num1);
			int num2 = number / count;
			log.info("The left half : " + num2);

			int sum = num1 + num2;
			log.info("The sum of the number : " + sum);
			square = sum * sum;
			log.info("The square of the sum : " + square);

		} catch (NumberFormatException e) {
			log.severe("Exception occured : " + e.getMessage());
			e.printStackTrace();

		}
		return square == Integer.valueOf(num);
	}
}
