package com.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.entity.SystemAdmin;
import com.springboot.jpa.SystemAdminPage;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	
	@Autowired
	private SystemAdminPage systemAdminPage;
	
	@Test
	public void contextLoads() {
		Order order = new Order(Direction.DESC, "id");
		Sort sort = new Sort(order);
		//0代表第一页
		Page<SystemAdmin> page = systemAdminPage.findAll(new PageRequest(0, 30,sort));
		System.out.println("页数:"+page.getTotalPages()+1);
		System.out.println(page.getContent());
	}
}
