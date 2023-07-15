package com.jdbccollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JdbcHashMap2 {

	Statement st;
	Statement st1;
	PreparedStatement pst;
	ResultSet rs;
	ResultSet rs1;

	static Connection con = null;

	// stores supplier name as Key and Item Names as Values
	HashMap<String, ArrayList<String>> smap;

	public JdbcHashMap2() throws SQLException {

		con = DBConnect.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		st1 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		smap = new HashMap<>();

	}

	void createMap() {
		ArrayList<String> itemNames;
		String sname = null;

		try {

			rs = st.executeQuery("select * from supplier");
			rs1 = st1.executeQuery("select * from item");

			rs.beforeFirst();
			while (rs.next()) {
				itemNames = new ArrayList<>();
				sname = rs.getString(2);
				rs1.beforeFirst();

				while (rs1.next()) {
					if (rs.getInt("supid") == rs1.getInt("supid")) {
						itemNames.add(rs1.getString(2));
					}
				}

				smap.put(sname, itemNames);
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	void displayMap() {
		for (Map.Entry<String, ArrayList<String>> en : smap.entrySet()) {
			System.out.println(en.getKey());
			System.out.println("Items are:");
			for (String i : en.getValue()) {
				System.out.print(i + "   ");
			}
			System.out.println();
			System.out.println("-----------------------------------------------");

		}

	}

	public static void main(String[] args) throws SQLException {

		JdbcHashMap2 h1 = new JdbcHashMap2();
		h1.createMap();
		h1.displayMap();

	}

}
