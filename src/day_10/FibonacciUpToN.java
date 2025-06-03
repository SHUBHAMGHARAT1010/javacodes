package day_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class FibonacciUpToN {

	private final static Logger log = AppLogger.getLogger(FibonacciUpToN.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		try (Scanner sn = new Scanner(System.in)) {

			log.info("Enter the number.");
			int num = sn.nextInt();

			log.info("The Number : " + num);

			if (num < 0) {
				log.warning("Input must be a non-negative integer.");
				return;
			}
			log.info("Calling fibonacciUpToN method.");

			log.info("The fibonacci series upto " + num + " is : " + fibonacciUpToN(num));

		} catch (Exception e) {
			log.severe("Exception Occured : " + e.getMessage());
			e.printStackTrace();
		}
		log.info("Main thread ended.");
	}

	public static List<Integer> fibonacciUpToN(int num) {
		int num1 = 0, num2 = 1;
		List<Integer> fibo = new ArrayList<>();

		while (num1 <= num) {

			fibo.add(num1);

			int next = num1 + num2;

			num1 = num2;
			num2 = next;
		}
		return fibo;
	}

}
