package com.questions;

public class Nextalphabet {
	public static void nextAlphabet(String s1) {
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ((char) ch[i] + 1);

		}
		System.out.println(ch);
	}

	public static void main(String[] args) {

		String s = "java";
		nextAlphabet(s);
	}

}
