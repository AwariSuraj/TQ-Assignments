package com.wrapperdemo;

public class Wrapper {

	public static void main(String[] args) {
		int a = 5;
		Integer n = a;// autoboxing
		int n1 = n;// unboxing

		float f = 41f;
		Float nf = f; // autoboxing
		float nf1 = nf; // unboxing

		char ch = 'a';
		Character c = ch;
		char ch1 = c;

		long l = 456;
		Long ln = l;
		long l1 = ln;

		double d = 455;
		Double dou = d;
		double d1 = dou;

		byte b = 12;
		Byte by = b;
		byte b1 = by;

		short s = 45;
		Short sh = s;
		short s1 = sh;

		boolean bl = true;
		Boolean boo = bl;
		boolean bl1 = boo;

	}

}
