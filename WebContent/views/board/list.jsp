<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
						<tr>
						
						<td>1</td>
						<td class="title"><a href="select.html">1등이다</a></td>
						<td> 제민재</td>
						<td>2015-05-13</td>
						<td>302</td>
						
					</tr>
				
			</table>
			
			<div class="page"> 1 </div>
			<div class="write">
			<a href="write.html">글쓰기</a>
			</div>
			
				
		<div id="footer">
			<c:import url="/views/include/footer.jsp"></c:import>
		</div>
	</div>
		
		
	</div>
</body>
</html>