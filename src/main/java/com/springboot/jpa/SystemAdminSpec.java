/**
 * 
 */
package com.springboot.jpa;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springboot.entity.SystemAdmin;


/**
 * 条件查询接口
 * @author taoge
 * @version 1.0
 * @create_at 2017年9月17日下午10:02:41
 */
public interface SystemAdminSpec extends JpaSpecificationExecutor<SystemAdmin>{

}
