package com.ConditionalHw;

import java.util.Scanner;

public class ElectricityBillHw36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a electricity consumption units");
		float unit = sc.nextFloat();

		if (unit <= 50) {
			float totalbill = (unit * 0.50f);
			System.out.println("Totalbill= " + totalbill);
		} else if (unit > 50 && unit <= 100) {
			float totalbill = (unit * 0.75f);
			System.out.println("total bill = " + totalbill);
		} else if (unit > 100 && unit <= 250) {
			float totalbill = (unit * 1.20f);
			System.out.println("total bill = " + totalbill);
		} else {
			float totalbill = (unit * 1.50f);
			float Additionalcharge = (totalbill * 20) / 100;
			totalbill += Additionalcharge;
			System.out.println("total bill = " + totalbill);
		}

	}

}
