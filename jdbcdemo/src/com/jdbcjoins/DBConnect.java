package com.jdbcjoins;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/productdb";
	public static final String USER = "root";
	public static final String PASS = "Suraj@2522";

	static Connection con = null;

	public static Connection getConnection() {
		try {

			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded");

			con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			System.out.println("Connection done..");

		} catch (Exception e) {

			System.out.println("Exception occured:" + e);
		}

		return con;
	}

	public static void main(String[] args) {

		getConnection();
	}

}
