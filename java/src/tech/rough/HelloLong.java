package tech.rough;

import java.util.HashMap;
import java.util.Map;

public class HelloLong {
	private static Map<String, String> map = new HashMap<String, String>();
	
	public static void main(String[] args){
		map.put("expires_in", "210");
		
		long expires_in = Long.valueOf(map.get("expires_in")).longValue();
		
		System.out.println(expires_in);
	}
	
}
