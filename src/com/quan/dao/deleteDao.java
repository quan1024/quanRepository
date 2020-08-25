package com.quan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.quan.entity.StudentInfo;

public class deleteDao {
	public  static int deleteDao1(StudentInfo stu2) {//-1系统异常，0账号密码有误,1登录成功
	try {
		String sql="delete from student where stuno=?";
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("数据库驱动加载成功");
		Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
		System.out.println("连接成功，获取到连接对象："+c);
		PreparedStatement ps=c.prepareStatement(sql);
		ps.setInt(1, stu2.getStuno());
		ps.execute();
		return 1;
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
		return -1;
	}catch(SQLException e) {
		e.printStackTrace();
		return -1;
	}catch(Exception e) {
		e.printStackTrace();
		return -1;
	}
	}
}
