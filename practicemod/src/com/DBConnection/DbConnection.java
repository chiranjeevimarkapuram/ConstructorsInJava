package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
//	throws ClassNotFoundException, SQLException No need When We use try catch 
	public static void main(String[] args) {
		System.out.println("Main Method Stated..");
//		SQL DB Connection

		try {
//		step 1: Load Driver or Connect DB
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Class Connected Successfully");

//		step 2: connecting DB by driverManager Location ,Username ,password  

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

			System.out.println("Database Connection Succcessfully ");

//		step 3: create Statement

			Statement s = con.createStatement();

//		step 4: Execute query or connection Statements  

			ResultSet rs = s.executeQuery("select * from course ");
			System.out.println("-----------------------------");
			while (rs.next()) {
				System.out.print(rs.getInt("cid") + " ");
				System.out.print(rs.getString("cname") + " ");
				System.out.print(rs.getInt("fee") + " ");
				System.out.print(rs.getString("loc") + " ");
				System.out.println();
				System.out.println("------------------------------");
			}

			System.out.println("Data retrived Successfully");

//		step 5: closing All connections used above 
			rs.close();
			s.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("main Method Ended..!");
	}

}
