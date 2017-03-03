package tech.patterns.oops;

/**
 * tech708
 * @author Kansakar
 *
 */
public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;
	
	public void setName(String nameName){ name= nameName;}
	public String getName(){return name; }
	
	public void setWeight(int newWeight){
		if(newWeight >0 )
			weight = newWeight;
		else
			System.out.println("weight must be bigger then 0 ");
		
	}
	public int getWeight() {return weight;}
	
	public void setSound(String newSound){name = newSound;}
	public String getSound(){return sound;}
	
	
}
 