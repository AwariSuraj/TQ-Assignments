package com.functioncallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StoredProcedurecallable {
	Statement st;
	ResultSet rs;
	CallableStatement cst;
	static Connection con = null;
	static Scanner sc = new Scanner(System.in);

	public StoredProcedurecallable() throws SQLException {
		con = DBConnect2.getConnection();
		System.out.println("connection established");
		st = con.createStatement();
	}

	void callProcedureEmpCount() {
		try {
			cst = con.prepareCall("{ call empCount()}");
			boolean status = cst.execute();
			if (status) {
				rs = cst.getResultSet();
				System.out.println("Dept Id     |  no of employee");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + "       " + rs.getInt(2));
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws SQLException {
		StoredProcedurecallable st = new StoredProcedurecallable();
		st.callProcedureEmpCount();

	}

}
