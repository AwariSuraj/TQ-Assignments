package com.jdbccollection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JdbcHashMap {
	Statement st;
	ResultSet rs;
	CallableStatement cst;
	static Connection con = null;
	HashMap<String, Float> imap;
	static Scanner sc = new Scanner(System.in);

	public JdbcHashMap() throws SQLException {
		con = DBConnect.getConnection();
		st = con.createStatement();
		imap = new HashMap<>();
	}

	void createMap() {
		try {
			rs = st.executeQuery("select * from item");

			while (rs.next()) {
				imap.put(rs.getString("itemName"), rs.getFloat("cost"));
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	void displayMap() {
		for (Map.Entry<String, Float> en : imap.entrySet()) {
			System.out.println(en.getKey() + "  :" + en.getValue());
		}

	}

	public static void main(String[] args) throws SQLException {
		JdbcHashMap h1 = new JdbcHashMap();
		h1.createMap();
		h1.displayMap();

	}

}
