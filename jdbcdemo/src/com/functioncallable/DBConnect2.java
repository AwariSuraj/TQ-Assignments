package com.functioncallable;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect2 {

	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/testcoursedb";
	public static final String USER = "root";
	public static final String PASS = "Suraj@2522";

	static Connection con = null;

	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			con = DriverManager.getConnection(JDBC_URL, USER, PASS);
		} catch (Exception e) {

			System.out.println(e);
		}
		return con;
	}

}
