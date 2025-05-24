package day_03;

import java.util.Arrays;
import java.util.logging.Logger;

import logger.AppLogger;

public class MissingNumber {

	private static final Logger log=AppLogger.getLogger(MissingNumber.class);
	
	public static void main(String[] args) {
		log.info("Main thread stared.");
		
		int arr[] = {1,2,4,5,6,7,8};
		Arrays.sort(arr);
		int num=arr[arr.length-1];
		
		log.info("Missing number is :" + MissingNumber.checkMissing(arr, num));
		
		
	}
	
	public static int checkMissing(int [] arr,int num) {
		int totalSum=num*(num+1)/2;
		
		int sum=0;
		
		for(int nu:arr) {
			sum+=nu;
		}
		
		return totalSum-sum; 
	}
}
