package com.multilevelinheritance;

class A {
	String name = "Suraj";

}

class B extends A {
	int age = 22;

}

class C extends B {
	String institute = "Sinhgad";
}

public class Multilevel1 {

	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.name + " " + c1.age + " " + c1.institute);

	}

}
