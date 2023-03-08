package com.questions;

public class Replacefirstletter {
	public static void convert(String st) {
		st = st.toLowerCase();
		char ch[] = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
				if (ch[i] >= 'a' && ch[i] <= 'z') {
					ch[i] = (char) ((char) ch[i] - 32);
				}

			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) ((char) ch[i] + 32);
			}
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {

		String str = "geeks for geeks";
		convert(str);
	}

}
