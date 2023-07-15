package com.jdbccollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetCrud {

	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	static Connection con = null;
	static Scanner sc = new Scanner(System.in);

	public ResultSetCrud() throws SQLException {

		con = DBConnect.getConnection();
		st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = st.executeQuery("select * from item");
	}

	public void getItemDetails() throws SQLException {

		// setting the cursor of the resultset before the first entry
		rs.beforeFirst();

		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			float price = rs.getFloat(3);
			int supid = rs.getInt(4);

			System.out.println("\t" + id + "\t\t" + name + "\t\t\t\t" + price + "\t\t\t\t" + supid);
		}

	}

	void updateItemPrice(int itemid) {
		try {
			rs.beforeFirst();

			while (rs.next()) {
				if (rs.getInt(1) == itemid) {
					System.out.println(rs.getString(2) + "  OldPrice:" + rs.getFloat(3));
					System.out.println("Enter the new price:");
					float price = sc.nextFloat();

					rs.updateFloat(3, price);
					rs.updateRow();
				}

			}

			getItemDetails();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	void deleteItem(int itemid) {
		try {
			rs.beforeFirst();

			while (rs.next()) {
				if (rs.getInt(1) == itemid) {
					rs.deleteRow();
				}

			}

			getItemDetails();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void insertItem() {
		try {
			rs.moveToInsertRow();
			System.out.println("Enter item id:");
			int id = sc.nextInt();
			System.out.println("Enter the item name:");
			String iname = sc.next();
			System.out.println("Enter cost:");
			float cost = sc.nextFloat();
			System.out.println("Enter supplier id :");
			int sid = sc.nextInt();

			rs.updateInt(1, id);
			rs.updateString(2, iname);
			rs.updateFloat(3, cost);
			rs.updateInt(4, sid);

			rs.insertRow();

			getItemDetails();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) throws SQLException {

		ResultSetCrud cr = new ResultSetCrud();
		// cr.updateItemPrice(6);
		// cr.getItemDetails();

		System.out.println("-----------------------------------------");
		// cr.deleteItem(8);

		cr.insertItem();

	}

}
