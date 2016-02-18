package tech.imp;

import java.util.Set;
import java.util.TreeSet;

class Dog implements Comparable<Dog>{
	int size;
	
	Dog(int s){
		size = s;
	}

	@Override
	public int compareTo(Dog o) {
		return this.size - o.size;
	}
	
}

public class ImpComparable {
	public static void main(String[] args){
		Set<Dog> d = new TreeSet<Dog>();
		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));
		
	}
}
