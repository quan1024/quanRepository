package com.quan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.quan.entity.StudentInfo;

public class updateDao {
	public  static int updateDao1(StudentInfo stu1,StudentInfo stu2) {//-1ϵͳ�쳣��0�˺���������,1��¼�ɹ�

	try {
		String sql="update student set stuno=?,stuage=?,score=? where stuno=?";
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("���ݿ��������سɹ�");
		Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
		System.out.println("���ӳɹ�����ȡ�����Ӷ���"+c);
		PreparedStatement ps=c.prepareStatement(sql);
		ps.setInt(1, stu2.getStuno());
		ps.setInt(2, stu2.getStuage());
		ps.setInt(3, stu2.getScore());
		ps.setInt(4, stu1.getStuno());
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
