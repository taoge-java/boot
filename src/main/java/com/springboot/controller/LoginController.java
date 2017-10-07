package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.SystemAdmin;
import com.springboot.jpa.SystemAdminPage;
import com.springboot.jpa.SystemAdminRepository;

/**
 * @author taoge
 * @version 1.0
 * @create_at 2017年9月17日下午5:54:04
 */
@RestController
public class LoginController extends BaseController{

	@Autowired
	private SystemAdminRepository systemAdminRepository;
	
	@Autowired
	private SystemAdminPage systemAdminPage;
	
	@SuppressWarnings("unused")
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/")
	@ResponseBody
	public void index(){
		//排序
		Order order = new Order(Direction.DESC, "id");
		Sort sort = new Sort(order);
		//0代表第一页
		Page<SystemAdmin> page = systemAdminPage.findAll(new PageRequest(0, 30,sort));
		System.out.println(page.getTotalPages()+1);
		System.out.println(page.getContent());
		systemAdminRepository.findByLoginName("java");
	}
}
