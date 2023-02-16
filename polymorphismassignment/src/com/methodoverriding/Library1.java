package com.methodoverriding;

class Kid {

	void readbook() {
		System.out.println("students are reading the book");
	}

	void readbook(String name, int id) {
		System.out.println(name + " " + id + "  this student are read the book");
	}
}

class Bigkid extends Kid {
	void readbook(String name, int id) {
		System.out.println(name + " " + id + " this student read the book");
	}
}

public class Library1 {

	public static void main(String[] args) {

		Bigkid bk = new Bigkid();
		bk.readbook("awari", 21);
	}

}
