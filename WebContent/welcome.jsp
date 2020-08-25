<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		登录成功，欢迎您！<br/>
		请选择以下操作<br/><br/>
		增加学生数据：<br/>
				<form action="addServlet" method="post">
						学号：<input type="text" name="stuno">
		年龄：<input type="text" name="stuage">
		成绩：<input type="text" name="score">
		<input type="submit" value="增加"><br/>
	</form>
		<br/>删除学生数据：<br/>
				<form action="deleteServlet" method="post">
							学号：<input type="text" name="stuno">
		<input type="submit" value="删除"><br/>
	</form>
		<br/>修改学生数据:<br/>
				<form action="updateServlet" method="post">
				要修改数据的学生学号为：<br/>学号：<input type="text" name="stuno1"><br/>
				将数据修改为：<br/>					
				学号：<input type="text" name="stuno2">
		年龄：<input type="text" name="stuage">
		成绩：<input type="text" name="score">
		<input type="submit" value="修改"><br/>
	</form>
		<br/>查询学生数据:<br/>
				<form action="selectServlet" method="post">
				学生学号为：<br/>学号：<input type="text" name="stuno">
		<input type="submit" value="查询该学号的学生信息"><br/>
	</form>
</body>
</html>