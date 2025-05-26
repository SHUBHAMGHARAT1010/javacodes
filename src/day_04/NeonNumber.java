package day_04;

import static org.junit.jupiter.api.Assumptions.abort;

import java.util.Scanner;
import java.util.logging.Logger;

import logger.AppLogger;

public class NeonNumber {

	private static final Logger log=AppLogger.getLogger(NeonNumber.class);
	
	public static void main(String[] args) {
		log.info("Main thread started.");
		
		try(Scanner sn =new Scanner(System.in)){
			
			while (true) {
			log.info("Enter the number (or Exit to stop.)");
			
			String str=sn.nextLine().trim();
			
			log.info("User entered the value :"+str);
			
			if(str.equalsIgnoreCase("EXIT")) {
				log.info("USer wants to stop.");
				break;
			}try {
				int num=Integer.valueOf(str);
				
				log.info("Calling checkNeonNumber method.");
				if(NeonNumber.checkNeonNumber(num)) log.info(num+" is Neon Number.");
				else log.info(num+" is not Neon Number.");
				
			}catch(NumberFormatException e) {
				log.warning(("Exception Occured : Invalid Input "+e.getMessage()));
				e.printStackTrace();
			}
			}
		}catch(Exception e) {
			log.severe("Exception Occured : "+e.getMessage());
			e.printStackTrace();
		}
		
		log.info("Main thread ended.");
	}
	
	public static boolean checkNeonNumber(int num) {
		int square=num*num;
		
		log.info("The square of the "+num+" is : "+square);
		int sum=0;
		while (square!=0) {
			sum+=square%10;
			square/=10;
		}
		
		log.info("The sum of the square is : "+sum);
		
		return num==sum;
		
	}
	
}
