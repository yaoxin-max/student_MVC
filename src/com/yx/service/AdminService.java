package com.yx.service;

import com.yx.entity.Admin;

public interface AdminService {

	public Admin login(Admin admin);
	int UpdateAdminPwd(Admin admin);
}
