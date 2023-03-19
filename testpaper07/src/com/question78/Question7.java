package com.question78;

import java.io.IOException;

public class Question7 {
	public void method() throws IOException {
		throw new IOException("error i/o");
	}

	public void method1() throws IOException {
		method();
	}

	public void method2() throws IOException {
		method1();
	}

	public static void main(String[] args) {

		Question7 p = new Question7();
		try {
			p.method2();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
