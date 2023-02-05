package UsingLoops;

import java.util.Scanner;

public class PrimeBtweenTwoNumbers11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number");
		int n1 = sc.nextInt();
		System.out.println("enter a second number");
		int n2 = sc.nextInt();

		for (int i = n1; i <= n2; i++) {
			int j;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;

				}
			}
			if (j == i) {
				System.out.println(i);
			}

		}

	}

}
