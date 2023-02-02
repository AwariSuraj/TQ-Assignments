package com.conditionalCw;

import java.util.Scanner;

public class MaximumNoCw33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("enter a three number to check ehich one is grater");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is a greater a number ");

		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is a greater a number");
		} else {
			System.out.println(num3 + " is a greater a number");
		}
	}
}
