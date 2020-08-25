package com.quan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quan.dao.addDao;
import com.quan.dao.selectDao;
import com.quan.entity.StudentInfo;

public class selectServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int stuno=Integer.parseInt(request.getParameter("stuno"));
		StudentInfo stu1=new StudentInfo(stuno,0,0);
		//调用模型层的登录功能
		StudentInfo resultStu=selectDao.selectDao1(stu1);

		if(resultStu.getStuage()!=0) {
			int a= resultStu.getScore(); 
	        request.setAttribute( "stuno",resultStu.getStuno()); 
	        request.setAttribute( "stuage",resultStu.getStuage()); 
	        request.setAttribute( "score",resultStu.getScore()); 
	        request.getRequestDispatcher( "select.jsp").forward(request,response); 
	}else {
		System.out.println("false");
		response.sendRedirect("welcome.jsp");
	}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
