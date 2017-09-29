/**
 * 
 */
package com.springboot.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.SystemAdmin;


/**
 * 分页接口
 * @author taoge
 * @version 1.0
 * @create_at 2017年9月17日下午9:35:32
 */
@Repository
public interface SystemAdminPage extends PagingAndSortingRepository<SystemAdmin, Integer>{

}
