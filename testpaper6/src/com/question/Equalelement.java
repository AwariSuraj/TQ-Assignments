package com.question;

public class Equalelement {
	public static void equal(String arr[], String arr1[]) {
		String arr2[] = new String[10];
		int k = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr1.length; j++) {
				if (arr[i].equals(arr1[j])) {
					arr2[k++] = arr1[j];
					count++;
				}
			}

		}
		for (int i = 0; i < count; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	public static void main(String[] args) {

		String arr[] = { "java", "c", "python", "oracle" };
		String arr1[] = { "Angular", "Springboot", "java", "Sql", "oracle" };
		System.out.println("accd");
		equal(arr, arr1);
	}

}
