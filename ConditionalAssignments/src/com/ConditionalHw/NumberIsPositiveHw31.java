package com.ConditionalHw;

import java.util.Scanner;

public class NumberIsPositiveHw31 {

	public static void main(String[] args) {
		System.out.println("enter a number to positive negative or zero");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 0) {
			System.out.println("number is =" + num);
		} else if (num > 0) {
			System.out.println("number is positive=" + num);

		} else {
			System.out.println("the number is negative" + num);
		}
		System.out.println("suraj");
	}

}
