package com.question;

import java.util.ArrayList;

public class Retrievespecificelement {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();

		for (int i = 0; i <= 50; i++) {
			number.add(i);
		}
		number.get(5);// retrieve the element from given ArrayList
	}

}
