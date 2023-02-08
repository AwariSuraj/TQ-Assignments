package com.constructor;

public class Parameterizedconstructor {

	int value;
	int length;
	int weight;

	public Parameterizedconstructor(int value, int length, int weight)

	{

		System.out.println("i am in the parameterized constructor");

		this.value = value;
		this.length = length;
		this.weight = weight;

		System.out.println("value=" + value + " laegth=" + length + " weight=" + weight);

	}

	public static void main(String[] args) {
		Parameterizedconstructor p = new Parameterizedconstructor(12, 52, 89);

	}

}
