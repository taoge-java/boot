/**
 * 
 */
package com.springboot.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;


/**
 * @author zengjintao
 * @version 1.0
 * @create_at 2017年9月27日下午8:09:49
 */
public class DataSourceConfig {

	@Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;


    public  DataSource dataSource() {
		return null;
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(url);
//        dataSource.setUsername(userName);//用户名
//        dataSource.setPassword(password);//密码
//        dataSource.setInitialSize(2);
//        dataSource.setMaxActive(20);
//        dataSource.setMinIdle(0);
//        dataSource.setMaxWait(60000);
//        return dataSource;
    }
}
