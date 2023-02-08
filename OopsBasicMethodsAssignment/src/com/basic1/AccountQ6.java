package com.basic1;

import java.util.Scanner;

public class AccountQ6 {

	float balance;
	String acname;
	String bank;

	void insert(float b, String name, String bname) {
		balance = b;
		acname = name;
		bank = bname;

	}

	void display() {
		System.out.println("account information");
		System.out.println("bank name " + bank);
		System.out.println("account holder name " + acname);
		System.out.println("initial balance " + balance);

	}

	void deposit() {
		System.out.println("enter a amount for the deposit");
		Scanner sc = new Scanner(System.in);
		float deposit1 = sc.nextFloat();
		balance = balance + deposit1;
	}

	void withdraw() {
		System.out.println("enter a amount for the withdraw");
		Scanner sc = new Scanner(System.in);
		float withdraw1 = sc.nextFloat();
		balance = balance - withdraw1;

	}

	void checkbalance() {
		System.out.println("balance = " + balance);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountQ6 a = new AccountQ6();
		System.out.println("enter a bank name");
		String bname = sc.next();
		System.out.println("enter a Account holder name");
		String aname = sc.next();
		System.out.println("enter a initial balance");
		float bal = sc.nextFloat();

		a.insert(bal, aname, bname);
		a.display();
		a.deposit();
		a.checkbalance();
		a.withdraw();
		a.checkbalance();

	}

}
