package com.sms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.sms.Db.DBclass;
import com.sms.model.Admin;

public class AdminQueries {

	static DBclass dBclass = DBclass.getInstance();
	private static Connection connection = dBclass.getConnection();
	private static PreparedStatement preparedStatement;
	
	public static int loginQuery(String user_id, String user_password,String userType) {
		int auto_id =0;
		String query = "SELECT * FROM login WHERE user_id = ? AND password = ? AND usertype = ? ;";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			preparedStatement.setString(2, user_password);
			preparedStatement.setString(3, userType);
			ResultSet rSet = DaoFactory.getAdmindao().get(preparedStatement);
				if(rSet != null && rSet.next()){
					while(rSet.first()){
					   return auto_id = rSet.getInt("auto_id");
						//System.out.println("check"+auto_id);
					}
				}else{
					return auto_id;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return auto_id;
	}
	
	public static Admin getQuery(String user_id)
	{
		Admin admin = new Admin();
		String query = "SELECT * FROM login WHERE admin_id = ? ";
		try{
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1,user_id);
			ResultSet rSet = DaoFactory.getAdmindao().getAll(preparedStatement);
				if(rSet.next()){
					admin.setAuto_id(rSet.getInt("auto_id"));
					admin.setAdmin_id(rSet.getString("admin_id"));
					admin.setFirstname(rSet.getString("firstname"));
					admin.setLastname(rSet.getString("lastname"));
					admin.setAddress(rSet.getString("address"));
					admin.setEmail(rSet.getString("email"));
					admin.setPhone(rSet.getString("phone"));
					admin.setPassword(rSet.getString("password"));
					admin.setPicPath(rSet.getString("picPath"));
					return admin;
				}else{
					return null;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
