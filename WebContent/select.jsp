<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
	int no=(int)request.getAttribute( "stuno");
	int age=(int)request.getAttribute( "stuage");
	int score=(int)request.getAttribute( "score");
	out.print("学号:"+no);
	out.print("年龄:"+age);
	out.print("分数:"+score);
%>
</body>
</html>