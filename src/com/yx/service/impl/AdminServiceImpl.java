package com.yx.service.impl;

import com.yx.dao.AdminDao;
import com.yx.entity.Admin;
import com.yx.service.AdminService;
import com.yx.studentDao.impl.AdminDaoImpl;
public class AdminServiceImpl implements AdminService{

	//查询登录
	@Override
	public Admin login(Admin admin) {
		AdminDao adminDao = new AdminDaoImpl();
		Admin admin2 = adminDao.login(admin);
		return admin2; 
	}
	//更改管理员密码
	@Override
	public int UpdateAdminPwd(Admin admin) {
		AdminDaoImpl adminDaoImpl  = new AdminDaoImpl();
		int i  = adminDaoImpl.updateById(admin);
		return i;
	}


}
