package UsingLoops;

import java.util.Scanner;

public class ProductOfDigits59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int product = 1;
		while (n != 0) {

			int r = n % 10;

			product = product * r;
			n /= 10;
		}
		System.out.println("product of total digits = " + product);

	}

}
