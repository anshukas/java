package tech.rough.collection;

public class Student implements Comparable<Student>{
	private int age;
	private String fname;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", fname=" + fname + "]";
	}
	
	// Override the hashCode and equals 
	// Here we override both age and fname
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		return true;
	}*/
	
	/*
	 * 2nd case: we only override the age of Student
	 * So it only check for age 
	 * if the age of the two object is same
	 * it says that object is identical
	 * doesn't matter about the other instance variable i.e fname 
	 */
	 
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		return true;
	}*/
	
	/*--------------------------------------Used for TreeSet in class LearnTreeSet  --------------------------------------*/
	
	/*public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.age>s.age){
			return -1;
		}else if(this.age<s.age){
			return 1;
		}
		return 0;
	}*/
	//OR
	@Override
	public int compareTo(Student o) {
		return this.age-o.age;
	}
	
	
}
