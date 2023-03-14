package com.question;

public class Repeatedwordstring {
	public static void repeatedword(String s1) {
		String arr[] = s1.split("\\s");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (arr[i].equals("null")) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					arr[j] = "null";

				}
			}
			if (count >= 2)
				System.out.println(arr[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		String s = "geeks for geeks is better than geeks ";
		repeatedword(s);
	}

}
