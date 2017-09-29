/**
 * 
 */
package com.springboot.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zengjintao
 * @version 1.0
 * @create_at 2017年9月27日下午8:03:45
 */
public class WebAppConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(new ViewInterceptor());
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		 //配置静态资源路径
	     registry.addResourceHandler("/resource/**").addResourceLocations("classpath:/resource/");
	}
}
