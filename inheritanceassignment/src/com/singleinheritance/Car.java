package com.singleinheritance;

class Vehicle {

	int power = 200;
	String color;
}

class Car1 extends Vehicle {

	int wheels;
	int seatcapacity;

	public void show() {
		System.out.println("in child");
	}
}

public class Car {

	public static void main(String[] args) {

		Car1 c = new Car1();

		c.color = "white";
		c.wheels = 4;
		c.seatcapacity = 7;
		c.show();
		System.out.println("power " + c.power + "  color " + c.color + "  wheels " + c.wheels + "  seatcapacity "
				+ c.seatcapacity);

	}

}
