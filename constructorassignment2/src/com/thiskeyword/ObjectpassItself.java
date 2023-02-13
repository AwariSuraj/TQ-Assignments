package com.thiskeyword;

class B {
	int n;
	int n1;

	// calling the object itself
	B() {
		n = 5;
		n1 = 10;
	}

	public void add(B a1) {
		this.n = this.n + a1.n;
		this.n1 = this.n1 + a1.n1;
	}

	public void Show() {
		System.out.println(this.n + " " + this.n1);
	}

}

public class ObjectpassItself {

	public static void main(String[] args) {
		B obj = new B();

		obj.add(obj);

		obj.Show();
	}

}
