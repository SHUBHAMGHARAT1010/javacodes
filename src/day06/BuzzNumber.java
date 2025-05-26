package day06;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class BuzzNumber {

	private static final Logger log=AppLogger.getLogger(BuzzNumber.class);
	
	public static void main(String[] args) {
		log.info("Main thread started.");
		
		try(Scanner sn=new Scanner(System.in)){
			
			log.info("Enter the number.");
			int num=sn.nextInt();
			
			log.info("The enterted the number : "+num);
			
			log.info("Calling the checkBuzzNumber method.");
			
			if(BuzzNumber.checkBuzzNumber(num)) log.info(num +" is the Buzz Number.");
			else log.info(num+" is not  the Buzz Number.");
			
		}catch(Exception e) {
			log.severe("Exception Occured : "+e.getMessage());
			e.printStackTrace();
		}
		
		log.info("Main thread ended.");
	}
	
	public static boolean checkBuzzNumber(int num) {
		if(num%7==0) return true;
		
		if(num%10 ==7) {
			return true;
		}
	return false;
	}
}
