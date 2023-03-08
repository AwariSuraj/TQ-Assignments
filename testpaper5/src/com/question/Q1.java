package com.question;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// find maximum and minimum

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a length of an array");
		int l = sc.nextInt();

		int arr[] = new int[l];
		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		System.out.print("maximum=" + arr[l - 1] + "   minimum=" + arr[0]);
	}

}
