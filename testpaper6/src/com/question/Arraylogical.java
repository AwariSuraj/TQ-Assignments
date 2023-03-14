package com.question;

import java.util.Arrays;
import java.util.Scanner;

public class Arraylogical {

	public static void sorteven(int arr1[]) {
		int ar[] = new int[arr1.length];
		int k = 0;
		for (int i = arr1.length / 2; i < arr1.length; i++) {
			ar[k++] = arr1[i];
		}
		for (int i = 0; i < (arr1.length / 2); i++) {
			ar[k++] = arr1[i];
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void sortodd(int arr2[]) {
		int ar[] = new int[arr2.length];
		int k = 0;
		for (int i = (arr2.length / 2) + 1; i < arr2.length; i++) {
			ar[k++] = arr2[i];
		}
		for (int i = (arr2.length / 2); i >= 0; i--) {
			ar[k++] = arr2[i];
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of an Array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n % 2 == 0) {
			sorteven(arr);
		} else {
			sortodd(arr);
		}
	}

}
