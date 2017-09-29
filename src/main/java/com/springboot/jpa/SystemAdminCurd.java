/**
 * 
 */
package com.springboot.jpa;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.SystemAdmin;


/**
 * curd接口
 * @author taoge
 * @version 1.0
 * @create_at 2017年9月17日下午9:52:50
 */
public interface SystemAdminCurd extends CrudRepository<SystemAdmin, Integer>{

}
