package com.conditionalCw;

import java.util.Scanner;

public class YearIsLeapCw31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year to check it leap or not");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

}
