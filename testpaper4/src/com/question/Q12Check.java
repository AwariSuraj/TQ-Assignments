package com.question;

class Animal {
	static int nolegs = 4;
	static String color = "black";

	static void show() {
		System.out.println(nolegs);

	}
}

class Dog extends Animal {

	String breed = "lab"; /*
							 * we can write override method on subclass but overriding achieve run time
							 * polymorphism ans this static function of sub class can not execute at run
							 * time
							 */

	static void show() {
		System.out.println(nolegs + " " + color);
	}
}

public class Q12Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d = new Dog();
		// d.display();
		d.show();
	}

}
