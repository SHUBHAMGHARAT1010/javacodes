package day06;

import java.util.Arrays;
import java.util.logging.Logger;

import logger.AppLogger;

public class MoveZeroToEnd {

	private static final Logger log = AppLogger.getLogger(MoveZeroToEnd.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		int arr[] = { 0, 2, 0, 3, 2, 0, 1 };

		log.info("The original Array : " + Arrays.toString(arr));
		log.info("Calling moveZeros method.");

		int modifiedArray[] = MoveZeroToEnd.moveZeros(arr);
		log.info("Modified array : " + Arrays.toString(modifiedArray));

	}

	public static int[] moveZeros(int arr[]) {
		int index = 0;

		for (int i=0;i<arr.length;i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
			

		}
		while (index < arr.length) {
			arr[index++]=0;
		}
		return arr;
	}
}
