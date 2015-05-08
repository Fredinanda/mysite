package com.sds.icto.mysite.servlet.action.guestbook;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sds.icto.mysite.guestbook.dao.GuestbookDao;
import com.sds.icto.mysite.guestbook.vo.GuestbookVo;
import com.sds.icto.web.Action;

public class deleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ClassNotFoundException, ServletException,
			IOException {
		// TODO Auto-generated method stub
		Long no = Long.parseLong(request.getParameter("no"));
		String pw = request.getParameter("password");
			
		GuestbookVo vo = new GuestbookVo();
		
		vo.setNo(no);
		vo.setPassword(pw);
			
		
		GuestbookDao dao = new GuestbookDao();
		dao.delete(vo);
		
		response.sendRedirect("/mysite/gb");
	}

}
