package com.ConditionalHw;

import java.util.Scanner;

public class CheckingCharacterHw32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to check is it alphabet " + "digt or a special character");
		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'z') {
			System.out.println("character is a alphabet " + ch);

		} else if (ch >= '0' && ch <= '9') {
			System.out.println("the character is a digit " + ch);
		} else {
			System.out.println("the characer is a special character " + ch);
		}
	}

}
