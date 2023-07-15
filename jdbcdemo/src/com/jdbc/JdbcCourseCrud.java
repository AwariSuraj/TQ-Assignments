package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcCourseCrud {

	static Connection con = null;
	static Scanner sc = new Scanner(System.in);
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	public JdbcCourseCrud() {
		con = DBConnection.getConnection();
		System.out.println("Connection Done........");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	void menu() {
		System.out.println("1. Enter a course");
		System.out.println("2. Delete a course");
		System.out.println("3. Update a course");
		System.out.println("4. View all the courses");
		System.out.println("5. View course by id");
		System.out.println("6. Exit");
	}

	void insertCourse() {
		System.out.println("Enter the course id:");
		int cid = sc.nextInt();

		System.out.println("Enter the course name:");
		String cname = sc.next();

		System.out.println("Enter the duration in months");
		int duration = sc.nextInt();

		System.out.println("Enter the fees:");
		int fees = sc.nextInt();
		// no of students=0

		try {
			pst = con.prepareStatement("insert into course values (?,?,?,?)");
			pst.setInt(1, cid);
			pst.setString(2, cname);
			pst.setInt(3, duration);
			pst.setInt(4, fees);
			// pst.setInt(5, 0);

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

	void fetchAllCourses() {

		try {
			rs = st.executeQuery("select * from course");
			System.out.println("====Courses Available=========");
			while (rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				int duration = rs.getInt(3);
				int fees = rs.getInt(4);
				// int scount= rs.getInt(5);

				System.out.println(cid + "  " + cname + "  " + duration + "  " + fees + "  ");
				System.out.println();

			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	void updateCourseById(int id) {
		try {
			if (getCourseById(id)) {
				System.out.println("Enter the new fees of this course :");
				int fees = sc.nextInt();

				pst = con.prepareStatement("update course set fees=? where cid=?");
				pst.setInt(1, fees);
				pst.setInt(2, id);

				int noOfRowsUpdated = pst.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Course updated with new values:");
					getCourseById(id);
				} else {
					System.out.println("error in data");
				}

			} else {
				System.out.println("Course not found..........");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	boolean getCourseById(int id) {
		boolean status = false;

		try {
			pst = con.prepareStatement("select * from course where cid=?");
			pst.setInt(1, id);

			rs = pst.executeQuery();
			while (rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				int duration = rs.getInt(3);
				int fees = rs.getInt(4);
				// int scount= rs.getInt(5);

				System.out.println(cid + "  " + cname + "  " + duration + "  " + fees + "  ");
				System.out.println();
				status = true;

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return status;

	}

	void deleteCourseById(int id) {
		try {
			pst = con.prepareStatement("delete from course where cid=?");
			pst.setInt(1, id);

			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + id + " is deleted...");
			} else {
				System.out.println("Course not found.....");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		JdbcCourseCrud cd = new JdbcCourseCrud();

		System.out.println("======Course CRUD====================");

		int ch;
		int id;
		do {
			cd.menu();
			System.out.println("enter choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				cd.insertCourse();
				break;
			case 2:
				System.out.println("Enter the course id to be deleted:");
				id = sc.nextInt();
				cd.deleteCourseById(id);
				break;

			case 3:
				System.out.println("Enter the course id to be updated:");
				id = sc.nextInt();
				cd.updateCourseById(id);
				break;
			case 4:
				cd.fetchAllCourses();
				break;
			case 5:
				System.out.println("Enter the course id :");
				id = sc.nextInt();
				if (!cd.getCourseById(id)) {
					System.out.println("Course not found......");
				}
				break;
			case 6:
				System.out.println("Exit......");
				System.exit(0);
				break;

			default:
				System.out.println("Error in input");

			}

			System.out.println("Do you want to perform more operations(1-yes,0-no)");
			ch = sc.nextInt();

		} while (ch == 1);

	}

}
