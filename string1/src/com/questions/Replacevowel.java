package com.questions;

public class Replacevowel {
	public static void replace(String s) {
		String s2 = s.toLowerCase();
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = '@';
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {
		String s = "java";
		replace(s);

	}

}
