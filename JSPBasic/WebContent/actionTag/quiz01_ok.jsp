<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String name = (String)request.getAttribute("name");
 double avg = (double)request.getAttribute("avg");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h4><%=name %>님 평균 <%=avg %> 헙격</h4>
</body>
</html>