package com.questions;

import java.util.Scanner;

public class Uniquecharacter {

	public static void unique(String s1) {
		int count;
		char ch[] = s1.toCharArray();
		System.out.println("unique character");
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
			if (count == 1) {
				System.out.println(ch[i] + "   ");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = sc.next();
		unique(s);

	}

}
