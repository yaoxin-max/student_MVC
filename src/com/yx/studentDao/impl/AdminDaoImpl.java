package com.yx.studentDao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yx.dao.AdminDao;
import com.yx.entity.Admin;
import com.yx.utils.DButils;
;


public class AdminDaoImpl implements AdminDao{

	@Override
	public Admin login(Admin admin) {
		
		Admin admin2 = new Admin();
		Connection con = DButils.getconn();
		String sql="select * from admin where userName=? and password=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, admin.getUserName());
			ps.setString(2, admin.getPassword());
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				admin2.setId(rs.getInt("id"));
				admin2.setUserName(rs.getString("userName"));
				admin2.setPassword(rs.getString("password"));	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return admin2;
	}

	@Override
	public int updateById(Admin admin) {
		String sql = "update admin set password = ? where id =?;";
		Connection conn = DButils.getconn();
		int  i =0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,admin.getPassword());
			ps.setInt(2, admin.getId());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
