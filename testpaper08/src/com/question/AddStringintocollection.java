package com.question;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringintocollection {

	public static void main(String[] args) {
		String s[] = { "red", "white", "yellow", "green", "black" };
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(s));

		System.out.println(list1);

	}

}
