package com.FirstJDBC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.FirstJDBC.utility.GetConnection;
import com.POJO.Student;

public class JDBCExample implements JDBCInterface {

	GetConnection db;
	Connection con = null;

	public void insert(Student s) {
		try {
			db = new GetConnection();
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement(" insert into student(name,marks) values(?,?); ");
			ps.setString(1, s.getName());
			ps.setInt(2, s.getMarks());
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + "  Statement excuted ");
			} else {
				System.out.println("something went wrong ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void select() {
		try {
			db = new GetConnection();
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("stid") + " : " + rs.getString("name") + " : " + rs.getInt("marks"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
