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
			
			<table>
				<tr>
					<td class="shotlint">${select.no}</td>
					<td class="longline">title</td>
					<td class="midline">날자 ${select.date}</td>
				</tr>
				
				<tr>
					<td class="shotlint">작성자 ${select.memberName}</td>
					<td class="longline">${select.title}</td>
					<td class="midline">조회수 ${select.viewCnt}</td>
				</tr>
				</table>
				<div class="areabox">
					${select.content }
				</div>
				
				<div class="bottombox">
				<br>
					 <a class ="imgs" href="/mysite/views/board/wirte.jsp"><img src="/mysite/views/board/images/write.png" alt="글쓰기"></a>
					 <a class ="imgs" href="/mysite/bd?a=modify&no=${select.no }"><img src="/mysite/views/board/images/modify.png" alt="글수정"></a> 
					 <a class ="imgs" href=""><img src="/mysite/views/board/images/delete.png" alt="삭제"></a> 
					 <a class ="imgs" href="/mysite/bd"><img src="/mysite/views/board/images/list.png" alt="리스트"></a>
				</div>
				
				<!-- <div class="list">
					이전글 다음글
				</div> -->
		
		</div>
			
				
	
	
		
	
	<div id="footer">
			<c:import url="/views/include/footer.jsp"></c:import>
	</div>	
	
	</div>	

</body>
</html>