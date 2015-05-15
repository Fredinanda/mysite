<%@ page contentType="text/html;charset=UTF-8" %>
   
<%@ page import="com.sds.icto.mysite.board.dao.*" %>
<%@ page import="com.sds.icto.mysite.board.vo.*" %>
<%@ page import="java.util.List" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <%
	boardDao dao = new boardDao();
	List<boardVo> list = dao.fetchList(); 
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link href="/mysite/assets/css/boardlist.css" rel="stylesheet" type="text/css">
</head>
<body>
		<div id="container">
			<div id="header">
				<jsp:include page = "/views/include/header.jsp" flush="false"/>
			</div>
				<div id="navigation">
			
					<c:import url="/views/include/navigation.jsp" >
					<c:param name="type" value="guest"></c:param>
					</c:import>
				
				</div>
		
		
		
		<div id="content">
			<div align="center">
				<img src="/mysite/views/board/images/smd.png" 	width="540px">
			</div>
			
				<table class="tbl-ex" border="1">
							
				<tr>
					<th>no</th>
					<th class="title">title</th>
					<th>name</th>
					<th>date</th>
					<th>hit</th>
				</tr>
				<c:forEach items="${List}" var="vo">
				<tr>
					<td>${vo.no }</td>
					<td class="title"><a href="/mysite/bd?a=read&no=${vo.no }">${vo.title }</a></td>
					<td>${vo.memberName }</td>
					<td>${vo.date }</td>
					<td>${vo.viewCnt }</td>
				</tr>
				</c:forEach>
				</table>
			
			<div class="page"> 1 </div>
			
			<div class="write">
			<a href="/mysite/views/board/wirte.jsp"><img src="/mysite/views/board/images/write.png"></a>
			<br>
			</div>
			
				
	
		
	</div>
	<div id="footer">
			<c:import url="/views/include/footer.jsp"></c:import>
		</div>	
		
	</div>
</body>
</html>