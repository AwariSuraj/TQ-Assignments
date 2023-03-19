package com.methodoverriding;

class Kid {
	int id1 = 101;

	void readbook() {
		System.out.println("students are reading the book");
	}

	void readbook(String name, int id) {
		System.out.println(name + " " + id + "  this student are read the book");
	}
}

class Bigkid extends Kid {
	int id1 = 123;

	void readbook(String name, int id) {
		System.out.println(name + " " + id + " this student read the book");
		super.readbook("Suraj", 101);

		System.out.println(super.id1);

	}
}

public class Library1 {

	public static void main(String[] args) {

		Bigkid bk = new Bigkid();
		bk.readbook("awari", 145);
	}

}
