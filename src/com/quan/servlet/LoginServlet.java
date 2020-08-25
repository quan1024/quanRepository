package com.quan.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quan.dao.LoginDao;
import com.quan.entity.Login;


public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ʼ��¼����
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("uname");
		String pwd=request.getParameter("upwd");
		Login loin=new Login(name,pwd);
		//����ģ�Ͳ�ĵ�¼����
		int result=LoginDao.login(loin);
		if(result>0) {
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
