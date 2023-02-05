package UsingLoops;

import java.util.Scanner;

public class FindFrequency510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("enter a number whose frequency you want");
		int n1 = sc.nextInt();
		while (n != 0) {

			int r = n % 10;
			if (r == n1) {
				count++;
			}
			n /= 10;
		}
		System.out.println("frequency digits =" + count);

	}

}
