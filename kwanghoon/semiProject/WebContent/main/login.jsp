<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<table border="1" align="center" cellspacing="0">
		<form method="post" action="loginOk.jsp">
			 <tr height="30">
			 	<td width="100" align="center">사용자 ID</td>
			 	<td width="100">
			 		<input type="text" name="user_id">
			 	</td>
			 </tr>
			 <tr height="30">
			 	<td width="30" align="center">비밀번호</td>
			 	<td width="30">
			 		<input type="password" name="user_pwd">
			 	</td>
			 </tr>
			 <tr height="30">
			 	<td colspan="2" align="center">
			 		<input type="submit" value="로그인">
			 		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			 		<input type="button" value="회원가입"
			 		 onclick="javascript:window.location='register.jsp'">
			 	</td>
			 </tr>
		 </form>
	</table>
</body>
</html>