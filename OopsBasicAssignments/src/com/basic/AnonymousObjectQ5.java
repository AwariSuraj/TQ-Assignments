package com.basic;

//anonymous object means object crating without giving a name
public class AnonymousObjectQ5 {

	String pname;
	int age;

	void takeAndDisplay(String pn, int ag) {
		pname = pn;
		age = ag;
		System.out.println("person name=" + pname + " " + "age=" + age);
	}

	public static void main(String[] args) {
		new AnonymousObjectQ5().takeAndDisplay("Suraj", 35);
	}

}
