<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글삭제하기</h1>
	<form action="deleteBoardAction.do?b_id=${b_id}" method="post">
		
		<table border="1" cellpadding="0" cellspacing="0">
			<tr height="30">
				<td width="80">비밀번호</td>
				<td width="170">
					<input type="password" name="b_pwd" size="10">
				</td>
			</tr>
			<tr height="30">
				<td colspan="4" align="center">
					<input type="submit" value="삭제하기">&nbsp;&nbsp;
					<input type="reset" value="취소" onclick="javascript:location.href='listAction.do'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>