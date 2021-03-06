package com.sds.icto.mysite.servlet.action.board;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.board.dao.boardDao;
import com.sds.icto.mysite.board.vo.boardVo;
import com.sds.icto.web.Action;
import com.sds.icto.web.WebUtil;

public class indexAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		
		boardDao dao = new boardDao();
		List<boardVo> list = dao.fetchList();
		request.setAttribute("List", list);
		
		WebUtil.forward( 
				"/views/board/list.jsp" ,
				request,
				response );

	}

}
