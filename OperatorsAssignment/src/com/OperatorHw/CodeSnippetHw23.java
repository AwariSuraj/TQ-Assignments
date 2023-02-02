package com.OperatorHw;

public class CodeSnippetHw23 {

	public static void main(String[] args) {
		int i = 10;
		int n = i++ % 5;
		System.out.println("using postfix");
		System.out.println("value of i= " + i);
		System.out.println("value of n= " + n);
		System.out.println();
		System.out.println("using prefix");
		int a = 10;
		int b = ++a % 5;
		System.out.println();
		System.out.println("value of a= " + a);
		System.out.println("value of b= " + b);
	}

}
