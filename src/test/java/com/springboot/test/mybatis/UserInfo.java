package com.springboot.test.mybatis;

import org.apache.ibatis.annotations.Select;

public interface UserInfo {
	
	@Select("select * from system_admin where id = #{id}")
	public SystemAdmin getSystemAdmin(int id);
	
}
