package com.basic;

//main inside class
public class MainInsideClassQ2 {

	int rollno;
	String name;

	void takeDetails(int rn, String n) {
		rollno = rn;
		name = n;

	}

	void showDetails() {
		System.out.println("roll number=" + rollno);
		System.out.println("name=" + name);
	}

	public static void main(String[] args) {

		MainInsideClassQ2 m1 = new MainInsideClassQ2();
		m1.takeDetails(45, "suraj");
		m1.showDetails();
	}

}
