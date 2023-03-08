package com.question;

import java.util.Arrays;

public class Q11 {

	public static void alternate(int ar1[], int ar2[]) {
		int l1 = ar1.length;
		int l2 = ar2.length;
		int i, j;
		int marr[] = new int[l1 + l2];
		int k = 0;
		for (i = 0, j = 0; i < l1 && j < l2; i++, j++) {
			marr[k++] = ar1[i];
			marr[k++] = ar2[j];

		}
		while (i < l1) {
			marr[k++] = ar1[i++];

		}
		while (j < l2) {
			marr[k++] = ar2[j++];

		}
		System.out.println(Arrays.toString(marr));
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 11, 21, 31, 41 };
		alternate(arr1, arr2);

	}

}
