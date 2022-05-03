package com.callor.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
	
	private final Connection dbConn;
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}
	public List<StudentVO> selectAll() throws SQLException {
		String sql = " SELECT * FROM tbl_student ";
		PreparedStatement pStr = null;
		
		pStr = dbConn.prepareStatement(sql);
		ResultSet rSet = pStr.executeQuery();
		
		List<StudentVO> stList = new ArrayList<>();
		
		while(rSet.next()) {
			// 모든 필드가 매개변수로 제공되는 임의 생성자를 호출하여 VO 만들기 
		}
	}

}
