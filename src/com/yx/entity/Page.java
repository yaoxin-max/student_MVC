package com.yx.entity;

public class Page {
	//每页显示的个数
	public static final int SingleCount=5;
	//总个数
	private int count;
	//总共页数
	private int pageCount;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	
	public Page() {

	}
	public Page(int count, int pageCount) {
		this.count = count;
		this.pageCount = pageCount;
	}
}
