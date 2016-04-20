<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>글목록보기</h3>
	<a href="wInsertForm.do">글쓰기</a>
	
	<table border="1" cellpadding="0" cellspacing="0">
	
		<tr height="30">
			<th width="50">번호</th>
			<th width="250">제목</th>
			<th width="150">작성자</th>
			<th width="150">작성일</th>
			<th width="100">조회수</th>
		</tr>
		
		<c:forEach var = "board" items="${list }">
			<tr height="30">
				<td align = "center">${board.b_id }</td>
				<td align = "left">
						<a href="detailAction.do?b_id=${board.b_id }">${board.b_title }</a>
				</td>
				<td align = "center">${board.b_name }</td>
				<td align = "center">
					<fmt:formatDate value="${board.b_date }" pattern="yyyy-MM-dd"/>
				</td>
				<td align = "center">${board.b_hit }</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>