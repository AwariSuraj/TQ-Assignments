package com.question;

import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private boolean isSpecial;
	private Course course;
	{
		isSpecial = false;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;

		this.course = course;
	}

	public int getId() {
		return id;
	}

	public boolean isSpecial() {
		return isSpecial;
	}

	public void setSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", isSpecial=" + isSpecial + ", course=" + course + "]";
	}

}

class Course {
	private String cname;
	private int fees;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String cname, int fees) {
		super();
		this.cname = cname;
		this.fees = fees;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [cname=" + cname + ", fees=" + fees + "]";
	}

}

public class StudentTest {
	static Scanner sc = new Scanner(System.in);

	public static void studentDetails(Student st1) {
		System.out.println("enter a id");
		st1.setId(sc.nextInt());
		System.out.println("enter name");
		st1.setName(sc.next());
		System.out.println("enter a course details");
		Course c1 = new Course();
		courseDetails(c1);
		st1.setCourse(c1);

	}

	public static void isBoolean(Student[] s1) {

		for (Student s : s1) {
			Course c = s.getCourse();
			if (c.getFees() > 50000) {
				s.setSpecial(true);

			}

		}
	}

	public static void courseDetails(Course c) {
		System.out.println("enter a course name");
		c.setCname(sc.next());
		System.out.println("enter a course fees");
		c.setFees(sc.nextInt());

	}

	public static void main(String[] args) {

		Student st[] = new Student[3];
		for (int i = 0; i < 3; i++) {
			st[i] = new Student();
			studentDetails(st[i]);

		}

		isBoolean(st);

		for (Student s : st) {
			System.out.println(s);
		}

	}

}
