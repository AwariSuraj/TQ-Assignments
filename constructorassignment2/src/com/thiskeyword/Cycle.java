package com.thiskeyword;

public class Cycle {

	int no;
	int nowheels;

	public Cycle() {
		System.out.println("i am in the default constructor");
	}

	public Cycle(int no, int nowheels) {
		this();
		this.no = no;
		this.nowheels = nowheels;
		System.out.println("number=" + no + "   nowheels=" + nowheels);
	}

	public static void main(String[] args) {
		System.out.println("object first");
		Cycle c1 = new Cycle(); // default constructor

		System.out.println("object second");
		Cycle c2 = new Cycle(123, 2); // in parameterized constructor we calling the default constructor using this()

	}

}
