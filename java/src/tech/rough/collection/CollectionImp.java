package tech.rough.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionImp {
	private static Map<Integer, Set<Person>> map = new HashMap<Integer, Set<Person>>();
	public static void main(String[] args){
		Person p1 = new Person();
		p1.setEmail("anshu.kumar@gmail.com");
		p1.setFname("Anshu");
		p1.setId(1);
		
		Person p2 = new Person();
		p2.setEmail("anshu.kumar@gmail.com");
		p2.setFname("Anshu");
		p2.setId(1);
		
		Set<Person> personSet = new HashSet<>();
		personSet.add(p1);
		personSet.add(p2);
		
		map.put(10001, personSet);
		System.out.println("map : "+map);
		
		System.out.println(personSet);
		
	}
}
