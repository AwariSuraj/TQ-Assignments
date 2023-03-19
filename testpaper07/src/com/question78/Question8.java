package com.question78;

public class Question8 {

	public void method() {
		int a = 50 / 0;
	}

	public void method1() {
		method();
	}

	public void method2() {
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		Question8 p = new Question8();

		p.method2();

	}

}
