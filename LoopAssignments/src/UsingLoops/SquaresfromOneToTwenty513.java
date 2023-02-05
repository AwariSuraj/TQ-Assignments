package UsingLoops;

import java.util.Scanner;

public class SquaresfromOneToTwenty513 {

	public static void main(String[] args) {
		System.out.println("enter a two number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int power;
		for (int i = n; i <= n1; i++) {

			power = 1;

			for (int j = 1; j <= 2; j++) {
				power = power * i;
			}
			System.out.println(i + " = " + power);

		}
	}
}