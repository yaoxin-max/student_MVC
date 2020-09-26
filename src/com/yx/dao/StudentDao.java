package com.yx.dao;
import java.sql.ResultSet;
import java.util.List;

import com.yx.entity.Student;

public interface StudentDao {

	//按名字查询
	Student query(String name);
	//添加用户
	int add(Student student);
	//查询全部数据
	List<Student> findAll();	
	//删除
	int deleteById(int id);
	//根据id查找用户(更新用户数据数据前，现将该用户的信息查询显式给用户)
	ResultSet queryById(int id);
	//更新数据
	int updateById(Student sutdent);
}
