package com.yx.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import com.yx.entity.Admin;
import com.yx.service.AdminService;
import com.yx.service.impl.AdminServiceImpl;

public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Admin admin = new Admin();
		Admin admin2 =null;
		HttpSession session = request.getSession();
		try {
			BeanUtils.populate(admin, request.getParameterMap());
			AdminService adminService = new AdminServiceImpl();
			 admin2 = adminService.login(admin);
			
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (admin2.getUserName()==null) {
			/*response.sendRedirect("main.jsp");*/
			request.setAttribute("error", "请输入正确的用户名和密码");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} else {
			session.setAttribute("name", admin2.getUserName());
			session.setAttribute("id", admin2.getId());
			request.getRequestDispatcher("/main.jsp").forward(request, response);;
		}
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

