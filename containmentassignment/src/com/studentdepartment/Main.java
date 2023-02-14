package com.studentdepartment;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void studentDetails(Student s1) {

		Department d = new Department();

		System.out.println("enter student roll number");
		s1.setRollno(sc.nextInt());
		System.out.println("enter a student name");
		s1.setName(sc.next());

		departmentDetails(d);
		s1.setD(d);

	}

	public static void departmentDetails(Department d1) {
		System.out.println("enter a deapartment id");
		d1.setDid(sc.nextInt());
		System.out.println("enter a department name");
		d1.setName(sc.next());
	}

	public static void main(String[] args) {

		Student s = new Student();
		studentDetails(s);

		System.out.println(s);
	}

}
