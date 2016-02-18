package tech.rough.collection;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		map.put("1001", "Anshu");
		map.put("2001", "Kumar");
		map.put("3001", "chandu");
		
		if(map.containsValue("Kumar"))
			System.out.println("Found");
	}
}
