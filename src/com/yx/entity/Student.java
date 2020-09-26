package com.yx.entity;

import java.util.Date;

public class Student {

	/*
	 * 
    `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '学生编号',
  `sName` varchar(255) DEFAULT NULL COMMENT '学生姓名',
  `sSex` varchar(255) DEFAULT NULL COMMENT '性别',
  `sAge` varchar(255) DEFAULT NULL COMMENT '年龄',
  `sTel` varchar(255) DEFAULT NULL COMMENT '电话',
  `sDept` varchar(255) DEFAULT NULL COMMENT '专业',
  `sAddress` varchar(255) DEFAULT NULL COMMENT '地址',

	 */
	//1--
	private int sid;//编号
	private String sName;//学生姓名
	private String sSex;//性别
	private String sAge;//年龄
	private String sTel;//电话
	private String sDept;//系别
	private String sAddress;//地址
	
	//2--
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public String getsAge() {
		return sAge;
	}
	public void setsAge(String sAge) {
		this.sAge = sAge;
	}
	public String getsTel() {
		return sTel;
	}
	public void setsTel(String sTel) {
		this.sTel = sTel;
	}
	public String getsDept() {
		return sDept;
	}
	public void setsDept(String sDept) {
		this.sDept = sDept;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	
	
	//3--
	public Student() {
		
	}
	public Student(int sid, String sName, String sSex, String sAge, String sTel, String sDept, String sAddress) {
		this.sid = sid;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sTel = sTel;
		this.sDept = sDept;
		this.sAddress = sAddress;
	}

	
	
	
	

	
	
		
}
