package com.multilevelinheritance;

class Vehicle {
	String vehicletype = "car";

}

class Car extends Vehicle {
	String brand = "maruti";

}

class Maruti extends Car {
	float speed = 120;

}

public class Multilevel {

	public static void main(String[] args) {
		Maruti m = new Maruti();
		System.out.println(m.vehicletype + " " + m.brand + " " + m.speed);
	}

}
