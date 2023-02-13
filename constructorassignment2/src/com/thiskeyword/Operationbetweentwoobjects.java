package com.thiskeyword;

class A {
	int x;
	int y;
	int z;

	public void setX(int x) {
		this.x = x;

	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;

	}

	public int getY() {
		return y;
	}

	public void add(A o3) {
		this.x = this.x + o3.x;
		this.y = this.y + o3.y;
	}

	public void show() {
		System.out.println(this.x);
		System.out.println(this.y);

	}
}

public class Operationbetweentwoobjects {

	public static void main(String[] args) {
		A o = new A();
		o.setX(5);
		o.setY(10);
		A o1 = new A();
		o1.setX(10);
		o1.setY(10);
		System.out.println("Adding members of two objects");
		o.add(o1);
		o.show();

	}

}
