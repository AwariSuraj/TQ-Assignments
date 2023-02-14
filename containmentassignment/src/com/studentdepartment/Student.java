package com.studentdepartment;

public class Student {

	private int rollno;
	private String name;
	private Department d;

	public Student() {

	}

	public Student(int rollno, String name, Department d) {

		this.rollno = rollno;
		this.name = name;
		this.d = d;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "student info= " + rollno + "  " + name + "  " + d;
	}
}
