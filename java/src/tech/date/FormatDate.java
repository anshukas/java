package tech.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  Format the date object and return the string or print it.
 * @author Kansakar
 *
 */
public class FormatDate {
	public static void main(String[] args){
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		// current date and time
		Date currentDate = new Date();
		System.out.println("currentDate: "+currentDate);
		
		//Format accordingly - sdf1 i.e dd/MM/yyyy
		System.out.println("sdf1 (dd/MM/yyyy): "+sdf1.format(currentDate));
		
		//Format accordingly - sdf2 - dd-MM-yyyy
		System.out.println("sdf2 (dd-MM-yyyy) "+sdf2.format(currentDate));
		
		//Formate accordingly - sdf3 
		System.out.println("sdf3 "+ sdf3.format(currentDate));
	}
}
