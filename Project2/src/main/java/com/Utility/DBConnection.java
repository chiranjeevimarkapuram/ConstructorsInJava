package com.Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	Connection con = null;

	public Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return con;

	}

}
