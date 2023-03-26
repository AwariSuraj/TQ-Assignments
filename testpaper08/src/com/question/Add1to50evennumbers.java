package com.question;

import java.util.ArrayList;
import java.util.Iterator;

public class Add1to50evennumbers {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();

		for (int i = 0; i <= 50; i++) {
			number.add(i);
		}

		Iterator<Integer> itr = number.iterator();
		while (itr.hasNext()) {
			if ((itr.next()) % 2 != 0) {
				System.out.println(itr.next());
			}
		}
	}

}
