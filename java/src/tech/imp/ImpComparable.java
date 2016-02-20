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
	@Override
	public String toString() {
		return "Dog [size=" + size + "]";
	}
}
public class ImpComparable {
	public static void main(String[] args){
		Set<Dog> d = new TreeSet<Dog>();
		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));
		//output: [Dog [size=1], Dog [size=2]]
		System.out.println(d);
	}
}
