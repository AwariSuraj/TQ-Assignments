package com.conditionalCw;

import java.util.Scanner;

public class VowelConsonantCwCw34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character to check vowel consonant");
		char ch = sc.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println("the Character is vowel " + ch);
		else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("the Character is vowel " + ch);

		} else {
			System.out.println("the character is a consonant " + ch);
		}
	}

}
