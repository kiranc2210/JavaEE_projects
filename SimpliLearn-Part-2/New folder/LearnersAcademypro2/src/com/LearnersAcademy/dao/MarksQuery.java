package com.LearnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.LearnersAcademy.Db.DBclass;
import com.LearnersAcademy.model.Marks;

public class MarksQuery {
	
	static DBclass dBclass = DBclass.getInstance();
	private static Connection connection = dBclass.getConnection();
	private static PreparedStatement preparedStatement;
	private static ResultSet rSet = null;
	
/*
  INSERT INTO `marks`(`student_id`, `sinhala`, `english`, `tamil`, `mathematics`, `science`,
  `computer_science`, `commerce`, `music`, `dancing`, `drawing`, `health`, `geography`, `history`, 
  `religion`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
 * */

	public int insertQuery(Marks marks)
	{
		int numofrow = 0 ;
		String query = "  INSERT INTO  marks "
				+ "( student_id ,  sinhala ,  english ,  tamil ,  mathematics ,  science ,"
				+ "  computer_science ,  commerce ,  music ,  dancing ,  drawing ,  health ,"
				+ "  geography ,  history ,   religion )"
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )  ";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, marks.getStudent_id());
			preparedStatement.setString(2, marks.getSinhala());
			preparedStatement.setString(3, marks.getEnglish());
			preparedStatement.setString(4, marks.getTamil());
			preparedStatement.setString(5, marks.getMathematics());
			preparedStatement.setString(6, marks.getScience());
			preparedStatement.setString(7, marks.getComputer_science());
			preparedStatement.setString(8, marks.getCommerce());
			preparedStatement.setString(9, marks.getMusic());
			preparedStatement.setString(10, marks.getDancing());
			preparedStatement.setString(11, marks.getDrawing());
			preparedStatement.setString(12, marks.getHealth());
			preparedStatement.setString(13, marks.getGeography());
			preparedStatement.setString(14, marks.getHistory());
			preparedStatement.setString(15, marks.getReligion());
			numofrow = DaoFactory.getCommanDao().add(preparedStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numofrow;
	}	

	/*
	  INSERT INTO `marks`(`student_id`, `sinhala`, `english`, `tamil`, `mathematics`, `science`,
	  `computer_science`, `commerce`, `music`, `dancing`, `drawing`, `health`, `geography`, `history`, 
	  `religion`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
	 * */
	public Marks selectQuery(Marks marks){
		Marks markbn = new Marks();
		
		String sql = "SELECT * FROM marks WHERE student_id = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, marks.getStudent_id());
			rSet = DaoFactory.getCommanDao().get(preparedStatement);
			if(rSet!=null){
				while(rSet.next()){
					markbn.setSinhala(rSet.getString("sinhala"));
					markbn.setEnglish(rSet.getString("english"));
					markbn.setTamil(rSet.getString("tamil"));
					markbn.setMathematics(rSet.getString("mathematics"));
					markbn.setScience(rSet.getString("science"));
					markbn.setComputer_science(rSet.getString("computer_science"));
					markbn.setCommerce(rSet.getString("commerce"));
					markbn.setMusic(rSet.getString("music"));
					markbn.setDancing(rSet.getString("dancing"));
					markbn.setDrawing(rSet.getString("drawing"));
					markbn.setHealth(rSet.getString("health"));
					markbn.setGeography(rSet.getString("geography"));
					markbn.setHistory(rSet.getString("history"));
					markbn.setReligion(rSet.getString("religion"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return markbn;
	}
}
