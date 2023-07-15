package com.functioncallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class FunctionCallDemo {
	Statement st;
	ResultSet rs;
	CallableStatement cst;
	static Connection con = null;

	static Scanner sc = new Scanner(System.in);

	public FunctionCallDemo() throws SQLException

	{
		con = DBConnect2.getConnection();
		st = con.createStatement();
	}

	void callAddNumberFunction(int n1, int n2) {
		try {
			cst = con.prepareCall("{ ?=call addNum(?,?)}");
			cst.setInt(2, n1);
			cst.setInt(3, n2);
			cst.registerOutParameter(1, Types.INTEGER);

			boolean status = cst.execute();

			if (!status) {
				System.out.println(" the answer is : " + cst.getInt(1));
			} else {
				System.out.println("error");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws SQLException {
		FunctionCallDemo fd = new FunctionCallDemo();
		System.out.println("enter a first num");
		int num1 = sc.nextInt();
		System.out.println("enter a second num");
		int num2 = sc.nextInt();
		fd.callAddNumberFunction(num1, num2);
	}
}
