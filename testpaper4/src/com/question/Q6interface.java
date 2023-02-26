package com.question;

interface manager {
	String name = "suraj";
	int id = 123;

	public abstract void incrementSalary();
}

class Employee implements manager {
	float salary = 50000;

	public void incrementSalary() {
		salary = salary + 10000;
		System.out.println(id + "  " + name + "  " + "increment Salary=" + salary);
	}
}

public class Q6interface {
	public static void main(String[] args) {

		Employee e = new Employee();
		e.incrementSalary();
	}
}
