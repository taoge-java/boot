/**
 * 
 */
package com.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author taoge
 * @version 1.0
 * @create_at 2017年9月17日下午6:45:06
 */
@Entity
public  class BaseEntity {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//主键注解自增
    private int id;
}
