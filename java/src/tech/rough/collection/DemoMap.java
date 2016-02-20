package tech.rough.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1001", "Anshu");
		map.put("2001", "Kumar");
		map.put("3001", "chandu");

		// To see Contains works :)
		if(map.containsValue("Kumar"))
			System.out.println("Found");
		
		//Traverse Map
		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.print("Map Key: "+e.getKey());
			System.out.println(" Map Value: "+e.getValue());
			/**
			 * So we can't remove the element using for each
			 * It throw exception :Exception in thread "main" java.util.ConcurrentModificationException 
			 */
			/*if(e.getKey().equals("1001")){
				String key=e.getKey();
				map.remove(key);
			}*/
		}
		
		// Traverse the map using Iterator
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> e = itr.next();
			if(e.getKey().equals("1001")){
				itr.remove();
			}
		}
		System.out.println(map);
	
	}
}
