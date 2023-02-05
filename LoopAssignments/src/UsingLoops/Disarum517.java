package UsingLoops;

import java.util.Scanner;

public class Disarum517 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int num1 = num;
		int num2 = num;
		int sum = 0;

		int count = 0;
		while (num != 0) {
			int r = num % 10;
			count++;
			num /= 10;
		}
		while (num1 != 0) {

			int power = 1;
			int rem = num1 % 10;

			for (int j = 1; j <= count; j++) {
				power = power * rem;
			}
			num1 /= 10;
			count--;
			sum = sum + power;
		}

		System.out.println(sum);
		if (sum == num2) {

			System.out.println("the number is disarium");
		} else {
			System.out.println("the number is not a disarium");
		}

	}

}
