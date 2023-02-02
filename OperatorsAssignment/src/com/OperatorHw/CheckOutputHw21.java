package com.OperatorHw;

public class CheckOutputHw21 {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		int c = 3;
		System.out.println(a++ + b * ++c);
		System.out.println("a = " + a + " b= " + b + " c = " + c);
		System.out.println(b * 5 / a + b++ + b);
		System.out.println("a = " + a + " b= " + b + " c = " + c);
	}

}
