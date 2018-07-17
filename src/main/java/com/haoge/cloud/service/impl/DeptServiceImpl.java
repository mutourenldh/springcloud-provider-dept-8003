package com.haoge.cloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haoge.cloud.dao.DeptDao;
import com.haoge.cloud.entities.Dept;
import com.haoge.cloud.service.DeptService;

/** 
* @author 李东浩
* @Date：2018年4月29日下午1:20:56
*
*/
@Service
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptDao dao;

	public boolean add(Dept dept) {
		// TODO Auto-generated method stub
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
}
