package com.question;

import java.util.Scanner;

public class Q4frequency {

	static Scanner sc = new Scanner(System.in);

	public static void frequency(int num) {

		for (int i = 1; i <= 9; i++) {
			int count = 0;
			int num1 = num;
			int r = 0;
			while (num1 != 0) {
				r = num1 % 10;
				if (r == i) {
					count++;

				}

				num1 /= 10;
			}
			System.out.println(i + " :" + count);
		}
	}

	public static void main(String[] args) {
		System.out.println("enter a number");

		int n = sc.nextInt();
		frequency(n);
	}

}
