package com.question;

public class Q10 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int highest = Integer.MIN_VALUE;
		int shighest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				shighest = highest;
				highest = arr[i];
			}
			if (arr[i] < highest && arr[i] > shighest) {
				shighest = arr[i];
			}

		}
		System.out.println("Second highest:" + shighest);
	}

}
