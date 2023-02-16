package com.staticoperation;

public class Car2 {

	public static int carno;
	public static String name;

	public Car2() {

	}

	public Car2(int carno, String name) {
		this.carno = carno;
		this.name = name;

	}

	public static int getCarno() {
		return carno;
	}

	public static void setCarno(int carno) {
		Car2.carno = carno;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Car2.name = name;
	}

	public String toString() {
		return "carno=" + carno + "  " + "name =" + name;

	}

	public static void main(String[] args) {

		Car2 c = new Car2(4042, "swift");
		System.out.println(c);
		System.out.println("-----------------------------------------------------------");

		Car2 c1 = new Car2(8082, "wagonar");
		System.out.println(c1);
		System.out.println("-----------------------------------------------------------");

		System.out.println(c);

	}

}
