package io.stream;

import java.io.Serializable;

/**
 * 员工类
 * @author Administrator
 *
 */
class Emp implements Serializable{    //要想序列化一个类，必须首先实现序列化接口
	
	private String id;
	private transient String name;    //transient,表示该属性不会被序列化
	private Double salary;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}

