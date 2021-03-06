<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ page contentType="text/html;charset=UTF-8" %>
<% pageContext.setAttribute("newLineChar", "\n"); %>

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
		
			<c:forEach items="${list }"  var="vo" varStatus="status">
			
			
			
			<br>
			<table width=510 border=1>
				<tr>
					<td>[${status.count}]</td>
					<td> ${vo.name }</td>
					<td> ${vo.regDate}</td>
					<td><a href="/mysite/views/guestbook/deleteform.jsp?no=${vo.no}">삭제</a></td>
				</tr>
				<tr>
					<td colspan=4>
						${fn:replace( vo.message, newLineChar, "<br>" ) }
					</td>
				</tr>
			</table>
		
			</c:forEach>
		
						<br>
					</li>
				</ul>
			</div>
		</div>
		<div id="navigation">
		
			<c:import url="/views/include/navigation.jsp" >
			<c:param name="type" value="guest"></c:param>
			</c:import>
		</div>
		<div id="footer">
			<c:import url="/views/include/footer.jsp"></c:import>
		</div>
	</div>
</body>
</html>