package com.quan.dao;

import java.sql.*;

import com.quan.entity.Login;


//ģ�Ͳ㣬���ڴ����¼
public class LoginDao {
		public  static int login(Login login) {
			int flag=-1;//-1ϵͳ�쳣��0�˺���������,1��¼�ɹ�
			int result=-1;
		try {
			String sql="select count(*) from login where uname =? and upwd=?";
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���ݿ��������سɹ�");
			Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
			System.out.println("���ӳɹ�����ȡ�����Ӷ���"+c);
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
