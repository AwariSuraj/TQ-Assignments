package com.ConditionalHw;

import java.util.Scanner;

public class TotalNoOfDaysInMonthHw34 {

	public static void main(String[] args) {

		System.out.println("enter a month to convert into Days");

		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int days = month * 30;
		System.out.println("After converting month into Days = " + days);

	}

}
