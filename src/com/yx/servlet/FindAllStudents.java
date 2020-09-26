package com.yx.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.yx.entity.Admin;
import com.yx.entity.Page;
import com.yx.entity.Student;
import com.yx.service.AdminService;
import com.yx.service.impl.AdminServiceImpl;
import com.yx.service.impl.StudentServiceImpl;

public class FindAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> students = new ArrayList();
		HttpSession session = request.getSession();
		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
		students = studentServiceImpl.findAll();
		if (students.size()>0) {
			System.out.println(students);
			/*response.sendRedirect("main.jsp");*/
			//数组的长度就是个数
			Page page = new Page();
			page.setCount(students.size());
			//页数就是数组长度/每页的显示个数
			/*
			 * 1.0相乘转为浮点，浮点相除再向上取整为double，再强转为int
			 */
			page.setPageCount((int)Math.ceil(1.0*page.getCount()/1.0*page.SingleCount));
			//创建集合用来封装list<User>和page对象
			session.setAttribute("students",students);
			session.setAttribute("page", page);
			request.getRequestDispatcher("/info.jsp").forward(request, response);
		} else {
			session.setAttribute("message", "系统出错了请耐心等待!");
			request.getRequestDispatcher("/message.jsp").forward(request, response);;
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
