package com.question9;

public class ReverseString {

	public static void reverse(String s1) {
		char ch[] = s1.toCharArray();
		int k = 0;
		char ch1[] = new char[ch.length];
		for (int i = ch.length - 1; i >= 0; i--) {
			ch1[k++] = ch[i];
		}
		String s2 = new String(ch1);
		System.out.println(s2);
	}

	public static void main(String[] args) {

		String s1 = "Avani";
		reverse(s1);
	}

}
