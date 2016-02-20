package tech.imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int id;
	String fName;
	int rank;
	
	public Student(int id, String fName, int rank) {
		super();
		this.id = id;
		this.fName = fName;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", rank=" + rank
				+ "]";
	}
}

class StudentIdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}
}

class RankWiseStudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2){
		return o1.rank - o2.rank;
	}
}

public class ImpComparator {
	public static void main(String[] args){
		Student s1 = new Student(1001, "Chandu", 1);
		Student s2 = new Student(101, "Anshu", 2);

		List<Student> studentList = new ArrayList<>();
		studentList.add(s1);
		studentList.add(s2);
		Collections.sort(studentList, new StudentIdComparator());
		
		//output: [Student [id=101, fName=Anshu, rank=2], Student [id=1001, fName=Chandu, rank=1]]
		System.out.println(studentList);
		
		Collections.sort(studentList, new RankWiseStudentComparator());
		// output: [Student [id=1001, fName=Chandu, rank=1], Student [id=101, fName=Anshu, rank=2]]
		System.out.println(studentList);
	}
}
