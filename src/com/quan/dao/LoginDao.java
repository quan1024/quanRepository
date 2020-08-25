package com.quan.dao;

import java.sql.*;

import com.quan.entity.Login;


//模型层，用于处理登录
public class LoginDao {
		public  static int login(Login login) {
			int flag=-1;//-1系统异常，0账号密码有误,1登录成功
			int result=-1;
		try {
			String sql="select count(*) from login where uname =? and upwd=?";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("数据库驱动加载成功");
			Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
			System.out.println("连接成功，获取到连接对象："+c);
			Statement s=c.createStatement();
			PreparedStatement ps=c.prepareStatement(sql);
			ps.setString(1, login.getUname());
			ps.setString(2, login.getUpwd());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				result=rs.getInt(1);
			}
			if(result>0) {
				return 1;
			}else {
				return 0;
			}
			
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
