package com.singleinheritance;

class Fruits {
	String test = "sweet";
	String color = "red";

}

class Apple extends Fruits {
	int price = 20;
	String avialable = "yes";

}

public class Single1 {

	public static void main(String[] args) {
		Apple a = new Apple();
		System.out.println(a.test + " " + a.color + " " + a.price + " " + a.avialable);

	}

}
