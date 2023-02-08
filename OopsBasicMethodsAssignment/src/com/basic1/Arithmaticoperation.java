package com.basic1;

public class Arithmaticoperation {

	int num1;
	int num2;
	float num3;

	void take(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	float add() {
		num3 = num1 + num2;
		return num3;
	}

	float sub() {
		num3 = num1 - num2;
		return num3;

	}

	float multiply() {
		num3 = num1 * num2;
		return num3;

	}

	float division() {
		num3 = num1 / num2;
		return num3;
	}

	public static void main(String[] args) {

		Arithmaticoperation a1 = new Arithmaticoperation();
		a1.take(1, 2);
		System.out.println("Add=" + a1.add());
		System.out.println("subtract=" + a1.sub());
		System.out.println("multiply=" + a1.multiply());
		System.out.println("division=" + a1.division());

		System.out.println("----------------------");
		Arithmaticoperation a2 = new Arithmaticoperation();
		a2.take(10, 20);
		System.out.println("Add=" + a2.add());
		System.out.println("subtract=" + a2.sub());
		System.out.println("multiply=" + a2.multiply());
		System.out.println("division=" + a2.division());

	}
}
