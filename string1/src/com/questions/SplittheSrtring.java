package com.questions;

import java.util.Arrays;

public class SplittheSrtring {
	public static void split(String s1) {
		s1 = s1.toLowerCase();
		String st[] = s1.split("\\s");
		System.out.println(Arrays.toString(st));
	}

	public static void main(String[] args) {
		String s = "Suraj Navnath Awari";
		split(s);
	}

}
