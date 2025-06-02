	package day_07;
	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.HashSet;
	import java.util.List;
	import java.util.Set;
	import java.util.logging.Logger;
	
	import logger.AppLogger;
	
	public class ArrayIntersection {
	
		private static final Logger log = AppLogger.getLogger(ArrayIntersection.class);
	
		public static void main(String[] args) {
			log.info("Main thread started.");
			int arr1[] = { 10, 20, 30, 40, 60, 50 };
	
			int arr2[] = { 70, 10, 80, 20, 90, 30 };
	
			log.info("The first original array : " + Arrays.toString(arr1));
			log.info("The second original array : " + Arrays.toString(arr2));
	
			log.info("Calling findIntersection method.");
	
			List<Integer> list = ArrayIntersection.findIntersection(arr1, arr2);
	
			if (list.isEmpty()) {
				log.info("Array is empty.");
			} else
				log.info("The intersection element of those array : " + list);
			log.info("Main thread ended.");
		}
	
		public static List<Integer> findIntersection(int arr1[], int arr2[]) {
			if (arr1 == null || arr2 == null)
				return Collections.emptyList();
			Set<Integer> set = new HashSet<>();
			List<Integer> list = new ArrayList<>();
	
			for (int num : arr1) {
				set.add(num);
			}
	
			for (int num : arr2) {
				if (set.contains(num)) {
					list.add(num);
					set.remove(num);
				}
			}
			return list;
		}
	}
