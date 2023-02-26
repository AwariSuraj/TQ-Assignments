package com.question;

public class Q10numberofstudent {

	private String name;
	private int id;
	private static int num = 0;

	{
		num++;
	}

	public Q10numberofstudent() {

	}

	public Q10numberofstudent(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}

	public static void main(String[] args) {
		Q10numberofstudent n = new Q10numberofstudent("suraj", 12);
		// System.out.println(num);
		Q10numberofstudent n1 = new Q10numberofstudent("Akash", 15);

		System.out.println(n);
		System.out.println(n1);

		System.out.println(num);
	}

}
