package com.venkadesh.Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.venkadesh.vkfast_food.Ingredients;

public class MysqlData {
	private Connection con;
	
	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class found!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/vkfast_foodcentre";
		String name = "root";
		String pas = "Myintmyatoo884";

		try {
			con = DriverManager.getConnection(url, name, pas);
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Ingredients> getName(int id) {
		if (con == null) {
			if (con == null) {
				init();
			}
		}
		String sql = "select * from food where id="+id+";";
		Statement stm;
		List<Ingredients> itemList = new ArrayList<>();

		try {
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				itemList.add(new Ingredients(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return itemList;

	}

}
