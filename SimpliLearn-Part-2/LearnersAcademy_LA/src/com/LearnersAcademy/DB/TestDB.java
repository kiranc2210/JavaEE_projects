/**
 * 
 */
package com.LearnersAcademy.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


 
public class TestDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBclass dBclass = DBclass.getInstance();
		Connection connection =null;
		try {
			connection = dBclass.getConnection();
			System.out.println(connection.toString());
			connection.close();
			System.out.println("Connection closed: "+connection.isClosed());
			connection = dBclass.getConnection();
			System.out.println(connection.toString());
			
		ResultSet re=connection.createStatement().executeQuery("SELECT * FROM academy.login WHERE user_id = 'KIRAN_2210' AND password = 'My@22104560' AND usertype = 'admin'");
		while(re.next())	{
			System.out.println(re.getString("usertype"));
		}
		
			
			connection.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
