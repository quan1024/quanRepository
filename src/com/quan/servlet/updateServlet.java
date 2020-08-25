package com.quan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quan.dao.addDao;
import com.quan.dao.deleteDao;
import com.quan.dao.updateDao;
import com.quan.entity.StudentInfo;

public class updateServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int stuno1=Integer.parseInt(request.getParameter("stuno1"));
		int stuno2=Integer.parseInt(request.getParameter("stuno2"));
		int stuage=Integer.parseInt(request.getParameter("stuage"));
		int score=Integer.parseInt(request.getParameter("score"));
		StudentInfo stu1=new StudentInfo();
		stu1.setStuno(stuno1);
		StudentInfo stu2=new StudentInfo(stuno2,stuage,score);
		//����ģ�Ͳ�ĵ�¼����
		int result=updateDao.updateDao1(stu1,stu2);
		if(result>0) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("welcome.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
