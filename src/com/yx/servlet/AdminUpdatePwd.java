package com.yx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yx.entity.Admin;
import com.yx.service.impl.AdminServiceImpl;


public class AdminUpdatePwd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String password = request.getParameter("password");
		System.out.println("id="+id);
		System.out.println("password="+password);
		Admin admin = new Admin();
		admin.setId(id);
		admin.setPassword(password);
		AdminServiceImpl adminServiceImpl = new AdminServiceImpl();
		int i = adminServiceImpl.UpdateAdminPwd(admin);
		System.out.println("i="+i);
		String message = "";
		if (i!=0) {
			message = "更改密码成功！";
			request.setAttribute("message", message);
			request.getRequestDispatcher("message.jsp").forward(request, response);
		}
		
	}

}
