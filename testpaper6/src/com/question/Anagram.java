package com.question;

public class Anagram {

	public static void isAnagram(char chh1[], char chh2[]) {

		sort(chh1);
		sort(chh2);
		equal(chh1, chh2);
	}

	public static void sort(char ch2[]) {
		for (int i = 0; i < ch2.length; i++) {
			for (int j = i + 1; j < ch2.length; j++) {
				char temp;
				if (ch2[i] > ch2[j]) {
					temp = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = temp;
				}
			}
		}
	}

	public static void equal(char ch1[], char ch2[]) {
		int flag = 1;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				flag = 0;
				break;
			}

		}
		if (flag == 1) {
			System.out.println("Anagram");
		} else {
			System.out.println(" not an Anagram");
		}
	}

	{

	}

	public static void main(String[] args) {
		String s1 = "suraj";
		String s2 = "usaaj";
		if (s1.length() != s2.length()) {
			System.out.println("String is not a anagram");
		} else {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			isAnagram(ch1, ch2);
		}

	}

}
