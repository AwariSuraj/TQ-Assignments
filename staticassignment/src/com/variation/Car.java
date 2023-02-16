package com.variation;

public class Car {

	static int n;
	static String name;
	int a;
	String city;

	public static void display() {
		System.out.println(n); // static variable can access in static method;
		System.out.println(name);

		// System.out.println(a); //non static variabme can not acces in static method
		// System.out.println(city);
	}

	public void show() {
		System.out.println(n); // static variable can access in non static method;
		System.out.println(name);

		System.out.println(a); // non static variable can access in non static method
		System.out.println(city);
	}

	public static void main(String[] args) {

		System.out.println(n);
		System.out.println(name);

		Car c = new Car();
		System.out.println(c.a);
		System.out.println(c.city);
	}

}
