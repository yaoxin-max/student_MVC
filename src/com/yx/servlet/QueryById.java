package com.yx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.entity.Student;
import com.yx.service.impl.StudentServiceImpl;

public class QueryById extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		Student student = studentServiceImpl.queryById(id);
		//设置值到request域中
		request.setAttribute("student", student);
		request.getRequestDispatcher("/update.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
