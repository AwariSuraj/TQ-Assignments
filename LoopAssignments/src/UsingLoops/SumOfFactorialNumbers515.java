package UsingLoops;

import java.util.Scanner;

public class SumOfFactorialNumbers515 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int fac = 1;
			for (int j = 1; j <= i; j++) {
				fac = fac * j;
			}
			sum = sum + fac;
		}
		System.out.println("the of factorial upto n number is= " + sum);
	}

}
