package com.ConditionalHw;

import java.util.Scanner;

public class BasicSalaryHw35 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a basic salary");
		float bs = sc.nextFloat();
		System.out.println("enter a house rent allowance in percentage");
		float hra = sc.nextFloat();
		float hraa = (bs * hra) / 100;
		System.out.println("enter a daily allowance in percentage");
		float da = sc.nextFloat();
		float dailya = (bs * da) / 100;

		float ts = bs + hraa + dailya;
		System.out.println("total salary is equal to" + ts);
	}

}
