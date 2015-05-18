package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.board.dao.boardDao;
import com.sds.icto.mysite.board.vo.boardVo;
import com.sds.icto.web.Action;

public class deleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		boardVo vo = new boardVo();
		boardDao dao = new boardDao();

		Long no = Long.parseLong(request.getParameter("no"));
		
		vo.setNo(no);
			
		
		dao.delete(no);
	
		response.sendRedirect("/mysite/bd");
	}

}
