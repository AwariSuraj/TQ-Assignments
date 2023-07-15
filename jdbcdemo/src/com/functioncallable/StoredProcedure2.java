package com.functioncallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StoredProcedure2 {
	Statement st;
	ResultSet rs;
	CallableStatement cst;
	static Connection con = null;
	static Scanner sc = new Scanner(System.in);

	public StoredProcedure2() throws SQLException {
		con = DBConnect2.getConnection();
		System.out.println("connection established");
		st = con.createStatement();
	}

	public static void main(String[] args) {

	}

}
