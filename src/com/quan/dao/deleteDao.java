package com.quan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.quan.entity.StudentInfo;

public class deleteDao {
	public  static int deleteDao1(StudentInfo stu2) {//-1ϵͳ�쳣��0�˺���������,1��¼�ɹ�
	try {
		String sql="delete from student where stuno=?";
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("���ݿ��������سɹ�");
		Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
		System.out.println("���ӳɹ�����ȡ�����Ӷ���"+c);
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
