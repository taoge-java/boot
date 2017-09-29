/**
 * 
 */
package com.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.entity.SystemAdmin;

/**
 * @author taoge
 * @version 1.0
 * @create_at 2017年9月17日下午9:55:42
 */
@Service
public class CurdService {

	@Autowired
	private CurdService curdService;
	
	@Transactional
	public void save(List<SystemAdmin> list){
		curdService.save(list);
	}
}
