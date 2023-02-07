package com.basic;

import java.util.Scanner;

public class SwitchQ16 {

	String country1;

	void takecountry(String country) {
		country1 = country;
		System.out.println(country);
	}

	void nationalgame()

	{

		switch (country1) {
		case "India": {
			System.out.println("national game is Hocky");
			break;
		}
		case "China": {
			System.out.println("natinal game is table tennis");
			break;

		}
		case "Bangaldesh": {
			System.out.println("natinal game is table kabaddi");
			break;
		}
		case "Italy": {
			System.out.println("natinal game is table Tennis");
			break;

		}
		case "United States": {
			System.out.println("natinal game is Baseball");
			break;
		}
		default: {
			System.out.println("you enter wrong country");
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter country name");
		SwitchQ16 s = new SwitchQ16();
		String s1 = sc.next();
		s.takecountry(s1);
		s.nationalgame();

	}

}
