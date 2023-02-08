package com.basic1;

import java.util.Scanner;

public class OnemethodcallinganotherQ2 {

	int id;

	int getid(int i) {
		id = i;
		return id;
	}

	void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your id");
		int i1 = sc.nextInt();
		int ans = getid(i1);
		System.out.println("id=" + ans);
	}

	public static void main(String[] args) {

		OnemethodcallinganotherQ2 o = new OnemethodcallinganotherQ2();
		o.display();

	}

}
