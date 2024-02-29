<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.model.dao.MariaDao" %>
<%@ page import="mvc.domain.dto.RequestUserDTO" %>
<%@ page import="mvc.domain.dto.ResponseUserDTO" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- JSP 주석 --%>
	<%-- 선언문 : 변수, 메서드를 정의할 때 사용하는 영역이다. --%>
	<%!
		private MariaDao dao; // 지시자를 통해 MariaDao라는 객체를 import 해주어야 한다.
		private RequestUserDTO params;
		private ResponseUserDTO user;
		private String msg;
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public String getMsg() {
			return this.msg;
		}
	%>
	<%-- 
	scriptlet tag (서블릿의 메서드(doGet | doPost))
	사용자가 JSP를 호출하면 수행되는 영역
	doGet(HttpServletRequest request, HttpServletRespons response) {
	}
	--%>
	<% 
	dao = new MariaDao();
	params = new RequestUserDTO("encore", "encore");
	user = dao.loginRow(params);
	setMsg("저는 JSP 입니다.");
	out.print("<div align='center'>");
	out.print(getMsg());
	out.print("</div>");
		
	%>
	<%-- 표현식 태그(out.print()) --%> 
	<%= user.getName() %> 님 환영합니다.
	
</body>
</html>