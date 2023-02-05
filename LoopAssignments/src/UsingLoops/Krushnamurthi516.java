package UsingLoops;

import java.util.Scanner;

public class Krushnamurthi516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int n1 = n;
		int sum = 0;
		while (n != 0) {

			int r = n % 10;
			int fac = 1;
			for (int j = 1; j <= r; j++) {
				fac = fac * j;
			}
			sum = sum + fac;
			n /= 10;
		}
		System.out.println("the sum of factorial upto n number is=" + sum);
		if (sum == n1) {
			System.out.println("the number is krushnamurthi");
		} else {
			System.out.println("the number is not a krushnamurthi");
		}

	}

}
