package day_04;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

import logger.AppLogger;

public class FindNonRepeatingElement {

	private static final Logger log = AppLogger.getLogger(FindNonRepeatingElement.class);

	public static void main(String[] args) {
		log.info("Main thread started.");

		int arr[] = { 10, 20, 30, 20, 30, 10, 40 };

		log.info("The original array : " + Arrays.toString(arr));

		log.info("Calling findRepeatElement method.");

		Integer num = FindNonRepeatingElement.findRepeatElement(arr);

		if (num != null) {
			log.info(num + " is the first non repeating element.");
		} else
			log.info("Non repeating element not found.");

		log.info("Main thread ended.");
	}

	public static Integer findRepeatElement(int arr[]) {

		Map<Integer, Integer> map = new LinkedHashMap<>();

		for (int ch : arr) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}
}
