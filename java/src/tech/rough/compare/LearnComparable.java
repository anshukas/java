package tech.rough.compare;
/**
 * Comparable is an interface used for compare the object.
 * 
 * @author anshu.kumar
 *
 */
public class LearnComparable {
	
	public static void main(String[] args){
		
		//Student first created  - Or we can create constructor 
		Student s1 = new Student();
		s1.setId(2000);
		s1.setFname("Chandu");
		s1.setRanks(10);
		
		//2nd student created
		Student s2 = new Student();
		s2.setId(1001);
		s2.setFname("anshu");
		s2.setRanks(7);
		
		if(s1.compareTo(s2)>0){
			System.out.println("s1 is greater then s2 with id: "+s1.getId());
		}else{
			System.out.println("s2 is greater with id: "+s2.getId());
		}
		
		//o: s1 is greater then s2 with id: 2000
	}
}
