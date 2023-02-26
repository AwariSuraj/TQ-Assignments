package com.question;

import java.util.Scanner;

public class Q2prime {
	static Scanner sc = new Scanner(System.in);

	public static void checkPrime(int num) {
		int flag = 0;
		if (num == 0 || num == 1) {
			System.out.println(num + " not prime");
		} else

		{
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is  prime");
			} else {
				System.out.println(num + " not prime");
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		int n = sc.nextInt();
		checkPrime(n);
	}

}
