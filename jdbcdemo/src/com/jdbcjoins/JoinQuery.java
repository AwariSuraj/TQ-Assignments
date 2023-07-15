package com.jdbcjoins;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JoinQuery {
	static Connection con = null;
	static Scanner sc = new Scanner(System.in);
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	public JoinQuery() throws SQLException {
		con = DBConnect.getConnection();

		st = con.createStatement();
	}

	public void getItemsBySupplier(String fname) {
		String sql = "select i.* from item i join supplier s on i.supid =s.supid and s.firstname=? ";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, fname);
			rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("itemname") + "  " + rs.getFloat("cost"));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws SQLException {
		JoinQuery js = new JoinQuery();

		System.out.println("Enter the supplier name:");
		String name = sc.next();

		js.getItemsBySupplier(name);

	}
}
