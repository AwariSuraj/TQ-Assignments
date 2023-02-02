package com.ConditionalHw;

import java.util.Scanner;

public class EvenOddHw33 {

	public static void main(String[] args) {
		System.out.println("enter a number to check even or odd");
		Scanner sc = new Scanner(System.in);
		int number;
		number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("the number is even");
		} else {
			System.out.println("the number is odd");
		}
	}

}
