package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDOperations {
//Creating a predefined values to insert in the database ..
	public static void main(String[] args) {
		System.out.println("Main Method started..");

		Statement s = null;
		ResultSet rs = null;

		try {
//			Problematic Code 

//			step 1: DB Connection
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connecting DB Via DriverManger 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			System.out.println("DB Connected Succesfully");

//			Create a MYSQL Statement-->insert

			String query = "insert into course values (?,?,?,?) ;";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1, 9);
			ps.setString(2, "hython");
			ps.setInt(3, 8999);
			ps.setString(4, "BZA");

			int rows = ps.executeUpdate();

			System.out.println(rows + "Rows Inserted");

			s = con.createStatement();

			System.out.println("*********DataBase***********");

			rs = s.executeQuery("select * from course;");

			while (rs.next()) {
				System.out.print(rs.getInt("cid") + " ");
				System.out.print(rs.getString("cname") + " ");
				System.out.print(rs.getInt("fee") + " ");
				System.out.print(rs.getString("loc") + " ");
				System.out.println();
				System.out.println("********************************");

			}

			ps.close();

			con.close();

		} catch (Exception e) {
//			Handling the Exceptions 
			System.err.println(e.getMessage());
			e.printStackTrace();

		} finally {
//			Closing the connection in finally block 

		}
		System.out.println("Main Method Ended..");
	}

}
