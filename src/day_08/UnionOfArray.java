package day_08;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import logger.AppLogger;

public class UnionOfArray {

	static final private Logger log=AppLogger.getLogger(UnionOfArray.class);
	
	public static void main(String[] args) {
		log.info("Main Thread started.");
		
		int []arr1= {10,40,20,30,40,50};
		int arr2[] = {10,30,40,60,70};
		
		log.info("Calling unionArray method.");
		
		Set<Integer> unionArray=UnionOfArray.unionArray(arr1, arr2);
		
		log.info("Union of the array : "+unionArray);
		log.info("Main thread ended.");
	}
	
	public static Set<Integer> unionArray(int arr1 [] ,int arr2[]) {
		
		Set<Integer> unionSet=new HashSet<>();
		
		
		for(int num:arr1) {
			unionSet.add(num);
		}
		for(int num:arr2) {
			unionSet.add(num);
		}
		return unionSet;
	}
}
