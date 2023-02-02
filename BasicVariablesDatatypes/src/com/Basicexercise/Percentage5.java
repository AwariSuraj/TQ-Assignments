package com.Basicexercise;

import java.util.Scanner;

public class Percentage5 {

	public static void main(String[] args) {
		int a, b, c, d, e, per, total;
		System.out.println("enter you subject marks");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		per = (a + b + c + d + e) / 5;
		total = (a + b + c + d + e);
		System.out.println("your total marks is equal to " + total);

		System.out.println("your percentage is equal to " + per + "%");

	}

}
