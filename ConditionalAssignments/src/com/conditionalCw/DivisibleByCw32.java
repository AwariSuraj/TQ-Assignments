package com.conditionalCw;

import java.util.Scanner;

public class DivisibleByCw32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check is it divisible by 5 and 11 or not");
		int number = sc.nextInt();
		if (number % 5 == 0 && number % 11 == 0) {
			System.out.println("the number is divisible by 5 and 11  =" + number);

		} else {
			System.out.println("the number is not divisible by 5 and 11  =" + number);
		}

	}

}
