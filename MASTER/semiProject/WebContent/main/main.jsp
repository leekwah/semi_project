<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// session 값을 체크한다. (URL로 찍으면, null로 되게 한다.)
	if(session.getAttribute("user") == null) { 
		// loginOk.jsp에서 setAttribute() 메서드를 통해 임의로 줬던 user 값이 null이면 첫 화면(login)으로 간다.
%>
	<jsp:forward page="login.jsp"/>
<% 
	}
	// null이 아닌경우, getAttribute() 메서드를 통해서, session의 값을 얻어온다.
	String user_id = (String)session.getAttribute("user_id");
	String name = (String)session.getAttribute("user_name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
<table border="1" align="center"  cellspacing="0">
		<!-- 로그아웃 버튼 눌렸을 때, 이동 -->
		<form method="post" action="logOut.jsp">
			<tr>
				<td>
					안녕하세요. <%= name %>(<%= user_id %>)님
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="로그아웃">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value="회원정보 변경" onclick="javascript:window.location='userUpdate.jsp'">
				</td>
			</tr>
		</form>
	</table>
</table>
</body>
</html>