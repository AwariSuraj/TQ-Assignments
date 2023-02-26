package com.question;

import java.util.Scanner;

public class Q1Divisibleby3 {

	static Scanner sc = new Scanner(System.in);

	public static void d3(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		int n = sc.nextInt();
		d3(n);
	}

}
