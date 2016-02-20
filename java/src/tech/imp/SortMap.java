package tech.imp;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/**
 * If you need to sort the map with it's key in ascending or descending.
 * 
 * @author anshu.kumar
 *
 */
public class SortMap {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Z", 1001);
		map.put("A", 1);
		map.put("X", 24);
		map.put("C", 3);
		
		//output: {A=1, C=3, X=24, Z=1001}
		// TreeMap is default sorted by ascending 
		System.out.println(map);
		
		/*
		 * I need descending order (key) for my other map
		 */
		Map<String, Integer> mapDec = new TreeMap<String,Integer>(new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				return arg1.compareTo(arg0);
			}
			
		});
		
		mapDec.put("Q", 2001);
		mapDec.put("A", 1);
		mapDec.put("Z", 26);
		mapDec.put("B", 2);
		
		System.out.println("Map in descending order: "+mapDec);
		
		/*
		 * Make ascending order for value
		 * Map can't be sort by value
		 */
		
		
	}
}
