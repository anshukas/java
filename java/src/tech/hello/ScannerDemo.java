package tech.hello;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args){
		
		String line, word;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Read line: ");
		line = sc.nextLine();
		
		System.out.println("Read word: ");
		word = sc.next();
		
		System.out.println("Line is:--> "+line+"wors id:--> "+word);
	}
}
