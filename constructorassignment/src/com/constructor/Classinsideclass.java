package com.constructor;

class Course {

	int courseid;
	String coursename;

	public Course() {
		courseid = 1023;
		coursename = "java Developer";
		System.out.println(courseid);
		System.out.println(coursename);

	}

	class Subcourse {

		int studentid;
		String name;

		public Subcourse() {
			studentid = 123;
			name = "suraj";
			System.out.println(studentid);
			System.out.println(name);

		}

	}
}

public class Classinsideclass {

	public static void main(String[] args) {
		Course c = new Course();
		Course.Subcourse i = c.new Subcourse();

	}
}
