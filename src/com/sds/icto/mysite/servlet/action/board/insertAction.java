package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.board.dao.boardDao;
import com.sds.icto.mysite.board.vo.boardVo;
import com.sds.icto.web.Action;

public class insertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException,NumberFormatException {
		// TODO Auto-generated method stub
		// 한글처리
		request.setCharacterEncoding( "utf-8" );

		// 메세지 등록 
		//사용자 아이디랑 넘버는 세션에서 받아옵시다
		//이름 내용
		String title = request.getParameter( "title" );
		String txt = request.getParameter( "txt" );
		String memberName = request.getParameter("member_name");
		String memberNo = request.getParameter("member_no");

		boardVo vo = new boardVo();
		vo.setContent(txt);
		vo.setTitle(title);
		vo.setMemberName(memberName);
		vo.setMemberNo(Long.valueOf(memberNo));
		boardDao dao = new boardDao();
		
		dao.insert(vo);

		//리다이렉트
		response.sendRedirect( "/mysite/bd" );

	}

}
