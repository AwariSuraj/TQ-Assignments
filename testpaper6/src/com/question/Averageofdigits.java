package com.question;

public class Averageofdigits {
	public static void average(int num1) {
		float count = 0;
		float sum = 0;
		while (num1 != 0) {
			int r = num1 % 10;
			sum = sum + r;
			count++;
			num1 /= 10;

		}
		float answer = sum / count;
		System.out.println(answer);
	}

	public static void main(String[] args) {
		int num = 125;
		average(num);

	}

}
