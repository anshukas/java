package tech.patterns.oops;

public class Dog extends Animal{
	public void digHole(){
		System.out.println("Dig a gole.");
	}
	
	public Dog(){
		super();
		setSound("Bark");
	}
}
