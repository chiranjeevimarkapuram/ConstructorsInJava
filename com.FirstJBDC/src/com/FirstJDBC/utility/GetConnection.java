package com.FirstJDBC.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	Connection con =null;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
