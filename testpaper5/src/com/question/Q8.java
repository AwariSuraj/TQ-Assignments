package com.question;

import java.util.Scanner;

class Car {
	int modelno;
	Machine m;

	public Car() {

	}

	public Car(int modelno, Machine m) {
		super();
		this.modelno = modelno;
		this.m = m;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public Machine getM() {
		return m;
	}

	public void setM(Machine m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Car [modelno=" + modelno + ", m=" + m + "]";
	}

}

class Machine {
	String machinetype;
	Engine e;

	public Machine() {

	}

	public Machine(String machinetype, Engine e) {
		this.machinetype = machinetype;
		this.e = e;
	}

	public String getMachinetype() {
		return machinetype;
	}

	public void setMachinetype(String machinetype) {
		this.machinetype = machinetype;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Machine [machinetype=" + machinetype + ", e=" + e + "]";
	}

}

class Engine {
	String enginetype;
	int price;

	public Engine() {

	}

	public Engine(String enginetype, int price) {
		super();
		this.enginetype = enginetype;
		this.price = price;
	}

	public String getEnginetype() {
		return enginetype;
	}

	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Engine [enginetype=" + enginetype + ", price=" + price + "]";
	}

}

public class Q8 {

	static Scanner sc = new Scanner(System.in);

	public static void carDetails(Car c2) {
		System.out.println("enter a modelno of the car ");
		c2.setModelno(sc.nextInt());
		Machine m = new Machine();
		machineDetails(m);
		c2.setM(m);
	}

	public static void machineDetails(Machine m1) {
		System.out.println("enter a machine Details");
		System.out.println("machine type");
		m1.setMachinetype(sc.next());
		Engine e = new Engine();
		engineDetails(e);
		m1.setE(e);

	}

	public static void engineDetails(Engine e1) {
		System.out.println("enter a engine type");
		e1.setEnginetype(sc.next());
		System.out.println("enter a engine price");
		e1.setPrice(sc.nextInt());
	}

	public static void main(String[] args) {

		Car c = new Car(120, new Machine("dieselmachine", new Engine("fourstroke", 20000)));
		System.out.println(c);
		System.out.println("====================================");
		Car c1 = new Car();
		carDetails(c1);
		System.out.println(c1);
	}

}
