package tech.imp;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Person {
	int id;
	String fName;
	public Person(int id, String fName) {
		super();
		this.id = id;
		this.fName = fName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fName=" + fName + "]";
	}
}

public class SortMap2 {
	static Map<Integer, Person> map = new TreeMap<Integer, Person>(new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.intValue() - o1.intValue(); // make it descending
		}
	}); 
	
	public static void main(String[] args) {
		Person s1 = new Person(1001, "Chandu");
		Person s2 = new Person(101, "Ansu");
		
		map.put(11, s1);
		map.put(1, s2);

		//output: {11=Person [id=1001, fName=Chandu], 1=Person [id=101, fName=Ansu]}
		// sorted in key of descending order
		System.out.println(map);
		
		
	}
}
