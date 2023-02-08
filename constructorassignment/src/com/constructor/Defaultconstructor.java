package com.constructor;

public class Defaultconstructor {

	int num1;
	String name;

	/*
	 * public Defaultconstructor() { this.num1 = 45; this.name = "suraj";
	 * System.out.println("i am in the default constructor");
	 * System.out.println("number=" + num1); System.out.println("name=" + name);
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Defaultconstructor d = new Defaultconstructor();
		System.out.println(d);
		// java does not provide second default constructor for the second object
		// Defaultconstructor d1 = new Defaultconstructor();

	}

}
