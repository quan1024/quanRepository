package com.quan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quan.dao.addDao;
import com.quan.dao.deleteDao;
import com.quan.entity.StudentInfo;

public class deleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int stuno=Integer.parseInt(request.getParameter("stuno"));
		StudentInfo stu2=new StudentInfo();
		stu2.setStuno(stuno);
		//调用模型层的登录功能
		int result=deleteDao.deleteDao1(stu2);
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
