package com.question;

public class countwordsandcharacter {
	public static void countwordschar(String s1) {
		String s2 = s1;
		String arr[] = s1.split("\\s");
		System.out.println("words=" + arr.length);
		char ch[] = s2.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				continue;
			}
			count++;
		}
		System.out.println("no of character =" + count);
	}

	public static void main(String[] args) {
		String s = "Suraj Navnath Awari";
		countwordschar(s);

	}

}
