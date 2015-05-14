package com.sds.icto.mysite.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class boardDao {
	
	
	
	
	private Connection getConnection()
			throws ClassNotFoundException, SQLException {
			Connection conn = null;
			//1. 드라이버 로딩
			Class.forName( "oracle.jdbc.driver.OracleDriver" );
			//2. connection 생성
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbURL, "webdb", "webdb");
			return conn;
		}
}
