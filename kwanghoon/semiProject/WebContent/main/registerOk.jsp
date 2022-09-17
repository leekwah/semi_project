<%@page import="java.sql.Timestamp"%>
<%@page import="login.UserDBBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="login.UserBean" id="ur" />
<jsp:setProperty property="*" name="ur"/>
<%
	// 방법1) 매개변수에 현재 날짜를 넣는다.
	// mb.setMem_regdate(new Timestamp(System.currentTimeMillis()));
	
	// 방법2) MemberDBBean.java에 SYDADTE를 추가 (지금 설정해둠) 
	UserDBBean manager = UserDBBean.getInstance();

	if(manager.confirmUserId(ur.getUser_id()) == 1){
%>
	<script>
		alert("중복되는 아이디가 존재합니다.");
		history.back(); // 다시 돌아가기
	</script>
<%
	} else {
		int re = manager.insertUser(ur);
		
		if(re == 1){
%>
	<script>
		alert("회원가입을 축하드립니다.\n회원으로 로그인 해주세요.");
		document.location.href="login.jsp"; // documents 객체를 통해 login.jsp로 이동
	</script>
<%
		}else{
%>
	<script>
		alert("회원가입에 실패했습니다.");
	</script>
<%
		}
	}
%>