package com.springboot.test.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	public static SqlSession getSqlSession(){
		try {
			Reader reader = Resources.getResourceAsReader("Configuration.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			SqlSession sqlSession = sessionFactory.openSession();
			return sqlSession;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
