package com.LearnersAcademy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LearnersAcademy.DB.DBclass;
import com.LearnersAcademy.model.Teacher;

public class TeacherQueries {

	static DBclass dBclass = DBclass.getInstance();
	private static Connection connection = dBclass.getConnection();
	private static PreparedStatement preparedStatement;	
	private static ResultSet rSet=null;
	
	public static int loginQuery(String user_id, String user_password) {
		int auto_id =0;
		String query = "SELECT * FROM login WHERE user_id = ? AND password = ?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			preparedStatement.setString(2, user_password);
			ResultSet rSet = DaoFactory.getStudentDao().get(preparedStatement);
				if(rSet.next()){
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

	public static int insertQuery(Teacher teacher) {
		int numOfRow = 0 ;
		try{
		String query = "INSERT INTO teacher"
				+ " (firstname, lastname, gender, dob, doa, address, email, education, phone, user_id) "
				+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, teacher.getFirstname());
		preparedStatement.setString(2, teacher.getLastname());
		preparedStatement.setString(3, teacher.getGender());
		preparedStatement.setDate(4, teacher.getDob());
		preparedStatement.setDate(5, teacher.getDoa());
		preparedStatement.setString(6, teacher.getAddress());
		preparedStatement.setString(7, teacher.getEmail());
		preparedStatement.setString(8, teacher.getFieldOfStudy());
		preparedStatement.setString(9, teacher.getPhone());
		preparedStatement.setString(10, teacher.getTeacher_id());
		numOfRow = DaoFactory.getCommanDao().add(preparedStatement);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return numOfRow;
	}
	
	public  List<Teacher> selectTeachers(){
		
		List<Teacher> tList = new ArrayList<Teacher>();
		String query = "SELECT * FROM teacher";
		
		try {
			preparedStatement =connection.prepareStatement(query);
			rSet = DaoFactory.getCommanDao().get(preparedStatement);
				if(rSet!=null)
					while(rSet.next()){
					Teacher t = new Teacher();
					t.setAuto_id(rSet.getInt("auto_id"));
					t.setFirstname(rSet.getString("firstname"));
					t.setLastname(rSet.getString("lastname"));
					t.setGender(rSet.getString("gender"));
					t.setDob(rSet.getDate("dob"));
					t.setDoa(rSet.getDate("doa"));
					t.setAddress(rSet.getString("address"));
					t.setEmail(rSet.getString("email"));
					t.setFieldOfStudy(rSet.getString("education"));
					t.setPhone(rSet.getString("phone"));
					t.setTeacher_id(rSet.getString("user_id"));
					tList.add(t);
					//System.out.println("check"+auto_id);
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tList;
	}
	
/**
 * GET TEACHER'S DETAIL BY USER_ID	
 * @param teacher.user_id
 * @return Teacher
 */
public static Teacher selectTeachers(Teacher teacher){
		
		Teacher t = new Teacher();
		String query = "SELECT * FROM teacher WHERE user_id = ?";
		
		try {
			preparedStatement =connection.prepareStatement(query);
			preparedStatement.setString(1, teacher.getTeacher_id());
			
			rSet = DaoFactory.getCommanDao().get(preparedStatement);
				if(rSet!=null)
					while(rSet.next()){
					t.setAuto_id(rSet.getInt("auto_id"));
					t.setFirstname(rSet.getString("firstname"));
					t.setLastname(rSet.getString("lastname"));
					t.setGender(rSet.getString("gender"));
					t.setDob(rSet.getDate("dob"));
					t.setDoa(rSet.getDate("doa"));
					t.setAddress(rSet.getString("address"));
					t.setEmail(rSet.getString("email"));
					t.setFieldOfStudy(rSet.getString("education"));
					t.setPhone(rSet.getString("phone"));
					t.setTeacher_id(rSet.getString("user_id"));
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	public static int updateQuery(Teacher teacher){
		String query = "UPDATE teacher SET "
				+ "firstname = ? , lastname = ? , gender = ? , dob = ? , doa = ? , "
				+ "address = ?, email = ? , education = ? , phone = ? WHERE user_id = ? ";
		int numofrow = 0;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, teacher.getFirstname());
			preparedStatement.setString(2, teacher.getLastname());
			preparedStatement.setString(3, teacher.getGender());
			preparedStatement.setDate(4, teacher.getDob());
			preparedStatement.setDate(5, teacher.getDoa());
			preparedStatement.setString(6, teacher.getAddress());
			preparedStatement.setString(7, teacher.getEmail());
			preparedStatement.setString(8, teacher.getFieldOfStudy());
			preparedStatement.setString(9,teacher.getPhone());
			preparedStatement.setString(10, teacher.getTeacher_id());
			
			numofrow = DaoFactory.getCommanDao().update(preparedStatement);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return numofrow;
	}
	
	public static int deleteQuery(String user_id){
		int numOfrow = 0;
		String query = "DELETE FROM teacher WHERE user_id = ?";
		
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user_id);
			numOfrow = DaoFactory.getCommanDao().delete(preparedStatement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numOfrow;
	}
	public  int countTeacher() {
		String query = "SELECT COUNT(user_id) AS count FROM teacher";
		int no = 0;
		try {
			preparedStatement = connection.prepareStatement(query);
			rSet = DaoFactory.getCommanDao().get(preparedStatement);
			if(rSet.next()){
				no = rSet.getInt("count");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return no;
	}

}
