package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("Application Started ");
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			System.out.println("DB connected Successfully..");

			String query = "insert into course values (?,?,?,?) ;";

			PreparedStatement ps = con.prepareStatement(query);

			System.out.println("Enter a Course_ID:");
			int id = sc.nextInt();
			System.out.println("Enter Course_Name: ");
			String courseName = sc.next();

			System.out.println("Enter Course_Fees:");
			int fee = sc.nextInt();
			System.out.println("Please Enter Location:");
			String loc = sc.next();

			ps.setInt(1, id);
			ps.setString(2, courseName);
			ps.setInt(3, fee);
			ps.setString(4, loc);

			int rows = ps.executeUpdate();
			System.out.println(rows + "Rows Inserted");

			con.close();
			ps.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {

			System.out.println("All Connections Closed  Successfully..");
		}

		System.out.println("Program Ended..");
	}

}
