package com.question;

import java.util.Scanner;

public class Q3reverse {
	static Scanner sc = new Scanner(System.in);

	public static void reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = (rev * 10) + r;
			num /= 10;
		}
		System.out.println("reverse=" + rev);
	}

	public static void main(String[] args) {

		System.out.println("enter a number");
		int n = sc.nextInt();
		reverse(n);
	}

}
