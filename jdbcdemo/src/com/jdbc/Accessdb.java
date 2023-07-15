package com.jdbc;

import java.sql.Connection;

public class Accessdb {

	static Connection con = null;

	public Accessdb() {
		con = DBConnection.getConnection();
		System.out.println("connection done");
	}

	public static void main(String args[]) {
		Accessdb obj = new Accessdb();
	}
}
