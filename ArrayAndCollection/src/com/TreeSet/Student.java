package com.TreeSet;

public class Student implements Comparable<Student> {
	int enrollmentNum;
	int rollnum;
	String name;
	Standard stuclass;
	public Student(int enrollmentNum, int rollnum, String name, Standard stuclass) {
		super();
		this.enrollmentNum = enrollmentNum;
		this.rollnum = rollnum;
		this.name = name;
		this.stuclass = stuclass;
	}
	@Override
	public String toString() {
		return "Student [enrollmentNum=" + enrollmentNum + ", rollnum=" + rollnum + ", name=" + name + ", stuclass="
				+ stuclass + "]";
	}
	@Override
	public int compareTo(Student stud) {
		if(rollnum>stud.rollnum){
			return 1;
		}else if(rollnum<stud.rollnum){
			return -1;
		}
		return 0;
	}
	

}
