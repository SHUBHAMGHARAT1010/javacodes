package day_01;

import java.util.Scanner;
import java.util.logging.Logger;
import logger.*;

public class CheckArmstrongNumber {

	static final private Logger log = AppLogger.getLogger(CheckArmstrongNumber.class);

	public static void main(String[] args) {

		CheckArmstrongNumber arm = new CheckArmstrongNumber();
		log.info("Main thread started.");

		Scanner sn = new Scanner(System.in);
		log.info("Enter the number : ");
		try {
			String str = sn.nextLine();
			int num = Integer.parseInt(str);
			log.info("User entered number is : " + num);

			log.info("Calling static method to get the count of the element.");
			int count1 = CheckArmstrongNumber.count(str);
			log.info("The count elemenet : " + count1);

			log.info("Calling isArmstrong method whether is this armstrong number or not.");
			if (arm.isArmStrong(num, count1))
				log.info("The number " + num + " is Armstrong number.");
			else
				log.info("The number " + num + " is not the armsteong number.");
		} catch (NumberFormatException e) {
			log.severe("Please enter the valid input number.");
		}
		log.info("Main thread end.");
		sn.close();
	}

	public boolean isArmStrong(int num, int count) {
		int original = num;
		if (num == 0)
			return true;
		double sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, count);
			num /= 10;
		}
		return (int) sum == original;

	}

	public static int count(String num) {
		return num.length();
	}
}
