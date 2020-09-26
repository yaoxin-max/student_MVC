package com.yx.studentDao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.yx.dao.StudentDao;
import com.yx.entity.Student;
import com.yx.utils.DButils;


public class StudentDaoImpl implements StudentDao {

	//添加用户
	@Override
	public int add(Student student) {
		int i=0;//判断添加数据是否成功
		Student stu = new Student();
		Connection con = DButils.getconn();
		String sql="insert into stu values(null,?,?,?,?,?,?)";
		try {
			/*
			 * int sid, String sName, String sSex, String sAge, String sTel, String sDept, String sAddress
			 */
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, student.getsName());
			ps.setString(2, student.getsSex());
			ps.setString(3, student.getsAge());
			ps.setString(4, student.getsTel());
			ps.setString(5, student.getsDept());
			ps.setString(6, student.getsAddress());
			i =ps.executeUpdate();
			if (i!=0) {
				System.out.println("添加成功");
			}
			
		
		} catch (Exception e) {
			// TODO: handle exception
		}

		return i;
	}

	@Override
	public Student query(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	//查询全部数据
	@Override
	public List<Student> findAll() {
		List<Student> students=new ArrayList();
		Connection con = DButils.getconn();
		String sql="select * from stu";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student student = new Student();
				/*int sid, String sName, String sSex, String sAge, String sTel, String sDept, String sAddress*/
				student.setSid(rs.getInt("sid"));
				student.setsName(rs.getString("sName"));
				student.setsSex(rs.getString("sSex"));	
				student.setsAge(rs.getString("sAge"));	
				student.setsTel(rs.getString("sTel"));	
				student.setsDept(rs.getString("sDept"));	
				student.setsAddress(rs.getString("sAddress"));	
				students.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return students;
	}

	//通过id删除数据库中的数据
	@Override
	public int deleteById(int id) {
		String sql = "DELETE FROM stu WHERE sid = ?";
		Connection con = DButils.getconn();
		int i =0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}

	//根据id更新数据
	@Override
	public int updateById(Student student) {
		String sql= "UPDATE stu SET sName= ?,sSex=?,sAge=?,sTel=?,sDept=?,sAddress=? WHERE sid=?;";
		Connection con = DButils.getconn();
		int i = 0;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, student.getsName());
			ps.setString(2, student.getsSex());
			ps.setString(3, student.getsAge());
			ps.setString(4, student.getsTel());
			ps.setString(5, student.getsDept());
			ps.setString(6, student.getsAddress());
			ps.setInt(7, student.getSid());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return i;
	}

	//根据用户id查询
	@Override
	public ResultSet queryById(int id) {
		String sql = "select * from stu where sid = ?;";
		Connection con = DButils.getconn();
		ResultSet rs=null;
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return rs;
	}	
}
