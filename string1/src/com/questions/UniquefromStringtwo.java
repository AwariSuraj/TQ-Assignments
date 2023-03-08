package com.questions;

import java.util.Scanner;

public class UniquefromStringtwo {
	static Scanner sc = new Scanner(System.in);

	public static void checkTwoString(String s3[], String s4[]) {
		boolean flag = false;
		for (String s : s4) {
			flag = false;
			for (String s1 : s3) {
				if (s1.equals(s)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		String s1[] = { "Suraj", "abhi", "kishor", "Avani" };
		String s2[] = { "sahil", "onkar", "Suraj", "raj" };
		checkTwoString(s1, s2);
	}

}
