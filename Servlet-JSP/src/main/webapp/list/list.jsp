<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8" %>
    
<%@ page 	import="mvc.domain.dto.ResponseUserDTO" %>  
<%@ page 	import="java.util.List" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="../common/header.jsp" %>

<table>

<%! private ResponseUserDTO dto;
	private List<ResponseUserDTO> lst;
%>
	
<% lst = (List<ResponseUserDTO>)request.getAttribute("list"); %>

<tr>
<th>아이디</th><th>패스워드</th><th>이름</th>
</tr>
<% 
	for (int idx=0; idx <= lst.size(); idx++) {
	%>
		<tr>
			<td><% out.print(lst.get(idx).getId()); %></td>
			<td><% out.print(lst.get(idx).getPwd()); %></td>
			<td><% out.print(lst.get(idx).getName()); %></td>
		</tr>
	
<% } %>
</table>


	<%@ include file="../common/footer.jsp" %>	
</body>
</html>