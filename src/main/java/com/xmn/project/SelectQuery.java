package com.xmn.project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) throws SQLException {
		Connection c = DatabaseHelper.getConnection();
		Statement stmt = (Statement) c.createStatement();

		/*
		 * String insertSql = "insert into user( Fname, Lname, address, salary) values"
		 * + " ('abinash', 'bastola', '1700 tyvale', 1500)";
		 * 
		 * stmt.executeUpdate(insertSql);
		 */

		String selectSql = "select * from user where Fname = 'ashma' ";
		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) {
			// one row

			int Userid = rs.getInt("UserId");
			String Fname = rs.getString("Fname");
			String Lname = rs.getString("Lname");

			String address = rs.getString("address");
			int salary = rs.getInt("salary");
			System.out.println(" User Details : UserId = " + Userid + " , name = " + Fname + " , Lname = " + Lname
					+ " , address = " + address + " , salary = " + salary);
			// System.out.println("address : " + address);
		}

		String updateSql = " update user set address = '9335 lee highway' where userid = " + 1;
		stmt.executeUpdate(updateSql);

	}

}
