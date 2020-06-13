package com.LearnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LearnersAcademy.DB.DBclass;
import com.LearnersAcademy.model.Marks;

public class MarksQueries {

	static DBclass dBclass = DBclass.getInstance();
	private static Connection connection = dBclass.getConnection();
	private static PreparedStatement preparedStatement;
	private static ResultSet  rSet =null;
	
	public int updateQuery(Marks mark){
		int numOfrows = 0;
		String query = "UPDATE marks "
				+ " SET kannada = ?, english = ? , hindi = ?, mathematics = ?, science = ? , computer_science = ?, "
				+ " commerce = ? , music = ? , dancing = ? , drawing = ?  WHERE student_id = ?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(15, mark.getStudent_id());
			preparedStatement.setString(1, mark.getKannada());
			preparedStatement.setString(2, mark.getEnglish());
			preparedStatement.setString(3, mark.getHindi());
			preparedStatement.setString(4, mark.getMathematics());
			preparedStatement.setString(5, mark.getScience());
			preparedStatement.setString(6, mark.getComputer_science());
			preparedStatement.setString(7, mark.getCommerce());
			preparedStatement.setString(8, mark.getMusic());
			preparedStatement.setString(9, mark.getDancing());
			preparedStatement.setString(10, mark.getDrawing());
			numOfrows = DaoFactory.getCommanDao().update(preparedStatement);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numOfrows;	
	}
	
	public int insertQuery(Marks mark){
		int numOfrows = 0;
		String query = "INSERT INTO "
				+ "marks(student_id , kannada, english, hindi, mathematics, science, computer_science, "
				+ "commerce, music, dancing, drawing) "
				+ "VALUES ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, mark.getStudent_id());
			preparedStatement.setString(2, mark.getKannada());
			preparedStatement.setString(3, mark.getEnglish());
			preparedStatement.setString(4, mark.getHindi());
			preparedStatement.setString(5, mark.getMathematics());
			preparedStatement.setString(6, mark.getScience());
			preparedStatement.setString(7, mark.getComputer_science());
			preparedStatement.setString(8, mark.getCommerce());
			preparedStatement.setString(9, mark.getMusic());
			preparedStatement.setString(10, mark.getDancing());
			preparedStatement.setString(11, mark.getDrawing());
		
			
			numOfrows = DaoFactory.getCommanDao().add(preparedStatement);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numOfrows;
	}
	
	public List<Marks> selectQuery(){
		List<Marks> mList = new ArrayList<Marks>();
		String sql = "SELECT * FROM marks";
		
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			rSet = DaoFactory.getCommanDao().getAll(preparedStatement);
			while(rSet.next()){
				Marks mark = new Marks();
				mark.setStudent_id(rSet.getString("student_id"));
				mark.setKannada(rSet.getString("kannadda"));
				mark.setEnglish(rSet.getString("english"));
				mark.setHindi(rSet.getString("hindi"));
				mark.setMathematics(rSet.getString("mathematics"));
				mark.setScience(rSet.getString("science"));
				mark.setComputer_science(rSet.getString("computer_science"));
				mark.setCommerce(rSet.getString("commerce"));
				mark.setMusic(rSet.getString("music"));
				mark.setDancing(rSet.getString("dancing"));
				mark.setDrawing(rSet.getString("drawing"));
			
				mList.add(mark);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mList;
	}
	
	public Marks selectQuery(String student_id){
		Marks mark =  new Marks();
		String sql = "SELECT * FROM marks WHERE student_id = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student_id);
			
			rSet = DaoFactory.getCommanDao().get(preparedStatement);
			while(rSet.next()){
				mark.setStudent_id(rSet.getString("student_id"));
				mark.setKannada(rSet.getString("kannada"));
				mark.setEnglish(rSet.getString("english"));
				mark.setHindi(rSet.getString("Hindi"));
				mark.setMathematics(rSet.getString("mathematics"));
				mark.setScience(rSet.getString("science"));
				mark.setComputer_science(rSet.getString("computer_science"));
				mark.setCommerce(rSet.getString("commerce"));
				mark.setMusic(rSet.getString("music"));
				mark.setDancing(rSet.getString("dancing"));
				mark.setDrawing(rSet.getString("drawing"));
				
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return mark;
	}
	
	
}
