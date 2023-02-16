package com.singleinheritance;

class Animal {

	int legs;
	int eyes;

	public Animal() {

		this.legs = 4;
		this.eyes = 2;
	}

	public String toString() {
		return "Animal [legs=" + legs + ", eyes=" + eyes + "]";
	}

}

class Dog extends Animal {
	String color;
	String breed;

	public Dog() {

	}

	public Dog(String color, String breed) {
		super();
		this.color = color;
		this.breed = breed;
	}

	public String toString() {
		return super.toString() + "Dog [color=" + color + ", breed=" + breed + "]";
	}

}

public class Single {

	public static void main(String[] args) {

		Dog d = new Dog("black", "lab");
		System.out.println(d);
	}

}
