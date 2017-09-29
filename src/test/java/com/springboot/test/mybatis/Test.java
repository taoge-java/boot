package com.springboot.test.mybatis;


import org.apache.ibatis.session.SqlSession;



public class Test {

	public static void main(String[] args) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		UserInfo userInfo = sqlSession.getMapper(UserInfo.class);
		userInfo.getSystemAdmin(2);
//		List<SystemAdmin> list = sqlSession.selectList("queryMessageList",2);
		System.err.println(userInfo.getSystemAdmin(2).getRealName());
	}
}
