package com.staticoverloading;

public class Car {

	public static int display(int a, int b) {
		int c = a + b;
		return c;
	} /*
		 * one method is static or another is non static also done for the overloading
		 * and both are the non staic also valid.
		 */

	public int display(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.display(5, 6, 6));

		System.out.println(display(1, 2));
	}

}
