package com.TreeSet;

import java.util.TreeSet;

public class StudentListOfAclass {

	public static void main(String[] args) {
		Standard std= new Standard(7,"A");
		Standard std2= new Standard(7,"B");
		Student s1= new Student(1001,11,"upendra",std);
		Student s2= new Student(1002,12,"surendra",std2);
		Student s3= new Student(1002,10,"amit",std2);
		TreeSet<Student>studentlist= new TreeSet<>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		for(Student s:studentlist){
			System.out.println(s);
		}
	}

}
