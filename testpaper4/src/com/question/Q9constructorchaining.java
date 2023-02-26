package com.question;

class Chain {

	private int a;
	private int b;
	private int c;

//constructor chaining
	Chain()

	{
		a = 80;
		b = 90;
		c = 100;

	}

	Chain(int a) {
		this();
		this.a = a;

	}

	Chain(int a, int b) {
		this();
		this.a = a;
		this.b = b;

	}

	Chain(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public String toString() {
		return "a=" + a + " " + " b=" + b + " " + " c=" + c;
	}
}

public class Q9constructorchaining {

	public static void main(String[] args) {
		// Chain c = new Chain(10);
		// Chain c = new Chain(20, 30, 60);
		Chain c = new Chain(50, 10);
		System.out.println(c.toString());

	}

}
