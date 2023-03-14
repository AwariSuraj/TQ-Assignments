package com.question;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private float salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Arrayemployesdecreasing {
	static Scanner sc = new Scanner(System.in);

	public static void details(Employee e1) {
		System.out.println("enter a id");
		e1.setId(sc.nextInt());
		System.out.println("enter a name");
		e1.setName(sc.next());
		System.out.println("enter a salary");
		e1.setSalary(sc.nextFloat());
	}

	public static void sort(Employee e2[]) {
		Employee e;
		for (int i = 0; i < e2.length; i++) {
			// float temp;
			for (int j = i + 1; j < e2.length; j++) {
				if (e2[i].getSalary() < e2[j].getSalary()) {
					e = e2[i];
					e2[i] = e2[j];
					e2[j] = e;

				}
			}
		}
		for (Employee em : e2) {
			System.out.print(em + " ");
		}
	}

	public static void main(String[] args) {

		Employee e[] = new Employee[3];
		for (int i = 0; i < 3; i++) {
			e[i] = new Employee();
			details(e[i]);
		}
		sort(e);
	}

}
