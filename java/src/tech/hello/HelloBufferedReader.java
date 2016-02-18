package tech.hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reading the input through BufferedReader
 * @author Kansakar
 *
 */
public class HelloBufferedReader {
	public static void main(String[] args){
		BufferedReader br=null;
		String name=null;
		
		// bufferReader object
		br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		
		try {
			name=br.readLine();
			System.out.println("Name: "+name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
