package com.springboot.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.entity.SystemAdmin;


@Repository
public interface SystemAdminRepository extends JpaRepository<SystemAdmin, Integer> {
 
	/**
	 * 注意 如果使用hql login_name应对应javabean中的login_name
	 * @param loginName
	 * @return
	 */
	 @Query(value="select * from system_admin where login_name=:loginName",nativeQuery=true)  
	 public List<SystemAdmin> findByLoginName(@Param("loginName") String loginName);  
	 
}
