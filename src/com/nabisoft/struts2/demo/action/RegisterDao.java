package com.nabisoft.struts2.demo.action;

import java.sql.*;
public class RegisterDao {
	public static int save(RegisterAction r) {
		int status = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/skilrock", "root", "root");
			PreparedStatement ps;
			ps = con.prepareStatement("insert into user_master values(?,?,?,?)");
			ps.setString(1, r.getName());
			ps.setString(2, r.getPassword());
			ps.setString(3, r.getEmail());
			ps.setString(4, r.getGender());
			status = ps.executeUpdate();
			System.out.println("name : "+r.getName());
			System.out.println("password : "+r.getPassword());
			System.out.println("email : "+r.getEmail());
			System.out.println("gender : "+r.getGender());         
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}
}
