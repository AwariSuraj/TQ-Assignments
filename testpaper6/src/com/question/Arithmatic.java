package com.question;

interface Advancedarithmatic {
	public int divisor_sum(int n);
}

class Mycalculator implements Advancedarithmatic {

	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		return sum;
	}
}

public class Arithmatic {

	public static void main(String[] args) {
		Mycalculator m = new Mycalculator();
		int answer = m.divisor_sum(6);
		System.out.println(answer);
	}

}
