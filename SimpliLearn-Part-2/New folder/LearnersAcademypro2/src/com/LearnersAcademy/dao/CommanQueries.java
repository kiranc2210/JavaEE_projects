package com.LearnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.LearnersAcademy.Db.DBclass;
import com.LearnersAcademy.model.LoginBean;

public class CommanQueries{

	static DBclass dBclass = DBclass.getInstance();
	private static Connection connection = dBclass.getConnection();
	private static PreparedStatement preparedStatement;
	
	/**
	 * Query SQL Login Table for matched user_id, password and usertype;
	 * if matched record found, then return loginbean Object of that record, use it as session key
	 * @param user_id
	 * @param user_password
	 * @param userType
	 * @return auto_id
	 */
	public static LoginBean loginQuery(String user_id, String user_password,String userType) {
		LoginBean loginBean = new LoginBean();
		String query = "SELECT * FROM login WHERE user_id = ? AND password = ? AND usertype = ? ";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			preparedStatement.setString(2, user_password);
			preparedStatement.setString(3, userType);
			ResultSet rSet = DaoFactory.getAdmindao().get(preparedStatement);
				if(rSet != null && rSet.next()){
					while(rSet.first()){
					   loginBean.setAuto_id(rSet.getInt("auto_id"));
					   loginBean.setUser_id(rSet.getString("user_id"));
					   loginBean.setEmail(rSet.getString("email"));
					   loginBean.setUsertype(rSet.getString("usertype"));
					   
					   
					   return loginBean;
					   //System.out.println("check"+auto_id);
					}
				}else{
					return null;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public  LoginBean selectQuery(String user_id) {
		LoginBean loginBean = new LoginBean();
		String query = "SELECT * FROM login WHERE user_id = ?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			ResultSet rSet = DaoFactory.getAdmindao().get(preparedStatement);
				if(rSet != null && rSet.next()){
					while(rSet.first()){
					   loginBean.setAuto_id(rSet.getInt("auto_id"));
					   loginBean.setUser_id(rSet.getString("user_id"));
					   loginBean.setEmail(rSet.getString("email"));
					   loginBean.setUsertype(rSet.getString("usertype"));
					   loginBean.setFirstname(rSet.getString("firstname"));
					   loginBean.setLastname(rSet.getString("lastname"));
					   
					   return loginBean;
					   //System.out.println("check"+auto_id);
					}
				}else{
					return null;
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static int get_Last_User_AutoId(){
		int lastID = 0 ; 
		ResultSet rSet = null;
		try{
		String Query = "SELECT auto_id FROM login ORDER BY auto_id DESC LIMIT 1";
		
		preparedStatement  = connection.prepareStatement(Query);
		
		rSet = DaoFactory.getAdmindao().get(preparedStatement); 
		
		if(rSet.next()){
		lastID = rSet.getInt("auto_id");
		return lastID;
		}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return lastID; 
	}


	public int insertQuery(LoginBean lb) {
		int numofrow =0;

		try {
			String query = "INSERT INTO login(user_id, email, firstname, lastname, password, usertype) "
					+ "VALUES (?,?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, lb.getUser_id());
			preparedStatement.setString(2, lb.getEmail());
			preparedStatement.setString(3, lb.getFirstname());
			preparedStatement.setString(4, lb.getLastname());
			preparedStatement.setString(5, lb.getPassword());
			preparedStatement.setString(6, lb.getUsertype());
			numofrow = DaoFactory.getCommanDao().add(preparedStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numofrow;
	}

}

