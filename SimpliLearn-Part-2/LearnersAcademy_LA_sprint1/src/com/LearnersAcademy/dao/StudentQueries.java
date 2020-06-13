package com.LearnersAcademy.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.LearnersAcademy.DB.DBclass;
import com.LearnersAcademy.model.Student;



public class StudentQueries {

	static DBclass dBclass = DBclass.getInstance();
	private static Connection connection = dBclass.getConnection();
	private static PreparedStatement preparedStatement;
	private ResultSet rSet =null;
	public int insertQuery(Student student){
		int numOfRow = 0 ;	
		String query = "INSERT INTO student("
				+ "fisrtname, lastname, gender, dateOfBirth, dateOfAdmission, address, email, phone, guardian, grade, student_id) "
				+ " VALUES( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )";
		System.out.println(query);
		try{

		preparedStatement = connection.prepareStatement(query);

		preparedStatement.setString(1, student.getFirstname());
		preparedStatement.setString(2, student.getLastname());
		preparedStatement.setString(3, student.getGender());
		preparedStatement.setDate(4, student.getDateOfBirth());
		preparedStatement.setDate(5, student.getDateOfAdmission());
		preparedStatement.setString(6,student.getAddress());
		preparedStatement.setString(7, student.getEmial());
		preparedStatement.setString(8, student.getPhone());
		preparedStatement.setString(9, student.getGuardian());
		preparedStatement.setInt(10, student.getGrade());	
		preparedStatement.setString(11, student.getStudent_id());
		System.out.println(preparedStatement.toString());
		numOfRow = DaoFactory.getCommanDao().add(preparedStatement);
		}catch(Exception e){
			e.printStackTrace();
		}
		return numOfRow;
	}
	
	public  List<Student> selectQuery(){
		List<Student> sList = new ArrayList<Student>();
		String query = null;
			query = "SELECT * FROM student";
		try {
			preparedStatement = connection.prepareStatement(query);
			
			ResultSet rSet = DaoFactory.getStudentDao().get(preparedStatement);
				
					while(rSet.next()){
						Student student = new Student();
	//fisrtname, lastname, gender, dateOfBirth, dateOfAdmission, address, email, phone, guardian, grade, student_id					
						student.setStudent_id(rSet.getString("student_id"));
						student.setFirstname(rSet.getString("fisrtname"));
						student.setLastname(rSet.getString("lastname"));
						student.setGender(rSet.getString("gender"));
						student.setDateOfBirth(rSet.getDate("dateOfBirth"));
						student.setDateOfAdmission(rSet.getDate("dateOfAdmission"));
						student.setAddress(rSet.getString("address"));
						student.setEmial(rSet.getString("email"));
						student.setPhone(rSet.getString("phone"));
						student.setGuardian(rSet.getString("guardian"));
						student.setGrade(rSet.getInt("grade"));
						sList.add(student);
						//System.out.println("check"+auto_id);
					}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return sList;
		
		}	
	
	/**
	 * Get Student By Student ID
	 * @param user_id
	 * @param grade
	 * @return student (object)
	 */
	public  Student getStudentById(String user_id){
	Student student = new Student();
	String query = null;
		query = "SELECT * FROM student WHERE student_id = ?";
	try {
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, user_id);
		
		ResultSet rSet = DaoFactory.getStudentDao().get(preparedStatement);
			
				while(rSet.next()){
//fisrtname, lastname, gender, dateOfBirth, dateOfAdmission, address, email, phone, guardian, grade, student_id					
					student.setStudent_id(rSet.getString("student_id"));
					student.setFirstname(rSet.getString("fisrtname"));
					student.setLastname(rSet.getString("lastname"));
					student.setGender(rSet.getString("gender"));
					student.setDateOfBirth(rSet.getDate("dateOfBirth"));
					student.setDateOfAdmission(rSet.getDate("dateOfAdmission"));
					student.setAddress(rSet.getString("address"));
					student.setEmial(rSet.getString("email"));
					student.setPhone(rSet.getString("phone"));
					student.setGuardian(rSet.getString("guardian"));
					student.setGrade(rSet.getInt("grade"));
					return student;
					//System.out.println("check"+auto_id);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return student;
	
	}
	
	public  int updateQuery(Student student){
		int numOfRows = 0 ;
		String query = "UPDATE student SET fisrtname = ? , lastname = ? , dateOfBirth = ? , "
				+ " address = ? , email = ? , phone = ? , guardian = ? , grade = ?  WHERE student_id = ? ";
		try{
		//fisrtname, lastname, gender, dateOfBirth, dateOfAdmission, address, email, phone, guardian, grade, student_id
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, student.getFirstname());
		preparedStatement.setString(2, student.getLastname());	
		preparedStatement.setDate(3, student.getDateOfBirth());
		preparedStatement.setString(4, student.getAddress());
		preparedStatement.setString(5, student.getEmial());
		preparedStatement.setString(6, student.getPhone());
		preparedStatement.setString(7, student.getGuardian());
		preparedStatement.setInt(8, student.getGrade());
		preparedStatement.setString(9, student.getStudent_id());
		System.out.println(preparedStatement.toString());
		return numOfRows = DaoFactory.getCommanDao().update(preparedStatement);
		}catch(Exception e){
			e.printStackTrace();
		}
		return numOfRows;
	}
	

	public  int deleteQuery(String student_id) {
        int numOfRows=0;
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from student where student_id=?");
            // Parameters start with 1
            preparedStatement.setString(1, student_id);
            return numOfRows = DaoFactory.getStudentDao().delete(preparedStatement);

        } catch (SQLException e) {
            e.printStackTrace();
        }
		return numOfRows;		
	}
	
	public static void main(String arg[]){ 
		System.out.println("Check");
		Student s = new Student();
		//s=StudentQueries.getStudentById("seu/is/01");
		
			System.out.println("I= "+s.toString());
		
	}

	public int countStudent() {
		String query = "SELECT COUNT(student_id) AS count FROM student";
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
