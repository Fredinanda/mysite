<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link href="/mysite/assets/css/boardselect.css" rel="stylesheet" type="text/css">
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
			<br>
		
			<div class="title">
			제목
			<input type="text" size="69">
			</div>
			
			<div class="text">
			내용
			<TEXTAREA NAME=txtComment COLS=71 ROWS=10></TEXTAREA>
			</div>
			<div>
			<br>
			<div align="right">
				<a href="">
				<img class="imgs" src="/mysite/views/board/images/write.png" alt="글수정">
				</a>  
				
				<a href ="/mysite/views/board/list.jsp">
				<img class="imgs" src="/mysite/views/board/images/cancel.png" alt="취소">
				</a>
			
			</div>
			<Br>
			</div>
		
		</div>
			
				
	
	
		
	
	<div id="footer">
			<c:import url="/views/include/footer.jsp"></c:import>
	</div>	
	
	</div>	

</body>
</html>