package com.questions;

import java.util.Scanner;

public class Duplicatecharacter {
	public static void duplicate(String s1) {
		int count;
		char ch[] = s1.toCharArray();
		System.out.println("duplicate character");
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if (ch[i] == '\0' || ch[i] == ' ') {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			if (count > 1) {
				System.out.print(ch[i] + ":" + count + "   ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		duplicate(s);

	}

}
