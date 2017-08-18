package com.wuyameiju.dao;


import java.util.List;

import com.wuyameiju.beans.PageBean;
import com.wuyameiju.beans.QueryBean;

/**
 * 通用数据访问对象(BaseDao)接口的缺省适配器
 * @author 骆昊
 *
 * @param <E> 实体类型
 * @param <K> 实体标识字段的类型
 */
public abstract class BaseDaoAdapter<E, K> implements BaseDao<E, K> {

	@Override
	public K save(E entity) {
		return null;
	}

	@Override
	public boolean delete(E entity) {
		return false;
	}

	@Override
	public boolean deleteById(K id) {
		return false;
	}

	@Override
	public boolean update(E entity) {
		return false;
	}

	@Override
	public E findById(K id) {
		return null;
	}

	@Override
	public List<E> findAll() {
		return null;
	}

	@Override
	public PageBean<E> findByPage(int page, int size) {
		return null;
	}

	@Override
	public PageBean<E> findByPage(QueryBean queryBean, int page, int size) {
		return null;
	}
	
}
