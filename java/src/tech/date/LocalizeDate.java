package tech.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

/**
 * tech#706
 * @author Kansakar
 *
 */

public class LocalizeDate {
	private static final DateFormat jsDf = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss 'GMT'Z '('z')'");
	public static void main(String[] args){
		Locale brLocale = new Locale("pt", "BR");
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMMM yyyy HH:mm:ss.SSSZ",brLocale);
		
		//print current date and time in Brazilian 
		System.out.println(sdf.format(new Date()));
		
		//
		System.out.println(jsDf.format(new Date()));
	}
}
