package com.questions;

public class Countwords {
	public static void countWords(String s1) {
		String s2 = s1.trim();
		char ch[] = s2.toCharArray();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;

			}
		}
		System.out.println("number of words " + count);
	}

	public static void main(String args[]) {
		String s = "Suraj Navnath Awari";
		countWords(s);
	}
}
