package com.DAOInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Model.Register;
import com.Model.UserLogin;
import com.Utility.DBConnection;

public class UserDAO implements UserDAOInterface {

	Connection con;
	String Status = "fail";

	public String insertuser(Register r) {
		DBConnection db = new DBConnection();
		con = db.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?) ;");
			ps.setString(1, r.getUsername());
			ps.setString(2, r.getFirstname());
			ps.setString(3, r.getLastname());
			ps.setString(4, r.getPassword());
			int n = ps.executeUpdate();
			if (n > 0) {
				Status = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Status;
	}

	public String selectloginUser(UserLogin l) {
		DBConnection db = new DBConnection();
		con = db.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from register where username  = ?  and password = ?");
			ps.setString(1, l.getUsername());
			ps.setString(2, l.getPassword());
			ResultSet rs = ps.executeQuery();
			int count = 0;
			while (rs.next()) {
				count++;
			}
			if (count > 0) {
				Status = "success";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Status;
	}
}
