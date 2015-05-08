<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.sds.icto.mysite.guestbook.dao.*" %>
<%@ page import="com.sds.icto.mysite.guestbook.vo.*" %>

<%@ page import="java.util.List" %>
<%
	GuestbookDao dao = new GuestbookDao();
	List<GuestbookVo> list = dao.fetchList(); 
%>
<!doctype html>
<html>
<head>
<title>mysite</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<link href="/mysite/assets/css/guestbook.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="container">
		<div id="header">
			<jsp:include page="/views/include/header.jsp" flush="false"/>
		</div>
		<div id="content">
			<div id="guestbook">
				<form action="/mysite/gb" method="post">
					<input type="hidden" name="a" value="insert">
					<table>
						<tr>
							<td>이름</td><td><input type="text" name="name"></td>
							<td>비밀번호</td><td><input type="password" name="pass"></td>
						</tr>
						<tr>
							<td colspan=4><textarea name="content" id="content"></textarea></td>
						</tr>
						<tr>
							<td colspan=4 align=right><input type="submit" VALUE=" 확인 "></td>
						</tr>
					</table>
				</form>
				<ul>
					<li>
								<%
			int index = 0;
			for( GuestbookVo vo : list ){
				index++;
			%>
			<br>
			<table width=510 border=1>
				<tr>
					<td>[<%=index %>]</td>
					<td><%=vo.getName() %></td>
					<td><%=vo.getRegDate() %></td>
					<td><a href="/mysite/views/guestbook/deleteform.jsp?no=<%=vo.getNo() %>">삭제</a></td>
				</tr>
				<tr>
					<td colspan=4>
						<%=vo.getMessage() %>
					</td>
				</tr>
			</table>
			<%
			}
			%>
						<br>
					</li>
				</ul>
			</div>
		</div>
		<div id="navigation">
			<jsp:include page="/views/include/navigation.jsp"/>
		</div>
		<div id="footer">
			<p>(c)opyright 2014 </p>
		</div>
	</div>
</body>
</html>