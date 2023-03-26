package com.question;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylisttoarrayviceversa {

	public static void main(String[] args) {
		String str[] = { "suraj", "awari", "Sinhgad", "college" };
		// array to araylist;
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(str));
		System.out.println(list1);

		// arraylist to array;

		Object[] o1 = list1.toArray();
		System.out.println(Arrays.toString(o1));
	}

}
