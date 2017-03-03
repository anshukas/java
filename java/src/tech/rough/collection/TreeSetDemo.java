package tech.rough;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		
		@SuppressWarnings("rawtypes")
		Set set = new TreeSet();
		
		Number n1 = 10;
		System.out.println(n1 instanceof Number); 	//true
		System.out.println(n1 instanceof Integer);	//true
		System.out.println(n1 instanceof Comparable); 	//true
		
		set.add(n1);
		System.out.println(set);
		
		
		/*Set setStr = new TreeSet();
		setStr.add("anshu");
		setStr.add(new StringBuffer("Kansakar"));
		System.out.println(setStr);*/
		
	}
}
