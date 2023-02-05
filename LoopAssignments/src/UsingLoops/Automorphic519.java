package UsingLoops;

import java.util.Scanner;

public class Automorphic519 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num1;
		int power = 2;

		int product = 1;
		int count = 0;
		num1 = sc.nextInt();
		int num2 = num1;
		int num3 = num1;
		for (int i = 1; i <= power; i++)

		{
			product = product * num1;
		}
		System.out.println("power of given number is " + product);

		while (num1 != 0) {
			int r = num1 % 10;
			count++;
			num1 /= 10;

		}
		// System.out.println("count " + count);
		int pr = 1;
		for (int i = 1; i <= count; i++) {
			pr = pr * 10;
		}
		int lastdigit = product % pr;
		// System.out.println("lastdigit " + lastdigit);
		// System.out.println("pr " + pr);

		if (lastdigit == num3) {
			System.out.println("the number is automorphic");
		} else {
			System.out.println("the number is not a automorphic");
		}

	}

}
