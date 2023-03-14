package com.question;

public class Noofwords {
	public static void countWords(String s1) {
		String s2[] = s1.split("\\s");
		System.out.println(s2.length);
	}

	public static void main(String[] args) {
		String s = "Awari Suraj Navnath";
		countWords(s);
	}

}
