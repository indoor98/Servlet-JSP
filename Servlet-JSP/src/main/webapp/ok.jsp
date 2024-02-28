<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!--  HTML 주석은 브라우저 Parser에 의해 파싱된다.  -->
	<%-- JSP 주석은 브라우저가 파싱 불가 --%>
	<%--
	<%!
		private int number = 10;
		public int getNumber() {
			return number ;
		}
	%>
	--%>
	
	${ user.name } 님 환영합니다...
</body>
</html>