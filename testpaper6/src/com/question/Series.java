package com.question;

public class Series {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i <= 13; i++) {
			int c = (a + b) + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}

	}

}
