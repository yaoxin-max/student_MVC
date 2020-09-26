package com.yx.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.yx.entity.Student;
import com.yx.service.impl.StudentServiceImpl;


public class UpdateById extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Student student = new Student();
		String message="";
		try {
			//直接将前端传过来的值封装到对象中
			BeanUtils.populate(student, request.getParameterMap());
			StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
			int  i = studentServiceImpl.UpdateById(student);
			System.out.println("i="+i);
			if (i!=0) {
				message="修改成功";
				request.getRequestDispatcher("message.jsp").forward(request, response);
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
