package tech.rough.collection;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
	private static Set<Student> set = new TreeSet<Student>();
	public static void main(String[] args){
		Student s1 = new Student();
		s1.setAge(60);
		s1.setFname("anshu");
		
		Student s2 = new Student();
		s2.setAge(20);
		s2.setFname("snshu");
		
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
	}
}
