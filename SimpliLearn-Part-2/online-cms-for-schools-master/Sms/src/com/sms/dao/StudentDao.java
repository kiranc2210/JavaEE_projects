package com.sms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao implements Dao {
	ResultSet rSet = null;
	@Override
	public int add(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet getAll(PreparedStatement preparedStatement) {
		
		return null;
	}

	@Override
	public int update(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(PreparedStatement preparedStatement) {
		int numOfRows = 0;
		try {
			numOfRows = preparedStatement.executeUpdate();
			return numOfRows;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return numOfRows;
	}

	@Override
	public ResultSet get(PreparedStatement preparedStatement) {
		
		try {
			rSet = preparedStatement.executeQuery();
			return rSet;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
