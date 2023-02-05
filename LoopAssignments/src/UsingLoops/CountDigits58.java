package UsingLoops;

import java.util.Scanner;

public class CountDigits58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int count = 0;
		while (n != 0) {

			int r = n % 10;
			System.out.println("extract digits are " + r);
			count++;
			n /= 10;
		}
		System.out.println("total number of digits in your number = " + count);

	}

}
