package day_05;

import java.util.Arrays;
import java.util.logging.Logger;

import logger.AppLogger;

public class ArrayPalindrome {

	private static final Logger log = AppLogger.getLogger(ArrayPalindrome.class);

	public static void main(String[] args) {
		log.info("Main thread stared.");

		int arr[] = { 10, 10,50, 10, 10 ,20};

		log.info("The original array : " + Arrays.toString(arr));
		log.info("Calling checkPalindrome method.");
		
		if(ArrayPalindrome.checkPalindrome(arr)) log.info("Array is palindrome.");
		else log.info("The array is not palindrome.");

	}

	public static boolean checkPalindrome(int arr[]) {
		int orgArr[]=arr.clone();
		int start = 0;
		int end = arr.length - 1;
		
		while (start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
		log.info("The mofidied array : "+Arrays.toString(arr));
		
		return Arrays.equals(orgArr, arr);
	}
}
