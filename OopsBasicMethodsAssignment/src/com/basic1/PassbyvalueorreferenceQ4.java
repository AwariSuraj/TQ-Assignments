package com.basic1;

public class PassbyvalueorreferenceQ4 {

	int id;
	String name;

	void display(int id, String name) {
		id = 123;

		name = "Awari";

		System.out.println("by chageing the value ");
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		System.out.println("-----------------");
		System.out.println("because we are not initialize instance variable");
		System.out.println("id=" + this.id);
		System.out.println("name=" + this.name);
	}

	public static void main(String[] args) {

		int id = 456;
		String name = "suraj";
		PassbyvalueorreferenceQ4 q = new PassbyvalueorreferenceQ4();
		q.display(id, name);

		System.out.println("-----------------");

		System.out.println("strictly pass by value because actual value does not changes");
		System.out.println("id=" + id);
		System.out.println("name=" + name);

	}

}
