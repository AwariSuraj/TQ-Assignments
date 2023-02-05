package UsingLoops;

import java.util.Scanner;

public class AcceptIndexAndPower514 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a base of number");
		int num1 = sc.nextInt();

		System.out.println("enter a power of number");
		int num2 = sc.nextInt();
		int power = 1;

		for (int i = 1; i <= num2; i++)

		{
			power = power * num1;
		}
		System.out.println("power of given number is " + power);

	}

}
