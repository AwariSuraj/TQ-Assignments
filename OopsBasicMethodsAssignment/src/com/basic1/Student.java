package com.basic1;

public class Student {

	int rollno;
	String name;
	String address;
	float marks;

	public float percentage() {

		float per = marks / 5;
		return per;

	}

	public void display() {
		System.out.println("name= " + name);
		System.out.println("roll no= " + rollno);
		System.out.println("marks= " + marks);
		System.out.println("address= " + address);
	}

	public void takeParameter(int rollno, String name, String address, float marks) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.marks = marks;

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.takeParameter(12, "suraj", "lonavala", 450);
		s1.display();
		s1.percentage();

	}

}
