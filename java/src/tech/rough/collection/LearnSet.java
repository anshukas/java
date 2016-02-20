package tech.rough.collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
	
	// Going to insert in set and check weather, it allow insert two identical object. 
	// As Set says identical element are not allow. 
	
	// Create a set collection
	private static Set<Student> set = new HashSet<Student>();
	
	public static void main(String[] args){
		// create one object of student
		Student s1 = new Student();
		s1.setAge(101);
		s1.setFname("Cnshu");
		
		//create 2nd obejct
		Student s2 = new Student();
		s2.setAge(101);
		s2.setFname("anshu");
		
		set.add(s1);
		set.add(s2);

		// Now here, it print TWO object, while both object are identical
		// Now we override the Bean class with it's hashCode and equals method, So now it print one object :)
		System.out.println(set);
		
	}
}
