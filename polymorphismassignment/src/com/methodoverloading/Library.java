package com.methodoverloading;

class Kid {

	void readbook() {
		System.out.println("students are reading the book");
	}

	void readbook(String name, int id) {
		System.out.println(name + " " + id + "  this student are read the book");
	}
}

public class Library {

	public static void main(String[] args) {

		Kid k = new Kid();
		k.readbook();
		k.readbook("suraj", 12);

	}

}
