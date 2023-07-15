package com.resultsetcrudcourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CrudCourse {

	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	static Connection con = null;
	static Scanner sc = new Scanner(System.in);

	public CrudCourse() throws SQLException {
		con = DBConnect.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("select * from course");

	}

	public void getCourseDetails() throws SQLException {
		rs.beforeFirst();
		while (rs.next()) {
			int cid = rs.getInt(1);
			String cname = rs.getString(2);
			int duration = rs.getInt(3);
			int fees = rs.getInt(4);

			System.out.println("\t" + cid + "\t\t" + cname + "\t\t\t\t" + duration + "\t\t\t\t" + fees);
		}

	}

	public void updateCourseFees(int id) {
		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == id) {
					System.out.println(rs.getString(2) + "    old fees: " + rs.getInt(4));

					System.out.println("enter the new fees");
					int fees = sc.nextInt();
					rs.updateFloat(4, fees);
					rs.updateRow();
				}
			}
			getCourseDetails();

		} catch (Exception e)

		{
			System.out.println(e);
		}
	}

	public void deleteCourse(int id) {
		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == id) {
					rs.deleteRow();
				}
			}
			getCourseDetails();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertCourse() {
		try {
			rs.moveToInsertRow();
			System.out.println("Enter course id:");
			int cid = sc.nextInt();
			System.out.println("Enter the course  name:");
			String cname = sc.next();
			System.out.println("Enter duration");
			int duration = sc.nextInt();
			System.out.println("Enter  fees :");
			int fees = sc.nextInt();

			rs.updateInt(1, cid);
			rs.updateString(2, cname);
			rs.updateFloat(3, duration);
			rs.updateInt(4, fees);

			rs.insertRow();

			getCourseDetails();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws SQLException {
		CrudCourse c = new CrudCourse();
		// c.getCourseDetails();
		// System.out.println("------------------------------------------------------");
		// c.updateCourseFees(102);
		// System.out.println("------------------------------------------------------");
		// c.deleteCourse(103);
		// System.out.println("------------------------------------------------------");
		c.insertCourse();
	}

}
