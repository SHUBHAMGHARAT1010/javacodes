package day_10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import logger.AppLogger;

public class FindDuplicatesUsingHashSet {

	private static final Logger log = AppLogger.getLogger(FindDuplicatesUsingHashSet.class);

	public static void main(String[] args) {

		log.info("Main thread started.");

		int arr[] = { 20, 10, 40, 30, 50, 70, 20, 10, 40, 90 };

		log.info("The original array : " + Arrays.toString(arr));
		log.info("Calling FindDuplicate method.");

		FindDuplicate(arr);

		log.info("Main thread ended.");
	}

	public static void FindDuplicate(int arr[]) {
		Set<Integer> set = new HashSet<>();

		Set<Integer> duplicateSet = new HashSet<>();

		for (int num : arr) {
			if (!set.add(num)) {
				duplicateSet.add(num);
			}
		}

		if (duplicateSet.isEmpty()) {
			log.info("No duplicate found.");
		} else {
			log.info("The duplicate element : " + duplicateSet);
		}
	}
}
