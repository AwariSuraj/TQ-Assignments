package com.OperatorCw;

import java.util.Scanner;

public class output1cw25 {

	public static void main(String[] args) {
		int a, b;
		int resulta, results, resultm;
		float resultd;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a:");
		a = sc.nextInt();
		System.out.print("Enter b:");
		b = sc.nextInt();
		resulta = a + b;
		results = a - b;
		resultm = a * b;
		resultd = (float) a / b;
		System.out.println("The result of adding is " + resulta);
		System.out.println("The result of subtracting is " + results);
		System.out.println("The result of multiplying is " + resultm);
		System.out.println("The result of dividing is " + resultd);

	}
}
