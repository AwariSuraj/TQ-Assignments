package com.question;

//average of a numbers digits;
import java.util.Scanner;

public class Q7 {
	static Scanner sc = new Scanner(System.in);

	public static void averageOfDigits(int x) {
		int count = 0;
		int sum = 0;
		while (x != 0) {
			int r = x % 10;
			count++;
			sum = sum + r;
			x /= 10;
		}
		float average = (float) sum / count;
		System.out.println(average);
	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		int n = sc.nextInt();
		averageOfDigits(n);

	}

}
