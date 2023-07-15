package com.jdbccollection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollable {
	
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	
	static Connection con=null;
	

   public ResultSetScrollable() throws SQLException {

		con= DBConnect.getConnection();
		//st=con.createStatement();
		st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		rs= st.executeQuery("select * from item");
		
	}
   
   void getItemDetails()
   {
	   try
	   {
	   System.out.println("================Forward=============================");
		rs.beforeFirst();
		
		while(rs.next())
		{
		  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3)+"  "+rs.getInt(4));	
		}
		
		System.out.println("====================================================");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
   
   void getItemDetailsReverse()
   {
	   try
	   {
	   System.out.println("================Reverse=============================");
		rs.afterLast();
		
		while(rs.previous())
		{
		  System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3)+"  "+rs.getInt(4));	
		}
		
		System.out.println("====================================================");
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   
   }
   
   




	public static void main(String[] args) throws SQLException {

   ResultSetScrollable obj= new ResultSetScrollable();
   obj.getItemDetails();
   System.out.println("/////////////////////////////////////");
   obj.getItemDetailsReverse();

	}

}
