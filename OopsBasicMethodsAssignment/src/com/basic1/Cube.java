package com.basic1;

import java.util.Scanner;

public class Cube {

	int num1;
	int cube;

	int cube(int num) {
		num1 = num;
		cube = num1 * num1 * num1;
		return cube;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cube s1 = new Cube();
		System.out.println("enter a number");
		int n = sc.nextInt();
		System.out.println("cube of number=" + s1.cube(n));
	}

}
