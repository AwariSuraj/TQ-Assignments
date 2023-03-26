package com.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		return (int) ((o2.getSalary() - o1.getSalary()));
	}

}

public class Sortemployes {

	public static void main(String[] args) {
		ArrayList<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(101, "suraj", 45000));
		list1.add(new Employee(101, "sahil", 35000));
		list1.add(new Employee(101, "awari", 5000));
		list1.add(new Employee(101, "avani", 75000));

		Collections.sort(list1, new SalaryComparator());
		for (Employee e1 : list1) {
			System.out.println(e1);
		}
	}

}
