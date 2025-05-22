package day_01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class ReverseArray {

	static private final Logger log = AppLogger.getLogger(ReverseArray.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		Scanner sn = new Scanner(System.in);
		log.info("Enter the size of the array.");
		int size = sn.nextInt();
		if (size <= 0) {
			log.warning("Size should be greater that zoro.");
		}

		int[] num = new int[size];

		log.info("The size of the array : " + size);
		log.info("Enter the array element.");

		for (int i = 0; i < num.length; i++) {
			log.info("Enter the number : ");
			num[i] = sn.nextInt();
		}

		log.info("Original array: " + Arrays.toString(num));

		log.info("Calling reverseArray method to reverse the array.");
		int num1[] = ReverseArray.reverseArray(num);
		log.info("Reversed array : " + Arrays.toString(num1));
		sn.close();
		log.info("Main thread ended.");
	}

	public static int[] reverseArray(int[] num) {

		int start = 0;
		int end = num.length - 1;

		while (start < end) {
			int temp = num[start];

			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}
		return num;
	}

}
