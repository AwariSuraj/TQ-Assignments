package com.question2;

import java.util.Scanner;

public class NegativeNumber {

	public static void checkNumber(int num) {
		if (num < 0)

		{
			try {
				throw new InvalidNumber("please enter a positive number");
			} catch (InvalidNumber e) {
				System.out.println(e);
			}

		} else {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plaease enter a number");
		checkNumber(sc.nextInt());
	}

}
