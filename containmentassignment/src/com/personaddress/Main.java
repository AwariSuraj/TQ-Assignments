package com.personaddress;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void studentDetails(Person p1) {
		Address a = new Address();
		System.out.println("enter a person name");
		p1.setName(sc.next());
		System.out.println("enter a person age");
		p1.setAge(sc.nextInt());
		System.out.println("enter a person gender");
		p1.setGender(sc.next());
		addressDetails(a);
		p1.setAddress(a);

	}

	public static void addressDetails(Address a1) {
		System.out.println("enter a city");
		a1.setCity(sc.next());
		System.out.println("enter a state");
		a1.setState(sc.next());
		System.out.println("enter a country");
		a1.setCountry(sc.next());
	}

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p);
		studentDetails(p);
		System.out.println(p);

	}

}
