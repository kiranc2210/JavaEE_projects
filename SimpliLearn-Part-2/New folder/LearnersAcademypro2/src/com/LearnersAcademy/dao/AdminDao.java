package com.LearnersAcademy.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao implements Dao {

	ResultSet rSet;
	
	@Override
	public int add(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet getAll(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(PreparedStatement preparedStatement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ResultSet get(PreparedStatement preparedStatement) {
		
		try {
			rSet = preparedStatement.executeQuery();
			return rSet;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
