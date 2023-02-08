package com.basic1;

import java.util.Scanner;

public class Square {

	int num1;
	int square;

	int square(int num) {
		num1 = num;
		square = num1 * num1;
		return square;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Square s1 = new Square();
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("square of number=" + s1.square(n));
	}

}
