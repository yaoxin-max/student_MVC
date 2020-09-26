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
public class UserAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//此对象封装前端得到的数据
		Student student = new Student();
		
		//接收dao层的返回值
		int i=0;
		String message="";
		try {
			//将得到的值封装到student对象中
			BeanUtils.populate(student, request.getParameterMap());
			/*创建服务实现层的对象*/
			StudentServiceImpl stuService = new StudentServiceImpl();
			//调用服务层，间接调用dao的实现层
			i= stuService.add(student);
			
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		if (i==0) {
			message="添加失败！！！";	
		} else {
			message="添加成功！！！";	
		}
		request.setAttribute("message", message);
		request.getRequestDispatcher("/message.jsp").forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
