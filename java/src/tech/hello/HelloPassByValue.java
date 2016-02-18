package tech.hello;

import java.util.HashMap;
import java.util.Map;

public class HelloPassByValue {
	public static void main (String[] args){
		Map<String, String> person = new HashMap<String, String>();
		person.put("name", "Anshu");
		person.put("like", "Food");
		modifyMap(person);
		System.out.println("Map in main: "+person);
	}
	
	static void modifyMap(Map map){
		//map.put("lastName", "Kansakar");
		map=null;
		System.out.println("Map in modify method: "+map);
	}
}
