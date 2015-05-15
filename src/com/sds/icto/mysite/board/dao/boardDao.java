package com.sds.icto.mysite.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sds.icto.mysite.board.vo.boardVo;



public class boardDao {
	
	public void insert( boardVo vo ) 
			throws ClassNotFoundException, SQLException {
			
			Connection conn = getConnection();
			
			String sql = "INSERT INTO BOARD VALUES (board_no_seq.nextval, ?, ?, ?, ?, 1, SYSDATE)";
					
			PreparedStatement pstmt = conn.prepareStatement( sql );
			
			pstmt.setString( 1, vo.getTitle() );
			pstmt.setString( 2, vo.getContent() );
			pstmt.setLong( 3, vo.getMemberNo() );
			pstmt.setString( 4, vo.getMemberName());
			//pstmt.setLong( 5, vo.getViewCnt() );
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		}
		
		public List<boardVo> fetchList()
			throws ClassNotFoundException, SQLException { 
			List<boardVo> list = new ArrayList<boardVo>();
			
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery( sql );
			
			while( rs.next() ) {
				Long no = rs.getLong( 1 );
				String title = rs.getString(2);
				String content = rs.getString(3);
				Long meberno = rs.getLong(4);
				String memberName = rs.getString(5);
				Long viewCnt = rs.getLong(6);
				String date = rs.getString(7);
				
				boardVo vo = new boardVo();
				vo.setNo(no);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setMemberNo(meberno);
				vo.setMemberName(memberName);
				vo.setViewCnt(viewCnt);
				vo.setDate(date);
				
			
				
				list.add( vo );
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			return list;
		}
		
		public boardVo read(long no) 
				throws ClassNotFoundException, SQLException{
			
			boardVo vo = null;
			Connection conn = getConnection();
			
			String sql = "select * from board where no=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, no);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Long no2 = rs.getLong(1);
				String title2 = rs.getString(2);
				String content2 = rs.getString(3);
				Long memberNo2 = rs.getLong(4);
				String memberName2 = rs.getString(5);
				String date2 = rs.getString(6);
								
				vo = new boardVo();
				vo.setNo(no2);
				vo.setTitle(title2);
				vo.setContent(content2);
				vo.setMemberNo(memberNo2);
				vo.setMemberName(memberName2);
				vo.setDate(date2);
			}
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
			return vo;
		}
	
		public void update(boardVo update) throws ClassNotFoundException, SQLException {
			Connection conn = getConnection();
			String sql = "update board set title=?, content=? where no=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, update.getTitle());
			pstmt.setString(2, update.getContent());
			pstmt.setLong(3, update.getNo());
			pstmt.executeUpdate();
			
			if (pstmt != null) {
				pstmt.close();
			}

			if (conn != null) {
				conn.close();
			}
		}
		
	
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
