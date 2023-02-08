package com.constructor;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private float salary;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setSalary(float salary) {
		this.salary = salary;

	}

	public float getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("enter employee id");
		e1.setId(sc.nextInt());

		System.out.println("enter employee name");
		e1.setName(sc.next());

		System.out.println("enter your Salary");
		e1.setSalary(sc.nextFloat());

		System.out.println("id=" + e1.getId());
		System.out.println("Name=" + e1.getName());
		System.out.println("Salary=" + e1.getSalary());

	}
}
