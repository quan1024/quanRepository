package com.quan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quan.dao.LoginDao;
import com.quan.dao.addDao;
import com.quan.entity.Login;
import com.quan.entity.StudentInfo;


public class addServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int stuno=Integer.parseInt(request.getParameter("stuno"));
		int stuage=Integer.parseInt(request.getParameter("stuage"));
		int score=Integer.parseInt(request.getParameter("score"));
		StudentInfo stu1=new StudentInfo(stuno,stuage,score);
		//调用模型层的登录功能
		int result=addDao.addDao1(stu1);
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
