package com.yx.service;
import java.util.List;
import com.yx.entity.Student;

public interface StudentService {
	Student find(String name);
	//添加用户
	int add(Student student);
	//查询所有用户
	List<Student> findAll();
	//根据id删除用户
	int deleteById(int id);
	//根据id查询用户
	Student queryById(int id);
	//根据id修改用户信息
	/*
	 * "UPDATE stu SET sName= ?,sSex=?,sAge=?,sTel=?,sDept=?,sAddress=? WHERE sid=?;";
	 * 涉及多个形参，就好用对象传参
	 */
	int UpdateById(Student student);
}
