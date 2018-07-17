package com.haoge.cloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.haoge.cloud.entities.Dept;

/** 
* @author 李东浩
* @Date：2018年4月29日下午1:18:08
*
*/
@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
