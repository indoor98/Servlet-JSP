<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		Hanhwa SW 5th Camp landing Page
	</div>
	<p/>
	<div align="right">
		<form method = "POST" action = "/login.hanwha">
			<input type="text" name="id">
			<input type="password" name="pwd">
			<input type="submit" value="Login">
			&nbsp;&nbsp;
			<a href="/join.encore">JOIN</a>
		</form>
	</div>
</body>
</html>