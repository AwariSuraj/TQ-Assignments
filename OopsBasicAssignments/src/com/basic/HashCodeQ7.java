package com.basic;

public class HashCodeQ7 {

	int a;
	int b;
	int c;

	void Show(int n1, int n2) {
		a = n1;
		b = n2;
		c = a + b;
		System.out.println("Addition=" + c);
	}

	public static void main(String[] args) {

		HashCodeQ7 h1 = new HashCodeQ7();
		HashCodeQ7 h2 = new HashCodeQ7();
		int hashvalue1 = h1.hashCode();
		int hashvalue2 = h2.hashCode();

		System.out.println("hash value of first object " + hashvalue1);
		System.out.println("hash value of Second object " + hashvalue2);
	}

}
