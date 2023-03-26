package com.question;

import java.util.ArrayList;
import java.util.Scanner;

public class Searchelementarraylist {
	static Scanner sc = new Scanner(System.in);

	public static void search(ArrayList<Integer> num) {
		System.out.println("enter a element you have to Search");
		int n = sc.nextInt();
		boolean status = false;
		for (int i = 0; i < num.size(); i++) {
			if (n == num.get(i)) {
				System.out.println(num.get(i));

				status = true;
				break;
			}
		}
		if (status) {
			System.out.println("element found");
		} else {
			System.out.println("element not found");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();

		for (int i = 0; i <= 50; i++) {
			number.add(i);
		}
		search(number);

	}

}
