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

		int result[] = new int[arr.length];

		int index = 0;

		for (int num : arr) {
			if (num != 0) {
				result[index++] = num;
			}
			
			while(index<result.length-1) {
				result[index++]=0;
			}
		}
		return result;
	}
}
