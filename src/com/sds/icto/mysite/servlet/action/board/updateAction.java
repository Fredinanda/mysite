package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.board.dao.boardDao;
import com.sds.icto.mysite.board.vo.boardVo;
import com.sds.icto.web.Action;

public class updateAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		Long no = Long.parseLong(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("txt");
		Long member_no = Long.parseLong(request.getParameter("member_no"));
		String member_name = request.getParameter("member_name");
		
		
		boardVo vo = new boardVo();

		vo.setTitle(title);
		vo.setContent(content);
		vo.setNo(no);
		
		boardDao dao = new boardDao();
		dao.update(vo);

		response.sendRedirect("/mysite/bd");
	}

}
