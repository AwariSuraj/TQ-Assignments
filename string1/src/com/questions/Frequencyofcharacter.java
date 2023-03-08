package com.questions;

public class Frequencyofcharacter {
	public static void frequency(String s1) {
		int count;
		char ch[] = s1.toCharArray();
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
			System.out.println(ch[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		String s = "Suraj awari";
		frequency(s);
	}

}
