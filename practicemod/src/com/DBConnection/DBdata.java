package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		select * from tableName operation.

		System.out.println("program started");

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");

		System.out.println("Database connection successfully");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from course ;");
		while (rs.next()) {
			System.out.print(rs.getInt("cid") + " ");
			System.out.print(rs.getString("cname") + " ");
			System.out.print(rs.getInt("fee") + " ");
			System.out.print(rs.getString("loc") + " ");
			System.out.println();
			System.out.println("------------------------------");
		}

		rs.close();
		s.close();
		con.close();

		System.out.println("Program Ended..!");
	}

}
