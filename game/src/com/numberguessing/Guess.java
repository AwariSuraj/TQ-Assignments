package com.numberguessing;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Guess {

	public static void main(String[] args) {

		System.out.println("===============================");
		System.out.println("             ENJOY YOUR GAME                    ");
		System.out.println("===============================");
		int n, n1;
		int random;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("press ' 1 ' :TO PLAY");
			System.out.println("press ' 2 ' :TO EXIT");
			n = sc.nextInt();
			if (n == 2) {
				break;
			} else {
				System.out.println("game wiil be start soon");
				random = ThreadLocalRandom.current().nextInt(1, 100);
				System.out.println("random=" + random);
				System.out.println("can you guess the number between 1 to 100  ?");
				int count = 0;
				while (true)

				{
					System.out.println();

					System.out.println("want to" + " CONTINUE " + "type " + "Y");
					System.out.println("want to" + "     STOP         " + "type " + "N");
					char a = sc.next().charAt(0);

					if (a == 'Y' || a == 'y') {

						System.out.println("-------------------please enter a number for guessing-------------------");
						System.out.println();
						n1 = sc.nextInt();

						System.out.println("number=" + n1);
						if (n1 < random) {
							System.out.println();
							System.out.println("-------------------- small number--------------");
							System.out.println("please enter a" + " -GREATER- " + "number ");
							count++;
						} else if (n1 > random) {
							System.out.println("--------------------greater number--------------");
							System.out.println("please enter a" + " -SMALL- " + "number ");
							count++;
						} else {
							System.out.println("you found " + "-CORRECT-" + " number");
							System.out.println();
							System.out.println("your score" + "  EXCELLENT");
							System.out.println("your attempt=" + count);
							break;
						}

					} else {
						break;
					}
				}

			}
		}

	}

}
