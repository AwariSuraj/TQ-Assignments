package com.basic;

public class MultipleObjectSameClassQ6 {

	float height;
	float weight;
	String name;

	void takeShow(float height1, float weight1, String s) {
		height = height1;
		weight = weight1;
		name = s;
		System.out.println("name=" + name);
		System.out.println("height=" + height + " cm");
		System.out.println("weight=" + weight + " kg");
	}

	public static void main(String[] args) {
		MultipleObjectSameClassQ6 m1 = new MultipleObjectSameClassQ6();
		MultipleObjectSameClassQ6 m2 = new MultipleObjectSameClassQ6();
		m1.takeShow(169, 62, "suraj");
		m2.takeShow(178, 78, "awari");

	}

}
