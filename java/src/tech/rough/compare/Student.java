package tech.rough.compare;

// SEE: there is no access modifier on Student class, that means this has package scope
class Student implements Comparable<Student> {
	
	private int id;
	private String fname;
	private int ranks;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getRanks() {
		return ranks;
	}
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.id - o.id;
	}
}
