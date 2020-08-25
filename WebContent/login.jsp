<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
欢迎您使用本学生信息管理系统！
请先登录：
	<form action="LoginServlet" method="post">
		用户名:<input type="text" name="uname"><br/>
		密码:<input type="password" name="upwd"><br/>
		<input type="submit" value="登录"><br/>
	</form>
</body>
</html>