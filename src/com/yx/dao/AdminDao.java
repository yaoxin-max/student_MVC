package com.yx.dao;

import com.yx.entity.Admin;

public interface AdminDao {
	//根据姓名和密码登录，通过对象传参
	public Admin login(Admin admin);
	//根据id更新用户密码
	/*
	 * update admin set password=? where id=?
	 * 两个以上参数尽量使用对象
	 */
	int updateById(Admin  admin);
}
