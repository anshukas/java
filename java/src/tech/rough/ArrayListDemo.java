package tech.rough;
/**
 * Write comment
 */
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(60);
		list.add(70);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		for (Integer singleValue: list) {
			if(singleValue<=50) 
				System.out.println(singleValue);
		}
	}
}
