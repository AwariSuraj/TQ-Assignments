package com.questions;

import java.util.Arrays;

public class Lengthconcatreverse {

	public static void main(String[] args) {
		String s = "suraj";
		System.out.println(s.length());
		String s2 = s.concat("Awari");
		System.out.println(s2);
		char ch[] = s.toCharArray();
		char ch1[] = new char[ch.length];
		int k = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
			ch1[k] = ch[i];
			k++;
		}
		System.out.println("reverse = " + Arrays.toString(ch1));
	}

}
