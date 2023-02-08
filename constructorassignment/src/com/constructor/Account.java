package com.constructor;

import java.util.Scanner;

public class Account {

	long accountnumber;
	String customername;

	public void take(long acn, String n) {
		accountnumber = acn;
		customername = n;

	}

	public void show() {
		System.out.println("account number " + accountnumber);
		System.out.println("customer name " + customername);
	}

	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		System.out.println(a);
		System.out.println("coustomer account number= " + a.accountnumber);
		System.out.println("customer name " + a.customername);
		System.out.println("--------------------------");
		Account a1 = new Account();

		System.out.println("enter a account number");
		long n1 = sc.nextLong();
		System.out.println("enter a customer name");
		String s1 = sc.next();
		a1.take(n1, s1);
		a1.show();

	}

}
