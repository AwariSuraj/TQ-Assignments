package com.questions;

import java.util.Scanner;

public class Anagram {

	public static void sort(char ch[]) {

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				char temp;
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
	}

	public static boolean equal(char chr1[], char chr2[]) {
		boolean status = true;
		for (int i = 0; i < chr1.length; i++) {
			if (chr1[i] != chr2[i]) {
				status = false;
			}
		}
		return status;
	}

	public static void checkAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if (str1.length() == str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();

			sort(ch1);
			sort(ch2);

			if (equal(ch1, ch2)) {
				System.out.println("string  is  anagram");
			} else {
				System.out.println("string is not an  anagram");
			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first String");
		String s1 = sc.next();
		System.out.println("enter the second String");
		String s2 = sc.next();
		checkAnagram(s1, s2);
	}

}
