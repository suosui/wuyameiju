package com.wuyameiju.beans;

import java.util.List;

/**
 * 分页器对象
 * 
 * @author 骆昊
 *
 * @param <T> 实体类型的泛型参数
 */
public class PageBean <T> {
	private List<T> data;
	private int currentPage;
	private int pageSize;
	private int totalPage;
	
	
	public PageBean() {
	}
	
	/**
	 * 构造器
	 * @param data 数据
	 * @param currentPage 当前页面
	 * @param size 页面大小
	 * @param count 总记录数
	 */
	public PageBean(List<T> data, int currentPage, int size, int count) {
		this.data = data;
		this.currentPage = currentPage;
		this.pageSize = size;
		this.totalPage = count % size == 0? count / size : count / size + 1;
		
	}

	public List<T> getData() {
		return data;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	/**
	 * 有没有下一页
	 */
	public boolean hasNextPage() {
		return currentPage < totalPage;
	}
	
	/**
	 * 有没有上一页
	 */
	public boolean hasPrevPage() {
		return currentPage > 1;
	}

}
