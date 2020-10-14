package com.sumanth.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sumanth.model.DataObject;

public class DataObjectDao {
	
	public DataObject getDataObject(int id)
	{
	DataObject d = new DataObject();
	/*
	d.setId(101);
	d.setName("Sumanth");
	d.setCity("hyderabad"); */
	
	try {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/navin","username","password");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery("select * from table where id=" +id);
		if(rs.next())
		{
			d.setId(rs.getInt("id"));
			d.setName(rs.getString("name"));
			d.setCity(rs.getString("city"));
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return d;
	}

}
