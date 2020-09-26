package com.yx.service.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.yx.entity.Student;
import com.yx.service.StudentService;
import com.yx.studentDao.impl.StudentDaoImpl;

public class StudentServiceImpl implements StudentService{

	@Override
	public Student find(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Student student) {
		StudentDaoImpl stuDao = new StudentDaoImpl();
		int i = stuDao.add(student);
		return i; 
	}

	@Override
	public List<Student> findAll() {
		StudentDaoImpl stuDao = new StudentDaoImpl();
		List<Student> students = stuDao.findAll();
		return students;
	}

	//通过id删除数据库中的数据
	@Override
	public int deleteById(int id) {
		//创建dao的实现类，去对数据库执行操作
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		int i  = studentDaoImpl.deleteById(id);
		return i;
	}

	//根据id查询用户
	//因为根据id查询，结果为一行数据，是一个对象，所以用User类去接收
	//如果查询结果为多行数据，结果就是多个对象，返回结果用list<User>去接收
	@Override
	public Student queryById(int id) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		ResultSet rs = studentDaoImpl.queryById(id);
		Student student = new Student();//封装数据库的查询结果
		try {
			while(rs.next()){
				//将数据库中查到的数据并封装到user对象中去
				student.setSid(Integer.parseInt(rs.getString("sid")));//注意值类型
				student.setsName(rs.getString("sName"));
				student.setsSex(rs.getString("sSex"));
				student.setsAge(rs.getString("sAge"));
				student.setsTel(rs.getString("sTel"));
				student.setsDept(rs.getString("sDept"));
				student.setsAddress(rs.getString("sAddress"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public int UpdateById(Student student) {
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		int  i = studentDaoImpl.updateById(student);
		return i;
	}



}
