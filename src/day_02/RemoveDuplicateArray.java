package day_02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

import logger.AppLogger;

public class RemoveDuplicateArray {

	private static final Logger log = AppLogger.getLogger(RemoveDuplicateArray.class);

	public static void main(String[] args) {
		log.info("Main thread started.");
		try (Scanner sn = new Scanner(System.in)) {
			log.info("Enter the array size.");

			int size = sn.nextInt();

			int[] arr = new int[size];

			for (int i = 0; i < size; i++) {
				log.info("Enter the array elemt : ");
				arr[i] = sn.nextInt();
			}

			log.info("Original array : " + Arrays.toString(arr));

			log.info("Calling removeDuplicate method.");
			int result[] = removeDuplicate(arr);

			log.info("Unique array : " + Arrays.toString(result));

		} catch (Exception e) {
			log.severe(e.getMessage());
		}
		log.info("Main thread ended.");
	}

	public static int[] removeDuplicate(int[] arr) {
		Set<Integer> set = new LinkedHashSet<>();

		for (int a : arr) {
			set.add(a);
		}

		int[] result = new int[set.size()];

		Iterator<Integer> itr = set.iterator();
		int i = 0;
		while (itr.hasNext()) {
			result[i++] = itr.next();
		}
		return result;
	}
}
