package com.quan.dao;

import java.sql.*;


import com.quan.entity.StudentInfo;

public class selectDao {
	public  static StudentInfo selectDao1(StudentInfo stu) {//-1ϵͳ�쳣��0�˺���������,1��¼�ɹ�

	try {
		String sql="select * from student where stuno=?";
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("���ݿ��������سɹ�");
		Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
		System.out.println("���ӳɹ�����ȡ�����Ӷ���"+c);
		PreparedStatement ps=c.prepareStatement(sql);
		ps.setInt(1, stu.getStuno());
		ResultSet rs=ps.executeQuery();
		StudentInfo stu3=new StudentInfo();
		StudentInfo stu2=new StudentInfo();
		if(rs.next()) {
			stu2.setStuno(rs.getInt(1));
			stu2.setStuage(rs.getInt(2));
			stu2.setScore(rs.getInt(3));
		}
		return stu2;
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
		
	}catch(SQLException e) {
		e.printStackTrace();
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
	return stu;
	}
}
