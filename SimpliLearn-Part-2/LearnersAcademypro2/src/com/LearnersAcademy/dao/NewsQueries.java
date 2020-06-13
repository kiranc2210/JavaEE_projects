package com.LearnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LearnersAcademy.Db.DBclass;
import com.LearnersAcademy.model.Notices;

public class NewsQueries {
	static DBclass dBclass = DBclass.getInstance();
	private static Connection connection = dBclass.getConnection();
	private static PreparedStatement preparedStatement;
	private static ResultSet rSet = null;
	/**
	 * INSERT NOTICES
	 * @param nt
	 * @return
	 */
	public int inertQuery(Notices nt){
		int numOfrow = 0;
		String query = "INSERT INTO notice (note_topic, note_body, dateOfExpire) "
				+ "VALUES (?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, nt.getNote_topic());
			preparedStatement.setString(2,nt.getNote_body());
			preparedStatement.setDate(3, nt.getDateOfExpire());
			numOfrow = DaoFactory.getCommanDao().add(preparedStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numOfrow;
	}

	public  List<Notices> selectQuery(){
		List<Notices> nList = new ArrayList<Notices>();
		String query = "SELECT * FROM notice ORDER BY auto_id DESC";
		try {
			preparedStatement = connection.prepareStatement(query);
			rSet = DaoFactory.getCommanDao().getAll(preparedStatement);
			while(rSet.next()){
				Notices nt = new Notices();
				nt.setNote_id(rSet.getInt("auto_id"));
				nt.setNote_topic(rSet.getString("note_topic"));
				nt.setNote_body(rSet.getString("note_body"));
				nt.setDateOfExpire(rSet.getDate("dateOfExpire"));
				nList.add(nt);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nList;

	}
	
	public static int deleteQuery(Notices nt){
		int numOfrow =0;
		String query = "DELETE FROM notice WHERE dateOfExpire = ? ";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setDate(1, nt.getDateOfExpire());
			numOfrow = DaoFactory.getCommanDao().delete(preparedStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numOfrow;
	}
	
}
