package day_09;

import java.util.Arrays;
import java.util.logging.Logger;

import logger.AppLogger;

public class BinarySearch {

	private final static Logger log = AppLogger.getLogger(BinarySearch.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		int arr[] = { 10, 30, 20, 40, 50, 90, 60 };
		int target = 20;
		log.info("The original array : " + Arrays.toString(arr));

		log.info("Calling sortArray method.");
		int sortedArray[] = sortArray(arr);

		log.info("The sorted array : " + Arrays.toString(sortedArray));

		log.info("Calling binaryAearch method.");
		int index = binaryAearch(sortedArray, target);

		if (index != -1) {
			log.info(target + " found at position " + index + "th .");
		} else
			log.info(target + " is not found.");

		log.info("Main thread ended.");
	}

	public static int binaryAearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

	public static int[] sortArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
