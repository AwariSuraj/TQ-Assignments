package com.employeedepartment;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee(12, "suraj", 42000f, new Department(4042, "computer"), new Mydate("june", 11, 2001));
		System.out.println(e);

	}

}
