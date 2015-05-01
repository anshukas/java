package tech.date;

import java.util.Calendar;
import java.util.Date;

/**
 * tech#703
 * Print the 3 days back or later from the current date.
 * @author Kansakar
 *
 */
public class ThreeDayAgo {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		
		// print the current date and time using Calendar
		Date date = c.getTime();		// c.getTime() returning in date data type
		System.out.println(date);
		
		//print the date 3 days back from the current date.
		c.add(Calendar.DATE, -3);			// -ve sign for back 3 days and +ve is for later 3 days
		Date threeDaysBack = c.getTime();	
		System.out.println(threeDaysBack);	
		
		// convert the Date to String - use toString()
		String dateInStr = threeDaysBack.toString();
		System.out.println("Date in String using toString:  "+threeDaysBack);
		
	}
	//TODO: use the same way and write for three days later and return String and print it
	public static String heyThreeDaysLater(){
		return null;
	}
	
}