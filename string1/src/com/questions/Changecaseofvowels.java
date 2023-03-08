package com.questions;

public class Changecaseofvowels {

	public static void changeCaseVowels(String s1) {
		char ch[] = s1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = (char) ((char) ch[i] - 32);
			} else if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				ch[i] = (char) ((char) ch[i] + 32);
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		String s = "aeIoU";
		changeCaseVowels(s);
	}

}
