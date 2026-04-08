package com.FirstJDBC;

import com.FirstJDBC.dao.JDBCExample;
import com.FirstJDBC.utility.GetConnection;
import com.POJO.Student;

public class MainClass {
	public static void main(String[] args) {
		GetConnection gc = new GetConnection();
		gc.getConnection();
		JDBCExample jdbc = new JDBCExample();
		
		Student s = new Student();
		s.setName("Chiranjeevi");
		s.setMarks(100);
		
		jdbc.insert(s);
		jdbc.select();
	}

}
