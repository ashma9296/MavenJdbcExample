package com.xmn.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(Exception e) {
			System.out.println("Cant find the driver");
		}
		
		try {
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Macys_db?serverTimezone=UTC", "root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
