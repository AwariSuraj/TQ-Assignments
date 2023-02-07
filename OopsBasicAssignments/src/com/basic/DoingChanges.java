package com.basic;

public class DoingChanges {

	int id;
	String name;

	void take(int n, String n1) {
		id = n;
		name = n1;

	}

	void show() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);

	}

	public static void main(String[] args) {
		DoingChanges d1 = new DoingChanges();
		d1.take(20, "suraj");
		d1.show();
		d1.id = 45;
		d1.name = "akole";
		System.out.println("changing the value of id=" + d1.id);
		System.out.println("changing the value of name=" + d1.name);
		d1.show();
		System.out.println("second object");
		DoingChanges d2 = new DoingChanges();
		d2.take(96, "pune");
		d2.show();

	}

}
