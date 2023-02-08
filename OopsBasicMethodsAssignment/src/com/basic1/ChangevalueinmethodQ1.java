package com.basic1;

public class ChangevalueinmethodQ1 {

	int num1;
	String name;
	int id;

	void take(int n, String na, int i) {
		num1 = n;
		name = na;
		id = i;
	}

	void display() {
		System.out.println("before changing");
		System.out.println("number=" + num1);
		System.out.println("name=" + name);
		System.out.println("id=" + id);
		System.out.println("-----------------------------");
		System.out.println("after changing");
		num1 = 15;
		name = "Awari";
		id = 123456;
		System.out.println("number=" + num1);
		System.out.println("name=" + name);
		System.out.println("id=" + id);

	}

	public static void main(String[] args) {

		ChangevalueinmethodQ1 c = new ChangevalueinmethodQ1();
		c.take(150, "suraj", 4789);
		c.display();
	}

}
