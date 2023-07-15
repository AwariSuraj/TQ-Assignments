package com.questions;

import java.util.Scanner;

public class Changecaseofchar {
	public static void changecase(String s1) {
		char ch1 = 32;
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = (char) ((char) ch[i] - ch1);
			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) ((char) ch[i] + ch1);
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String s = sc.next();
		changecase(s);
		String s1 = "abc";
		System.out.println(s1);
		s1 = "def";

		System.out.println(s1);
	}

}
