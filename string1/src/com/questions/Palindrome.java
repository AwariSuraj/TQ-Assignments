package com.questions;

import java.util.Arrays;

public class Palindrome {
	public static void checkPalindrome(String s1) {
		int l = s1.length();
		char ch[] = s1.toCharArray();
		char ch1[] = new char[l];
		int k = 0;
		for (int i = ch.length - 1, j = 0; i >= 0 && j < l + 1; i--, j++) {
			ch1[j] = ch[i];

		}
		System.out.println(Arrays.toString(ch1));
		equal(ch, ch1);
	}

	public static void equal(char c[], char c1[]) {
		boolean status = true;
		for (int i = 0; i < c.length; i++) {

			if (c[i] != c1[i]) {
				status = false;
			}
		}
		if (status) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {

		String s = "radar";
		checkPalindrome(s);

	}

}
