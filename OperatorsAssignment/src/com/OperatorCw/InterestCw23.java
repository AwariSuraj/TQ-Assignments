package com.OperatorCw;

import java.util.Scanner;

public class InterestCw23 {

	public static void main(String args[]) {
		double principle, rate, time, finterest;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a principle");
		principle = sc.nextDouble();
		System.out.println("enter a rate");
		rate = sc.nextDouble();
		System.out.println("enter a time in year");
		time = sc.nextDouble();
		finterest = principle * rate * time / 100;
		System.out.println("final interest is equal to " + finterest);

	}

}
