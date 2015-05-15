package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.board.dao.boardDao;
import com.sds.icto.mysite.board.vo.boardVo;
import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class modifyAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		boardDao dao = new boardDao();
		boardVo vo = new boardVo();
		
		long no = Long.parseLong(request.getParameter("no"));
		vo.setNo(no);
		boardVo view = dao.read(no);
	
		
		
		request.setAttribute("update", view);
		WebUtil.forward( "/views/board/modify.jsp", request, response);
	}

}
