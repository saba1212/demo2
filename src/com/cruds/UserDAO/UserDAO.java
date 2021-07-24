package com.cruds.UserDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.cruds.UserEntity.User;

public class UserDAO {

	private String dburl = "jdbc:mysql://localhost:3306/test";
	private String dbUsername = "root";
	private String dbpassword = "sabarehan";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver( String dbDriver)
	{
		try {
			getClass().forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbUsername, dbpassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return con;

	}
	public String insert( User user)
	{
		loadDriver(dbdriver);
		Connection con= getConnection();
		String res= "Data Entered Sucessfully!";
		String sql="insert into test.user values(?,?)";
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, user.getUserame());
			ps.setString(2, user.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res= "Data not Entered!";
		}
		
		return res;
	}
}
