package com.question;

import java.util.Arrays;
import java.util.Scanner;

class Person {
	String firstname;
	String lastname;
	int id;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String firstname, String lastname, int id) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}

}

class Student extends Person {
	int arr[];

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstname, String lastname, int id) {
		super(firstname, lastname, id);
		// TODO Auto-generated constructor stub
	}

	public Student(String firstname, String lastname, int id, int arr[]) {
		super(firstname, lastname, id);
		this.arr = arr;

	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return super.toString() + "marks=" + Arrays.toString(arr);
	}

}

public class Singleinheritance {
	public static void calculate(Student s1) {
		int arr1[] = s1.getArr();
		int average = 0;
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = sum + arr1[i];
			average = sum / arr1.length;
		}
		if (average > 90) {
			System.out.println("grade=" + "A");
		} else if (average > 75) {
			System.out.println("grade=" + "B");
		} else if (average > 60) {
			System.out.println("grade=" + "c");
		} else {
			System.out.println("grade=" + "D");
		}
	}

	public static int[] enterMarks() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[2];
		System.out.println("enter marks of two subject");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s = new Student("Suraj", "Awari", 123, enterMarks());
		System.out.println(s);
		calculate(s);
		System.out.println("----------------------------------");
		Student s1 = new Student("Avani", "Awari", 125, enterMarks());
		System.out.println(s1);
		calculate(s);
	}

}
