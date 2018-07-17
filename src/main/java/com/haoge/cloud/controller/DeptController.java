package com.haoge.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.haoge.cloud.entities.Dept;
import com.haoge.cloud.service.DeptService;

/** 
* @author 李东浩
* @Date：2018年4月29日下午1:23:23
*
*/
@RestController
public class DeptController {
	@Autowired
	private DeptService service;
	
	/**
	 * 增加部门的方法
	 * @param dept
	 * @return
	 */
	@RequestMapping(value="/dept/add",method=RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}
	/**
	 * 根据Id查询部门
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
	public Dept get(@PathVariable Long id) {
		return service.get(id);
	}
	/**
	 * 查询部门列表
	 * @return
	 */
	@RequestMapping(value="/dept/list",method=RequestMethod.GET)
	public List<Dept> get() {
		System.out.println(8001);
		return service.list();
	}
	//服务发现模块
	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery()
	{
		List<String> list = client.getServices();//查询eureka中的服务都有哪些
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}

}
