package com.yx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.service.impl.StudentServiceImpl;


public class DeleteById extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		int i = studentServiceImpl.deleteById(id);
		String message="";
		if (i==0) {
			message="删除失败！！！";	
		} else {
			message="删除成功！！！";	
		}
		request.setAttribute("message", message);
		request.getRequestDispatcher("/message.jsp").forward(request,response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
