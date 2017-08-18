package com.wuyameiju.dao;

import java.sql.SQLException;
import java.util.List;

import com.wuyameiju.beans.PageBean;
import com.wuyameiju.beans.QueryBean;

/**
 * 通用数据访问对象接口
 * @author 骆昊
 *
 * @param <E> 实体类型
 * @param <K> 实体标识字段的类型
 */
public interface BaseDao <E, K> {
	/**
	 * 增加
	 * @param entity 业务实体对象
	 * @return 增加成功返回true否则返回false
	 * @throws SQLException 
	 */
	public K save(E entity) ;
	
	/**
	 * 删除
	 * @param entity 业务实体对象
	 * @return 删除成功返回true否则返回false
	 */
	public boolean delete(E entity) ;
	
	/**
	 * 根据ID删除
	 * @param id 业务实体对象的标识
	 * @return 删除成功返回true否则返回false
	 */
	public boolean deleteById(K id) ;
	
	/**
	 * 修改
	 * @param entity 业务实体对象
	 * @return 修改成功返回true否则返回false
	 */
	public boolean update(E entity) ;
	
	/**
	 * 根据ID查找业务实体对象
	 * @param id 业务实体对象的标识
	 * @return 业务实体对象对象或null
	 */
	public E findById(K id) ;
	
	/**
	 * 查找所有业务实体对象
	 * @return 装所有业务实体对象的列表容器
	 */
	public List<E> findAll();
	
	/**
	 * 分页查找业务实体对象
	 * @param page 页码
	 * @param size 页面大小
	 * @return 当前页的业务实体对象的列表容器
	 */
	public PageBean<E> findByPage(int page, int size);

	/**
	 * 分页查找业务实体对象
	 * @param queryBean 查询条件对象
	 * @param page 页码
	 * @param size 页面大小
	 * @return 当前页的业务实体对象的列表容器
	 */
	public PageBean<E> findByPage(QueryBean queryBean, int page, int size) ;
	
}