package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchData {

	static Connection con = null;
	Statement st;
	ResultSet rs;

	public FetchData() {
		con = DBConnection.getConnection();

	}

	public void FetchCourseData() {
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from course");
			System.out.println("------------------Available course-------------------");
			while (rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				int duration = rs.getInt(3);
				int fees = rs.getInt(4);

				System.out.println(cid + "  " + cname + "  " + duration + "  " + fees);
				System.out.println();
			}
		} catch (SQLException e) {

			System.out.println(e);
			// e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		FetchData fd = new FetchData();
		fd.FetchCourseData();
	}

}
