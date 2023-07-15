package com.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcFacultyCrud {
	static Connection con = null;
	static Scanner sc = new Scanner(System.in);
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	public JdbcFacultyCrud() {
		con = DBConnection.getConnection();
		System.out.println("====Faculty Connection Done====");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);

		}
	}

	void menu() {
		System.out.println("1.Enter a Faculty");
		System.out.println("2.Delete a Faculty");
		System.out.println("3.Update a Faculty");
		System.out.println("4.view all faculty ");
		System.out.println("5.View Faculty by ID");
		System.out.println("6.Exit ");
	}

	void insertFaculty() {
		System.out.println("Enter the faculty id:");
		int fid = sc.nextInt();

		System.out.println("Enter the faculty name:");
		String fname = sc.next();

		System.out.println("Enter the phone number");
		String pno = sc.next();

		System.out.println("Enter the salary:");
		int salary = sc.nextInt();

		System.out.println("enter your email");
		String email = sc.next();

		System.out.println("enter experience");
		int exp = sc.nextInt();

		System.out.println("Enter the joining date (yyyy-mm-dd):");
		String joiningdate = sc.next();

		try {
			pst = con.prepareStatement("insert into faculty values (?,?,?,?,?,?,?)");
			pst.setInt(1, fid);
			pst.setString(2, fname);
			pst.setString(3, pno);
			pst.setInt(4, salary);
			pst.setString(5, email);
			pst.setInt(6, exp);
			// pst.setDate(7, joiningdate);

			int noOfRowsInserted = pst.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("Course added......");
			} else {
				System.out.println("Error in course data........");
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	void deleteFacultyById(int id) {
		try {
			pst = con.prepareStatement("delete from Faculty where fid=?");
			pst.setInt(1, id);

			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("Faulty " + id + " is deleted...");
			} else {
				System.out.println("Faculty not found.....");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	void fetchAllfaculty() {
		try {
			st = con.createStatement();
			rs = st.executeQuery("select * from faculty");
			System.out.println("=====Faculty Available=====");
			while (rs.next()) {
				int fid = rs.getInt(1);
				String fname = rs.getString(2);
				String phoneno = rs.getString(3);
				int salary = rs.getInt(4);
				String email = rs.getString(5);
				int exp = rs.getInt(6);
				Date joiningdate = rs.getDate(7);

				System.out.println(fid + " " + fname + "  " + phoneno + " " + salary + " " + email + " " + exp + " "
						+ joiningdate);
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	void updateFacultyById(int id) {
		try {
			if (getFacultyById(id)) {
				System.out.println("Enter the new salary of this faculty :");
				int salary = sc.nextInt();

				pst = con.prepareStatement("update faculty  set salary =? where fid=?");
				pst.setInt(1, salary);
				pst.setInt(2, id);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("faculty updated with new values:");
					getFacultyById(id);
				} else {
					System.out.println("error in data");
				}

			} else {
				System.out.println("Faculty not found..........");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	boolean getFacultyById(int id) {
		boolean status = false;

		try {
			pst = con.prepareStatement("select * from faculty where fid=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();
			while (rs.next()) {
				int fid = rs.getInt(1);
				String fname = rs.getString(2);
				String phoneno = rs.getString(3);
				int salary = rs.getInt(4);
				String email = rs.getString(5);
				int exp = rs.getInt(6);
				Date joiningdate = rs.getDate(7);

				System.out.println(fid + " " + fname + "  " + phoneno + " " + salary + " " + email + " " + exp + " "
						+ joiningdate);
				System.out.println();
				status = true;

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;

	}

	public static void main(String[] args) {
		JdbcFacultyCrud cd = new JdbcFacultyCrud();
		System.out.println("===Faculty CRUD===");
		int ch;
		int id;
		do {
			cd.menu();
			System.out.println("Enter Choice : ");
			ch = sc.nextInt();
			switch (ch) {

			case 1:
				cd.insertFaculty();
				break;
			case 2:
				System.out.println("Enter the Faculty id to be deleted:");
				id = sc.nextInt();
				cd.deleteFacultyById(id);
				break;
			case 3:
				System.out.println("Enter the faculty id to be updated:");
				id = sc.nextInt();
				cd.updateFacultyById(id);
				break;
			case 4:
				cd.fetchAllfaculty();
				break;
			case 5:
				System.out.println("Enter the Faculty id :");
				id = sc.nextInt();
				if (!cd.getFacultyById(id)) {
					System.out.println("Faculty not found......");
				}
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println(" Error in input ");
			}
			System.out.println("Do you want to perform more operations(1-yes,0-no)");
			ch = sc.nextInt();
		} while (ch == 1);
	}

}
