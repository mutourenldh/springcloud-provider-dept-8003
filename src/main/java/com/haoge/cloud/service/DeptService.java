package com.haoge.cloud.service;
/** 
* @author 李东浩
* @Date：2018年4月29日下午1:19:57
*
*/
import java.util.List;

import com.haoge.cloud.entities.Dept;


public interface DeptService
{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
